package cn.ssmsr.filter;
/**
 * 传入string转成两位小数的double
 */



import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.core.convert.converter.Converter;

public class CustomDoubleDonverter implements Converter<String,BigDecimal>{

	public BigDecimal convert(String arg0) {
		System.out.println(arg0);
		BigDecimal bd=new BigDecimal(arg0);
		bd=bd.setScale(2,RoundingMode.HALF_UP);
		// TODO Auto-generated method stub
		return bd;
	}

}
