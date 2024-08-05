package StaticConsepts;

public class Block {
	int a,b,c;
	static {
		
		System.out.println("Static1 : 1 st executed static block next constructor");
	}
	
	Block(){
		System.out.println("\nconstructor : next executed block related constructor\n");
	}
	static {
		System.out.println("Static2 : 1 st executed static block next constructor");
	}
	

}
