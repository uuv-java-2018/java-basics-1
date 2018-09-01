package com.java.hello;

public class App4 {

	public static void main(String[] args) {
		
		new Service4();
		new Service4(100);
		
		int x; // x is variable is of int type
		x=10;
		char y;// y is variable of char type
		y='a';
		
		Service4 s4;// s4 is a variable is of Service4 Type
		s4=new Service4();
		
		s4=new Service4(10);
		
		x=10;
		
		s4=new Service4(100);
		
		Service4 s44=new Service4();
		Service4 s45=new Service4(1000);
		
		Service4 s46=null;
		s46=new Service4();
		s46.sayHello();
		
		new Service4().sayHello();
	}
}

class Service4
{
	// not even void return type
	// name same as class name
	// 
	
	Service4()// default constructor
	{
		System.out.println("Constructor");
	}
	
	Service4(int x) // parametrized constructor
	{
		System.out.println(x);
	}
	
	public void sayHello() // method
	{
		System.out.println("SayHello");
	}
}
