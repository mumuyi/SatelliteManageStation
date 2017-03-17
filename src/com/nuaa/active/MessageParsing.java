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
			
			
			//数据解析开始;
			for(int j=0;j<list.size();j++){
				Parameter parameter=(Parameter)list.get(j);
				//数据对齐和跳过表头操作;
				if(parameter.getName().equals("jump")){
					pointer+=parameter.getLength();
					System.out.println("jump  "+parameter.getLength());
				}
				//Table 14 对于时间的操作;
				else if(parameter.getOpration()==14){
					byte[] temp=new byte[parameter.getLength()];
					for(int m=0;m<parameter.getLength();m++){
						temp[m]=filebt[pointer+m];
					}
					Long tempL=DataOpration.Table14Opration(temp);
					System.out.println(""+tempL);
					pointer+=parameter.getLength();

					//break;
				}
			}
		}

	}
}
