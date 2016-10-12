package com.jemmy.java.learn;

public class StringDemo {
	public static void main(String[] arg) {
		buildString();
		getStringInfo();
		stringCompare();
	}

	private static void stringCompare() {
		System.out.println("ABC".equals("abc"));
		System.out.println("ABC".equalsIgnoreCase("abc"));
	}

	private static void getStringInfo() {
		String str = "Iloveyou";
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("lo"));
		System.out.println(str.indexOf("ey"));

	}

	private static void buildString() {
		char[] cs = new char[] { 'A', 'B', 'C' };

		String str = new String(cs);
		System.out.println(str);
		char[] cs1 = str.toCharArray();
		System.out.println(cs1[1]);
		System.out.println(new String("abc".getBytes()));
	}

}
