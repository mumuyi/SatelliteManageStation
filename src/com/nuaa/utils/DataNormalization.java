package com.nuaa.utils;

public class DataNormalization {
	public double Normalization(String parameterName,double temp){
		if(parameterName.equals("yjs087")){
			temp/=10;
		}
		return temp;
	}
	
	public double antiNormalization(String parameterName,double temp){
		if(parameterName.equals("yjs087")){
			temp*=10;
		}
		return temp;
	}
}
