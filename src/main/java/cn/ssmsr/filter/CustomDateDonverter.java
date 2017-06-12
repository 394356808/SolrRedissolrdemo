package cn.ssmsr.filter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 日期转换
 * @author yyao
 *
 */
//传入String类型转成Date类型
public class CustomDateDonverter implements Converter<String,Date>{

	public Date convert(String source) {
		// TODO Auto-generated method stub
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try{
			//转换成功直接返回
			return simpleDateFormat.parse(source);
		}catch(ParseException e){
			e.printStackTrace();
		}
		//如果不成功返回为null
		return null;
	}

}
