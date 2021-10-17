package com.bl.generics;

public class FindMaxValue {
	public static String maxOfString(String s1, String s2, String s3) {
		String max = s1;
		if (s2.compareTo(max) > 0)
			max = s2;
		if (s3.compareTo(max) > 0)
			max = s3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("The maximum value between the three string is : " + maxOfString("abc", "pqr", "xyz"));
	}
}
