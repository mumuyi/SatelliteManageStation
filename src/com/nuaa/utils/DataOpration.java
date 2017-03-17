package com.nuaa.utils;

public class DataOpration {
	// byte[] 转long; 0是低位,7是高位;
	public static long Table14Opration(byte[] temp) {
		return Long.parseLong(DataOpration.HexToString(temp)); 
	}

	public static String HexToString(byte[] b) {
		String res = "";
		for (int i = 0; i < b.length; i++) {
			String hex = Integer.toHexString(b[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			res += hex.toUpperCase();
		}
		return res;
	}
}
