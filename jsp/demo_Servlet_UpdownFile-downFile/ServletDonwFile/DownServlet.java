package com.cn;

import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res){

		InputStream ins = null;
		OutputStream out = null;
		int fileByteLen = 0;
		byte[] buf = null;
		try{
		res.setCharacterEncoding("UTF-8"); 
		res.setContentType("application/force-download");
		res.setHeader("Content-Length", String.valueOf(fileByteLen));
//		res.setContentType("text/x-msdownload");
		res.addHeader("Content-Disposition","attachment; filename="+ new String("张宇 - 雨一直下.mp3".getBytes(),"iso8859-1"));
		//读取服务器本地文件
		
//			ins = new FileInputStream("E:/KuGou/张宇 - 雨一直下.mp3");
			ins = getServletContext().getResourceAsStream("E:/KuGou/张宇 - 雨一直下.mp3");
			fileByteLen = ins.available();
			buf = new byte[fileByteLen];
			out = res.getOutputStream();
			int count = 0;
			while((count=ins.read(buf))!=-1){
				out.write(buf, 0, count);
			}
			ins.close();
			out.close();
		}catch(Exception e){
			
		}
	}
}
