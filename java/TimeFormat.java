package com.Learning;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateTimeStr = simpledateformat.format(date);		
		System.out.println(dateTimeStr);
	}

}
//http://www.cnblogs.com/yuxuan/archive/2011/07/25/2116250.html
