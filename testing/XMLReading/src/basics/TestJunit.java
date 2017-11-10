package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class A{
	
}
class B extends A{
	
}

class MyTest extends B implements Comparable{
	
	int age;
	String name;
	public MyTest(int age, String name){
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}


public class TestJunit {


	public static void main(String args[]){
		
		List<MyTest> list = new ArrayList<MyTest>();
		
		MyTest b1 = new MyTest(32, "Immanuel");
		MyTest b2 = new MyTest(28,"Feba");
		MyTest b3= new MyTest(1,"Jaden");
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		Iterator<MyTest> iter = list.iterator();
		
		ListIterator<MyTest> lisIter = list.listIterator();
		
		while(lisIter.hasNext()){
			System.out.println("Employee age is "+lisIter.next().age+" Name is "+lisIter.next().name);			
		
		}
		while(lisIter.hasPrevious()){
			System.out.println("Inside previous");
			System.out.println("Employee age is "+lisIter.previous().age +" Name is "+lisIter.previous().name);
			
		}
/*
		while(iter.hasNext()){
			System.out.println("Employee is "+iter.next().age+" Name is "+iter.next().name);
		}
*/		
/*		for(MyTest comp:list){
			System.out.println("My age is "+comp.age+"My name is "+comp.name);
		}
*/		
		for (MyTest myTest : list) {
			
		}
		
	}

}
