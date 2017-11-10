package devi;

public class Test {
	int age;
	String name;
	public static void main(String[] args){
		Test s=new Test(20);
		Test n=new Test("Devi");
		s.age();
		n.name();
	
	}
	Test(int age){
		this.age=age;
		
	}
	Test(String name){
		
		this.name=name;
	}
  void age(){
 System.out.println(age);
  }
  void name(){
	  System.out.println(name);
  }
  
	
	public Test(){
		
	}

}
