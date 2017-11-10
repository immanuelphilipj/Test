package com.real;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld extends GoodWorld {

/*	public void AmHello(){
		System.out.println("am in method HelloWorld");
	}
	protected HelloWorld(){
		
	}
	HelloWorld(int a)
	{
		System.out.println("value is"+a);

	}
	protected void getMe(){
		System.out.println("Am in HelloWorld");
	}*/
	public static void main(java.lang.String[] args){
		HelloWorld hw = new HelloWorld();
		ArrayList<String> ab = hw.goodJob();
		for(String t:ab){
			System.out.println(t);
		}
		Map<Integer, String> map = hw.myMap();
	  //  Map.Entry<Integer, String> ab = map.entrySet();
		System.out.println("My value at 1 is "+map.get(1));
		System.out.println("My value at 2 is "+map.get(2));
		
		for(Map.Entry<Integer, String> tes : map.entrySet()){
			System.out.println(tes.getKey() +"----"+tes.getValue());
		}
		
		for(Integer mymap: map.keySet()){
			
			System.out.println("----"+mymap.intValue());
		}
	}

	public ArrayList<String> goodJob(){
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("manu");
		return al;
	}
	
	public Map<Integer,String> myMap(){
	
		Map<Integer, String> map = new HashMap<Integer,String>();
		
		map.put(1, "Immanue");
		map.put(2, "Tester");
		return map;
	}
}
