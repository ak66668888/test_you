package com.test_you;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class UrlEncodeExchange {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		//String str = "2017%E5%B9%B41%E6%9C%881%E6%97%A5%E8%87%B32017%E5%B9%B49%E6%9C%8824%E6%97%A5";
		String str = "888888";
		//需要编码的字符串
		String str_before = "2017年1月1日至2017年9月24日";
		//需要解码的字符串
		String str_after = "2017%E5%B9%B41%E6%9C%881%E6%97%A5%E8%87%B32017%E5%B9%B49%E6%9C%8824%E6%97%A5";
		byte[] utf_str = str.getBytes("ISO8859-1");
		byte[] utf_gbk = str.getBytes("gbk");
		byte[] utf_utf = str.getBytes("utf-8");
		System.out.println(Arrays.toString(utf_str));
		System.out.println(Arrays.toString(utf_gbk));
		System.out.println(Arrays.toString(utf_utf));
		
		String s1 = new String(utf_utf, "UTF-8");
		String s2 = new String(utf_utf, "GBK");
		String s3 = new String(utf_gbk, "UTF-8");
		//解码方法失败了    ：String s6 = new String(str_after.getBytes(), "UTF-8");
		
	    //字符串编码
		String s4 = URLEncoder.encode(str_before, "GBK");
		String s6 = URLEncoder.encode(str_before, "utf-8");
		//字符串解码
		String s5 = URLDecoder.decode(str_after, "utf-8");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		//js端加码，后端解码
		//var adf = encodeURI(encodeURI("月份"));%25E6%259C%2588%25E4%25BB%25BD
		//var adf = encodeURI(encodeURI("2017年8月"));2017%25E5%25B9%25B48%25E6%259C%2588
	}

}
