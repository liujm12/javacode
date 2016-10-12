package com.jemmy.java.learn;

public class StringBuilderDemo {
	public static void main(String[] arg) {
		
		long timestart = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("abcdefghij");
		long timeend = System.currentTimeMillis();
		System.out.println(timeend -timestart);
		System.out.println(sb.append("123"));

		try {
			StringBuilder sbn = new StringBuilder(10);
			sbn.append("abcdddefetesttesttestteset");
			System.out.println(sbn);
			sbn.append("testabcd");
			System.out.println(sbn);
			System.out.println(sbn.capacity());
			System.out.println(sbn.length());
			System.out.println(sbn.delete(2, 30));
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}
