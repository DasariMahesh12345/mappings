package constructor;

public class ThisMethod {
	String name;
	String address;
	int age;
	int phone;
	
	void show() {
		System.out.println(name+","+address+","+age+","+phone);
	}
	
	ThisMethod(){
	
	}
	
	ThisMethod(String n,String m,int ag,int b) {
		name=n;
		address=m;
		age=ag;
		phone=b;
		System.out.println("4 values are set");
	}
	ThisMethod(String n,String m,int a) {
		this(n,m,a,-1);
		System.out.println("3 values are set");
	}
	
	ThisMethod(String n,int m) {
		this(n,"--",m,-1);
		System.out.println("2 values are set");
	}
	
	ThisMethod(String n) {
		this(n,"--",30,-1);
		System.out.println("1 values are set");
	}
	
	

	
	
}
