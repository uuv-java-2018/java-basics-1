package com.java.hello;

public class App7 {

	// without object creation
	// static blocks
	// main method
	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("loading class");
		Class.forName("com.java.hello.Service7"); // static blocks executed
		System.out.println(" call next---");
		Service7 s7 = new Service7(); // non static block + constructor

		System.out.println(" execute next--------");
		Service7 s78 = new Service7();// non static block + constructor

	}
}

class Service7 {
	Service7() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}

	Service7(int x) {
		System.out.println(x);
	}

	static { // one time activity
		System.out.println("static block 1");
	}

	static {
		System.out.println("static block 2");
	}

	{// for every time you create object
		System.out.println("non static block 1");
	}
	{
		System.out.println("non static block 2");
	}
}
