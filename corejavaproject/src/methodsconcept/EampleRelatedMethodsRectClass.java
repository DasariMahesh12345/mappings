package methodsconcept;

public class EampleRelatedMethodsRectClass {
	
	int len,bre;
	
	void show() {
		System.out.println("LENGTH : "+len +" \nBREATH : " +bre);
	}
	
	void area() {
		System.out.println("Total area :"+len*bre);
	}
	int peri() {
	return 2*(len*bre);
	}
	
	void check(int a,int b) {
		len=a;
		bre=b;
	}

}
