package com.nuaa.utils;

public class DataOpration {
	// 表14操作;
	public static int Table14Opration(byte[] filebt, int pointer, int length) {
		byte[] temp = new byte[length];
		for (int m = 0; m < length; m++) {
			temp[m] = filebt[pointer + length-1-m];
		}
		//return Long.parseLong(DataOpration.HexToString(temp));
		return DataOpration.byteToint(temp);
	}

	// 16进制byte转String;
	public static String HexToString(byte[] temp) {
		String res = "";
		for (int i = 0; i < temp.length; i++) {
			String hex = Integer.toHexString(temp[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			res += hex.toUpperCase();
		}
		return res;
	}

	// 表15操作;
	public static String Table15Opration(byte temp) {
		if (temp == (byte) 0x00) {
			return "箭上准备";
		} else if (temp == (byte) 0x01) {
			return "姿态控制";
		} else if (temp == (byte) 0x04) {
			return "对地成像";
		} else if (temp == (byte) 0x08) {
			return "地面测试";
		} else if (temp == (byte) 0x01) {
			return "最小系统";
		} else {
			return "error";
		}
	}

	// 判断byte某一位是否为0;
	public static boolean CheakBit(byte temp, int location) {
		if (location == 0) {
			temp = (byte) (temp & (byte) 0x01);
		} else if (location == 1) {
			temp = (byte) (temp & (byte) 0x02);
		} else if (location == 2) {
			temp = (byte) (temp & (byte) 0x04);
		} else if (location == 3) {
			temp = (byte) (temp & (byte) 0x08);
		} else if (location == 4) {
			temp = (byte) (temp & (byte) 0x10);
		} else if (location == 5) {
			temp = (byte) (temp & (byte) 0x20);
		} else if (location == 6) {
			temp = (byte) (temp & (byte) 0x40);
		} else if (location == 7) {
			temp = (byte) (temp & (byte) 0x80);
		}

		if (temp == (byte) 0x00)
			return false;
		else
			return true;
	}

	// 0x00和0x33的判断;
	public static boolean CheakByte(byte temp) {
		if (temp == (byte) 0x00)
			return false;
		else
			return true;
	}

	public static double Table17Opration(byte[] temp) {
		double ans=0.0;
		
		byte[] temp1=new byte[4];
		temp1[0]=temp[0];
		temp1[1]=temp[1];
		temp1[2]=(byte)0x00;
		temp1[3]=(byte)0x00;
		
		if((temp[1]&(byte)0x80)==(byte)0x00){//首位为0
			//System.out.println("22222222222          "+DataOpration.byteToint(temp1));
			ans=(5.0*DataOpration.byteToint(temp1)+1.024)/2048;
		}
		else{//首位为1
			temp1[3]=(byte)0x80;
			//12位取补码操作;
			temp1[1]=(byte) ~temp[1];
			temp1[1]=(byte) (temp1[1]&0x0F);
			temp1[0]=(byte) ~temp[0];
			temp1[0]+=1;
			if(temp1[0]==(byte)0x00){
				temp1[1]+=1;
			}
			ans=-1.0*(5*DataOpration.byteToint(temp1)+1.024)/2048;
		}
		
		return ans;
	}

	//byte[] 转int
	public static int byteToint(byte[] res) {
		// 一个byte数据左移24位变成0x??000000，再右移8位变成0x00??0000
		int targets=0;
		if(res.length==4){
			targets = (res[0] & 0xff) | ((res[1] << 8) & 0xff00) // | 表示安位或
					| ((res[2] << 24) >>> 8) | (res[3] << 24);
		}
		else if(res.length==2){
			targets = (res[0] & 0xff) | ((res[1] << 8) & 0xff00); // | 表示安位或
		}
		else if(res.length==1){
			targets = (res[0] & 0xff); // | 表示安位或
		}
		return targets;
	}
	
	public static double Table16Opration(byte temp){
		double ans=0.0;
		byte[] temp1=new byte[2];
		if((temp&(byte)0x80)==(byte)0x00){//首位为0;
			//System.out.println("111111");
			temp1[1]=(byte) (temp>>4);
			temp1[0]=(byte) (temp<<4);
			ans=(5.0*DataOpration.byteToint(temp1)+1.024)/2048;
		}else{//首位为1;
			//8位取补码操作;
			temp=(byte) ~temp;
			temp+=1;
			
			temp1[1]=(byte) (temp>>4);
			temp1[0]=(byte) (temp<<4);
			ans=-1.0*((5.0*DataOpration.byteToint(temp1)+1.024))/2048;
		}
		return ans;
	}
}
