package com.java.hello;

public class App5 {

	static int x;

	public static void main(String[] args) {

		if (x > 10) {
			System.out.println("Main");
		} else {
			System.out.println("Not > 10");
		}
	}

	// static block executed during the class loading
	static {
		// create some file// wriet to that file
		x=100;
		System.out.println("Static Block1");
	}
	static {
		System.out.println("Static Block2");
	}
}
