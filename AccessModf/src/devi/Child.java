package devi;

public class Child extends parent {
	Child(){
		super();
		System.out.println("Child Class");
	}
public static void main(String[] s){
	Child c=new Child();
	System.out.println(c.run(15));

	}
}
