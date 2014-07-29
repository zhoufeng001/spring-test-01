package com.spring.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.junit.Test;

public class Test02 {

	public String getHtml(){
		StringBuilder html = new StringBuilder() ;
		BufferedReader reader = null ;
		try {
			reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(new File("C:/Users/Administrator/Desktop/111.txt")),Charset.forName("GBK")
					)) ;
			String line = null ;
			while((line = reader.readLine()) != null){
				html.append(line).append("\n");
			}  
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}finally{
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
			}
		}
		
		return html.toString() ;

	}

	@Test
	public void test01(){
		String rexg = "(?is)(<script[^>]*?/>)|(<script.*?</script>)" ;

		String html = "fdas<script src=\"http://static.blog.csdn.net/scripts/jquery.js\" type=\"text/javascript\" />\n<script type=\"text/javascript\" src=\"http://static.blog.csdn.net/scripts/ad.js?v=1.1\"></script>xxx";
		
		html = getHtml() ;
		
		System.out.println(html.replaceAll(rexg, "")); 

	}
	
	
	@Test
	public void test02(){
		
		String str = "\nab";
		
		System.out.println(str.matches("(?s).*?a.*"));
		
		
		
	}

}
