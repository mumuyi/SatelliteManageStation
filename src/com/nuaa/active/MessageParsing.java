package com.nuaa.active;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MessageParsing {
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

	public static boolean cheakHeader(byte[] buf){
		if(buf.length<4){
			System.out.println("Data length is not enough");
			return false;
		}
		if(buf[0]==(byte)0x1A&&buf[1]==(byte)0xCF&&buf[2]==(byte)0xFC&&buf[3]==(byte)0x1D){
			System.out.println("Data header cheaked");
			return true;
		}else{
			System.out.println("Data header located false");
			return false;
		}
	}
	
	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\ai\\Desktop\\data\\20111123.dat");
		FileInputStream fin = new FileInputStream(file);
		byte[] filebt = MessageParsing.readStream(fin, 0, 673);
		if (MessageParsing.cheakHeader(filebt)) {
		
			if(filebt[5]==0x40){
				System.out.println("This is a picture frame");
			}else if(filebt[5]==0x7F){
				System.out.println("This is a empty frame");
			}else{
				System.out.println("This is a data frame");
			}
		}
	}
}
