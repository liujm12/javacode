package com.jemmy.java.learn;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args){
		String[] str = new String[5];
		Arrays.fill(str, "abc");
		Arrays.fill(str,2,3,"bbb");
		
		System.out.println(str.toString());
		for(int i = 0;i < 5; i++){
			System.out.println(str[i]);
		}
	}

}
