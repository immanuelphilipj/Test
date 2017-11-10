package basics;

import java.util.HashMap;
import java.util.Map;

public class TestMyMap {

	
	public static void main(String[] args){
		
		Map<Integer, TestMe> map = new HashMap<Integer, TestMe>();
		
		TestMe t1 = new TestMe(20, "Tester");
		TestMe t2 = new TestMe(30, "Cool Tester");
		
		map.put(1, t1);
		map.put(2, t2);
		
		for(Map.Entry<Integer, TestMe> ob : map.entrySet()){
			
			int key = ob.getKey();
			TestMe b = ob.getValue();
			System.out.println(key +" Details ");
			System.out.println(b.age+" Age and Name "+b.name);
			
		}
		
	}

}


class TestMe{

	int age;
	String name;
	public TestMe(int age, String name){
		
		this.age = age;
		this.name = name;
	}

}
