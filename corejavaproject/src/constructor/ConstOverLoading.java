package constructor;

public class ConstOverLoading {
	int che,phy,max;
	public ConstOverLoading(int i) {
		// TODO Auto-generated constructor stub
		System.out.println(che+" fdgdf"+max+" fgsg"+phy);
	}
	void display() {
		System.out.println(che+" "+max+" "+phy);
	}
	public void display(int i) {
		// TODO Auto-generated method stub
		System.out.println((che+i)+" "+(max+i)+" "+(phy+i));
		
	}
	public void display1(int x) {
		// TODO Auto-generated method stub
		System.out.println((che+x)+" "+(max+x)+" "+(phy+x));
	
	}
	public void display(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println((che+i)+" "+(max+j));
		
	}
	public void display(int i, int j,String k) {
		// TODO Auto-generated method stub
		System.out.println((che+i)+" "+(max+j)+" "+ (phy+k));
		
	}
	public void display(double d) {
		// TODO Auto-generated method stub
		System.out.println("double related value");
	}
	public void display(String string) {
		// TODO Auto-generated method stub
		System.out.println("String relate");
		
	}
	

}
	
