package com.real;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GoodWorld extends TestClassType{
	
	public static void main(String[] args) throws Exception{
		
		Class<HelloWorld> hw = HelloWorld.class;
	    System.out.println(hw.getName());
		Class<?> ht = Class.forName("HelloWorld");
	    
	    
		HelloWorld world = new HelloWorld();
	
		if(hw.isInstance(world)){
			System.out.println("Yes they are");
		}
	
	}
	
	

	protected String name ="Good";
	public int a =100;
	public void runMe(){
		System.out.println("Am in Good World");
	}
	
	public GoodWorld() {
		System.out.println("Am in Good World constructor");
		// TODO Auto-generated constructor stub
	}

	void testSet(){
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "test");
		map.put(2, "tester2");
		

		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	void testMap(){
		 Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
/*		  for(Map.Entry<Integer,String> m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  } 
*/		  Set<Map.Entry<Integer, String>> aa = map.entrySet();
		  Iterator<Entry<Integer, String>> ab = aa.iterator();
		  while(ab.hasNext()){
			  System.out.println("Inside dictornay"+ab.next());
		  }
		  

		  for(Map.Entry<Integer,String> m: map.entrySet()){
			  System.out.println(m.getKey()+"------"+m.getValue());
		  }
		  
		  
	}

}
