package com.test;
import com.real.*;
public class HelloTest extends GoodWorld{

	public int a =50;
	String name ="Hello";
	
	public void runMe(){
	
		System.out.println(super.name);
		super.runMe();
		System.out.println("Hello Test value a is "+a);
		
		System.out.println("Good world value a is "+super.a);
		
	}
	

	
	public HelloTest() {
		super();
		System.out.println("Am in Hello Test Constructor");
		// TODO Auto-generated constructor stub
	}

	}
