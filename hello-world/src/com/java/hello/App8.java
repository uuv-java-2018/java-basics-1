package com.java.hello;

public class App8 {

	public static void main(String[] args) {

		//Service8.m1();
		
		//Service8 s81=new Service8();
		//s81.m1();
		
		Service8 s82=null;
		s82.m1();
	}
}

class Service8 {
	static {
		System.out.println("static block 1");
	}

	{
		System.out.println("non static block 1");
	}

	Service8() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}

	public static void m1() {
		System.out.println("m1()");
	}
}