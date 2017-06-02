package com.nuaa.active;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nuaa.entiy.FrameData;
import com.nuaa.entiy.MyHibernate;
import com.nuaa.entiy.Parameter;
import com.nuaa.utils.DataOpration;

public class ThresholdJudgment {
	
	public Map<String, String> Judgment(FrameData framedata,List<?> parameterlist) throws Exception{
		Class<? extends FrameData> myclass = framedata.getClass();
		double d=0;
		double from=0;
		double to=0;
		Map<String, String> ansmap = new HashMap<String, String>();
		for(int i=0,j=0;i<parameterlist.size();i++){
			Parameter parameter=(Parameter)parameterlist.get(i);
			if(DataOpration.getJudgmentData(parameter.getName())){
				Method m = (Method) myclass.getMethod("get" + DataOpration.captureName(parameter.getName()));
				String temp="";
				temp +="" + (m.invoke(framedata));
				d=Double.valueOf(temp).doubleValue();
				from=Double.valueOf(parameter.getRangeFrom()).doubleValue();
				to=Double.valueOf(parameter.getRangeTo()).doubleValue();
				if((d<from||d>to)&&getCondition(parameter.getName())){
					ansmap.put("name"+j, parameter.getCname());
					ansmap.put("sorttype"+j, ""+(parameter.getSort()-4));
					ansmap.put("sorttype1"+j, ""+parameter.getSort1());
					j++;
					System.out.println(parameter.getName()+"    "+temp+"      "+d);
				}
			}
		}
		return ansmap;
	}
	
	public boolean getCondition(String name){
		return true;
	}
	
	
	public static void main(String[] args) throws Exception{
		List<?> framedata=MyHibernate.sqlQuery(0, 200, "from FrameData");
		List<?> parameter=MyHibernate.sqlQuery(0, 400, "from Parameter");
		ThresholdJudgment tj=new ThresholdJudgment();
		for(int i=0;i<200;i++){
			tj.Judgment((FrameData)framedata.get(i),parameter);
		}
		
		System.out.println("Done");
	}
}
