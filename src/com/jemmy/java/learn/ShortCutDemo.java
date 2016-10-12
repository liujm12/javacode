package com.jemmy.java.learn;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ShortCutDemo {
	public static void main(String[] args) {
		// ShortCutDemo scd = new ShortCutDemo();
		// int result = scd.add(10,200);

		int result = ShortCutDemo.add(11, 34);
		System.out.println(result);

		System.out.println(new ShortCutDemo().radeom());

		String str = "abcdefghijklmnopqrst";
		String str2 = "abcdefghijklmnopqrst";

		boolean strcut = str.equals(str2);
		Integer test = 100;
		List list = null;
		Set set = null;

		System.out.println(strcut);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public double radeom() {
		double result = Math.random();
		return result;

	}

}
