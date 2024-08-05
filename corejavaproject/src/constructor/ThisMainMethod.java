package constructor;

public class ThisMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// single Rgument
		ThisMethod p1 = new ThisMethod("siva");
		p1.show();
		// 2 arguments

		ThisMethod p2 = new ThisMethod("srinu", 10);
		p2.show(); // 3 arg 
		ThisMethod p3 = new ThisMethod("srinu", "srinu", 80);
		p3.show(); // 4 arg
		ThisMethod p4=new ThisMethod("srinu", "srinu", 80, 763478);
		p4.show(); // 1 arg
		ThisMethod p5=new ThisMethod("mahesh");
		p5.show();
		//no arg
		ThisMethod p6 = new ThisMethod();
		p4.show();
	}

}
