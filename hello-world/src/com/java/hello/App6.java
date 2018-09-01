package com.java.hello;

public class App6 {

	public static void main(String[] args) {
		//
		Service6 s6=new Service6(10);
		
	}
}

class Service6 {
	
	Service6()
	{
		// pasted non static blocks
		System.out.println("constructor");
	}
	
	Service6(int x)
	{
		// non static blocks
		System.out.println(x);
	}
	{
		System.out.println("non static block 1");
	}

	{
		System.out.println("non static block 2");
	}

}
