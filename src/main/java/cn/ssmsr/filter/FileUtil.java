package cn.ssmsr.filter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtil {
	/**
	 * 正则表达式判断是否为数字
	 * @param str
	 * @return
	 */
	public boolean isNumeric(String str){ 
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   try{
		   Matcher isNum = pattern.matcher(str);
		   
		   if( !isNum.matches() ){
		       return false; 
		   } 
		   }catch(Exception e){
			   return false;
		   }
		   return true; 
		}
}
