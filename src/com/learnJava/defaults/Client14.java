package com.learnJava.defaults;

public class Client14 implements Interface1, Interface4 {

//	@Override
//	public void methodA() {
//		// TODO Auto-generated method stub
//		Interface1.super.methodA();
//	}
	
	
	
	
	public void methodA() {  // overriding the default method in the implementation class
		
		System.out.println("Inside method A " + Client14.class);
	}
	
	
	
	public static void main(String[] args) {
		
		Client14 client14 = new Client14();
		client14.methodA();
	}
}
