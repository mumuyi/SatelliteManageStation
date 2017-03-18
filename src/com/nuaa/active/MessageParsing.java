package com.nuaa.active;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import com.nuaa.entiy.MyHibernate;
import com.nuaa.entiy.Parameter;
import com.nuaa.utils.DataOpration;

public class MessageParsing {
	
	private static File file;
	private static FileInputStream fin;
	private static List<?> list;
	private static int pointer=0;
	
	
	/**
	 * 读取流
	 * 
	 * @param inStream
	 * @return 字节数组
	 * @throws Exception
	 */
	public static byte[] readStream(InputStream inStream, int off, int len) throws Exception {
		ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];

		inStream.read(buffer, off, len);
		outSteam.write(buffer, 0, len);

		outSteam.close();
		//inStream.close();
		return outSteam.toByteArray();
	}

	public static boolean cheakHeader(byte[] buf,int i){
		if(buf.length<4){
			System.out.println("Data length is not enough");
			return false;
		}
		if(buf[0]==(byte)0x1A&&buf[1]==(byte)0xCF&&buf[2]==(byte)0xFC&&buf[3]==(byte)0x1D){
			//System.out.println("Data header cheaked");
			if(buf[4]==(byte)0x65){
				if(buf[5]==0x40){
					//System.out.println(i+" This is a picture frame");
					return false;
				}else if(buf[5]==0x7F){
					//System.out.println(i+" This is a empty frame");
					return false;
				}else{
					System.out.println(i+" This is a data frame");
					//跳过下行数据头部;
					pointer+=11;
					//跳过M_PDU头部;
					pointer+=2;
					//跳过E_PDU头部;
					pointer+=6;
					return true;
				}
			}else{
				//System.out.println("版本号和航天器识别号出错");
				return false;
			}
		}else{
			//System.out.println("Data header located false");
			return false;
		}
	}
	
	public static void main(String[] args) throws Exception {
		//指定文件,获取输入流;
		file = new File("C:\\Users\\ai\\Desktop\\data\\20111123.dat");
		fin = new FileInputStream(file);
		//获取属性表;
		list=MyHibernate.sqlQuery(0, 300, "from Parameter");
		
		//报文解析开始;
		for(int i=0;i<50;i++){
			//取一帧673字节数据;
			byte[] filebt = MessageParsing.readStream(fin, 0, 673);
			pointer=0;
			//检查头部;
			if (!MessageParsing.cheakHeader(filebt,i)) {
				//头部不对,则跳过,取下一帧;
				continue;
			}
			
			//if(filebt[pointer]==(byte)0xEB&&filebt[pointer+1]==(byte)0x90&&filebt[pointer+2]==(byte)0x95&&filebt[pointer+3]==(byte)0x00){
			//	System.out.println("sdhkjashdaksjdhiwuqdhjakshdjkashdjkashdkjsahdkjsahdjk");
			//}
			//System.out.println(DataOpration.HexToString(filebt));
			//System.exit(0);
			
			//数据解析开始;
			for(int j=0;j<list.size();j++){
				Parameter parameter=(Parameter)list.get(j);
				//数据对齐和跳过表头操作;
				if(parameter.getName().equals("jump")){
					pointer+=parameter.getLength();
					System.out.println(j+": jump  "+parameter.getLength());
				}
				//星上时间;
				else if(parameter.getOpration()==14){
					Long tempL=DataOpration.Table14Opration(filebt,pointer,parameter.getLength());
					System.out.println(j+": "+tempL);
					pointer+=parameter.getLength();
					//break;
				}
				//控制模式信息;
				else if(parameter.getOpration()==15){
					String str=DataOpration.Table15Opration(filebt[pointer]);
					System.out.println(j+": "+str);
					pointer+=parameter.getLength();
					//break;
				}
				//bit-boolean-String;
				else if(parameter.getOpration()==18){
					byte temp=filebt[pointer];
					if(DataOpration.CheakBit(temp, parameter.getLength()-10)){
						System.out.println(j+": "+parameter.getRangeTo());
					}else{
						System.out.println(j+": "+parameter.getRangeFrom());
					}
					//数据对齐;
					if(parameter.getLength()==10){
						pointer+=1;
					}
				}
				//直接显示;
				else if(parameter.getOpration()==19){
					byte[] temp=new byte[parameter.getLength()];
					for(int m=0;m<parameter.getLength();m++){
						temp[m] = filebt[pointer + m];
					}
					String str=DataOpration.HexToString(temp);
					System.out.println(j+": "+str);
					
					pointer+=parameter.getLength();
				}
				//byte-String;
				else if(parameter.getOpration()==21){
					byte temp=filebt[pointer];
					if(DataOpration.CheakByte(temp)){
						System.out.println(j+": "+parameter.getRangeTo());
					}else{
						System.out.println(j+": "+parameter.getRangeFrom());
					}
					
					pointer+=parameter.getLength();
				}
				//组号,帧计数;
				else if(parameter.getOpration()==35){
					//暂时不做;
					if(parameter.getLength()==200)
						pointer+=1;
				}
				//磁强计A B;
				else if(parameter.getOpration()==171||parameter.getOpration()==172||parameter.getOpration()==173){
					byte[] temp=new byte[2];
					temp[1]=filebt[pointer];
					temp[0]=filebt[pointer+1];
					
					double ans=DataOpration.Table17Opration(temp);
					//System.out.println("      !!!!        "+ans);
					if(parameter.getOpration()==171){
						ans=ans/79.4*1000000;
					}else if(parameter.getOpration()==172){
						ans=ans/79.9*1000000;
					}else if(parameter.getOpration()==173){
						ans=ans/80.0*1000000;
					}
					
					System.out.println(j+": "+ans);
					
					pointer+=parameter.getLength();
				}
				//卫星遥测;
				else if(parameter.getOpration()==22||parameter.getOpration()==23||parameter.getOpration()==24){
					byte[] temp=new byte[2];
					temp[1]=filebt[pointer];
					temp[0]=filebt[pointer+1];
					int tempans=DataOpration.byteToint(temp);
					double ans=0.0;
					if(parameter.getOpration()==22){
						ans=tempans*360/65536; 
					}else if(parameter.getOpration()==23){
						ans=tempans*30/32768;
					}else if(parameter.getOpration()==24){
						ans=tempans*2;
					}
					System.out.println(j+": "+ans);
					pointer+=parameter.getLength();
				}
				//轨道解算;
				else if(parameter.getOpration()==20){
					byte[] temp=new byte[4];
					temp[3]=filebt[pointer];
					temp[2]=filebt[pointer+1];
					temp[1]=filebt[pointer+2];
					temp[0]=filebt[pointer+3];
					int ans=DataOpration.byteToint(temp);
					System.out.println(j+": "+ans);
					
					pointer+=parameter.getLength();
				}
				//模拟太敏;
				else if(parameter.getOpration()==16){
					double ans=DataOpration.Table16Opration(filebt[pointer]);
					System.out.println(j+": "+ans);
					
					pointer+=parameter.getLength();
				}
				//GPS输出;
				else if(parameter.getOpration()==25||parameter.getOpration()==26){
					byte[] temp=new byte[4];
					temp[3]=filebt[pointer];
					temp[2]=filebt[pointer+1];
					temp[1]=filebt[pointer+2];
					temp[0]=filebt[pointer+3];
					int tempans=DataOpration.byteToint(temp);
					double ans=0.0;
					if(parameter.getOpration()==25){
						ans=tempans*0.1;
					}else if(parameter.getOpration()==26){
						ans=tempans*0.01;
					}
					System.out.println(j+": "+ans);
					
					pointer+=parameter.getLength();
				}
				//转short;
				else if(parameter.getOpration()==28){
					byte[] temp=new byte[1];
					temp[0]=filebt[pointer];
					int ans=DataOpration.byteToint(temp);
					System.out.println(j+": "+ans);
					
					pointer+=parameter.getLength();
				}
				//电源;
				else if(parameter.getOpration()==161||parameter.getOpration()==162||parameter.getOpration()==163
						||parameter.getOpration()==164||parameter.getOpration()==165||parameter.getOpration()==166
						||parameter.getOpration()==167||parameter.getOpration()==168){
					double ans=DataOpration.Table16Opration(filebt[pointer]);
					if(parameter.getOpration()==161){
						ans*=6.399;
					}else if(parameter.getOpration()==162){
						ans*=0.5988;
					}else if(parameter.getOpration()==163){
						ans*=1.0355;
						ans+=0.005;
					}else if(parameter.getOpration()==164){
						ans*=3;
					}else if(parameter.getOpration()==165){
						ans*=0.6;
					}else if(parameter.getOpration()==166){
						ans*=10.645;
						ans+=0.004;
					}else if(parameter.getOpration()==167){
						ans*=1000;
					}else if(parameter.getOpration()==168){
						ans*=13.5;
						ans/=5;
					}
					System.out.println(j+": "+ans);
					
					pointer+=parameter.getLength();
				}
				//星上计算机;
				else if(parameter.getOpration()==29||parameter.getOpration()==30||parameter.getOpration()==31){
					double ans=DataOpration.Table16Opration(filebt[pointer]);
					if(parameter.getOpration()==29){
						//暂时不处理;
					}else if(parameter.getOpration()==30){
						ans/=3.0;
					}else if(parameter.getOpration()==31){
						//无操作;
					}
					System.out.println(j+": "+ans);
					
					pointer+=parameter.getLength();
				}
				//空置率计算结果;
				else if(parameter.getOpration()==32||parameter.getOpration()==33||parameter.getOpration()==34){
					byte[] temp=new byte[1];
					temp[0]=filebt[pointer];
					int tempans=DataOpration.byteToint(temp);
					double ans=0.0;
					if(parameter.getOpration()==32){
						ans=tempans*0.01/128;
					}else if(parameter.getOpration()==33){
						ans=tempans*5/256;
					}else if(parameter.getOpration()==34){
						ans=tempans*5/128;
					}
					System.out.println(j+": "+ans);
					
					pointer+=parameter.getLength();
				}
				//温度;
				else if(parameter.getOpration()==17){
					byte[] temp=new byte[2];
					temp[1]=filebt[pointer];
					temp[0]=filebt[pointer+1];
					double ans=DataOpration.Table17Opration(temp);
					System.out.println(j+": "+ans);
					
					pointer+=parameter.getLength();
				}
			}
		}

	}
}
