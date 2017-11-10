package devi;

public class Test1 { 
	int age;
	String nm;
	public static void main(String[] args){
		Test1 t=new Test1(29,"Bijosh");
		t.run();
		
	}
	Test1(int age,String nm){
		this.age=age;
		this.nm=nm;
	}
	void run(){
		boolean a=true;
		System.out.println(age+nm+a);
		String S="name";
		switch(S)
		{
		case "name":
			System.out.println("name is Devi");
		case "nm":
			System.out.println("name");
			break;
		default:
			System.out.println("default");
		}
		
	}

}
