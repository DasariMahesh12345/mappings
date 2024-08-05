package StaticConsepts;

public class BlockMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block ob1= new Block();
		ob1.a=60;
		ob1.b=70;
		ob1.c=60;
		ob1.b=70;
		
		
		System.out.println(ob1.a+" "+ob1.b+" "+ob1.c+" "+ob1.b);
		
		rectblock rect=new rectblock();
		 rect.i=400;//inst var
		 rect.b=500;//instance var 
		rect.x=200;//static var
		rect.y=300;//static var
		System.out.println(rect.i);
		System.out.println(rect.b);
		
		System.out.println(rect.x);
		System.out.println(rect.y);
		rectblock.x=10000;// direct call name tho kuda call chei vachu
		System.out.println(rectblock.x);
		
		

		
	}

}
