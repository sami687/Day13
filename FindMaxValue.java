package com.bl.generics;

public class FindMaxValue {

	public static Float maxOfFloat(Float f1, Float f2, Float f3) {
		Float max = f1;
		if (f2.compareTo(max) > 0)
			max = f2;
		if (f3.compareTo(max) > 0)
			max = f3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("The maximum value between the three float is : " + maxOfFloat(1.5f, 3.56f, 5.87f));
	}
}
