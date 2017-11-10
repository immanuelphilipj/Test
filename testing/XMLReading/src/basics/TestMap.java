package basics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestMap {
	
	public static void main(String[] args){
		
		TestThrow.validate(20);
/*		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(100, "Immanuel");
		map.put(200, "Test");
		System.out.println(map);
		
		map.remove(200);
		
		System.out.println(map);
		
		
		for(Map.Entry m : map.entrySet()){
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		for(Map.Entry<Integer, String> m: map.entrySet()){
			System.out.println(m.getKey()+" key Value  "+m.getValue());
		}*/
	}

}

class TestThrow{
	   static void validate(int age){  
		     if(age<18)  
		      throw new ArithmeticException("not valid");  
		     else  
		      //System.out.println("welcome to vote");
		    	 throw new NullPointerException("ss");
		   } 
}
