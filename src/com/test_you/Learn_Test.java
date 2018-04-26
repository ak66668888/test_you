package com.test_you;

public class Learn_Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		String qybm = "350000";
		//String qybm = null;	
		//String qybm = "";	
		if (qybm==null) {
			System.out.println("null值");
		}
		if (qybm=="") {
			System.out.println("空值");
		}
		//正确判断非空如下
		if (qybm!=null&&qybm.length()>=6&&qybm!="") {
			System.out.println("length:"+qybm.length());
		}
		if (qybm=="350000") {
			System.out.println(1);
		}
		String type = qybm.getClass().toString();//获取数据类型为"class java.lang.String"
		System.out.println("属性类型类lx："+type);
		
		//字符串截取,后输出
		String str = "a,b,c,,";
		String[] ary = str.split(",");
		System.out.println("\n"+ary);
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);	
		}
	}

}
