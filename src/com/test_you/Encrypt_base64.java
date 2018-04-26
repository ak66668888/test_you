package com.test_you;

import java.io.UnsupportedEncodingException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**对输入的用户密码进行BASE64解码
 * @author YouZL 20171108
 */
public class Encrypt_base64 {

	/**
	 * @param str
	 * @return 编码方法1
	 */
	public static String encodeBase64(String str){
		byte[] b=null;
		String s=null;
		try {
			b = str.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		if (b!=null) {
			s = new BASE64Encoder().encode(b);
		}
		return s;	
	}
	/**
	 * @param s
	 * @return
	 * 解码方法2
	 */
	public static String decodeBase64(String s){
		byte[] b = null;
		String str = null;	
		if (s!=null) {
			BASE64Decoder decoder = new BASE64Decoder();
			try {
				b = decoder.decodeBuffer(s);
				str = new String(b, "utf-8");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return str;	
	}
	
	public static void main(String[] args) {
		//解码方法2:demo
		String str = "888888";
		String base64 = encodeBase64(str);
		System.out.println(base64);
		String s = decodeBase64(base64);
		System.out.println(s);
	}

}
