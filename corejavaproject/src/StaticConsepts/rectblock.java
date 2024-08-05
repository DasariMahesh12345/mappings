package StaticConsepts;

public class rectblock {
int i,b;//instance variable(non-static variable)
static int x,y;//static variable

public rectblock() {

	System.out.println("resct related constructor");
}
static {
	//i=20;//instance variable(non-static variable)cannot be referenced from static block
	//b=30;
	x=40;
	y=50;
	System.out.println(x+" "+y);
	System.out.println("resct related rect related static block");
}

}
