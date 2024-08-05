package objrelatedconcept;

import java.util.Scanner;

public class Recct {
	int leng;
	int bre;
	int reg;
	
	void n1() {
		
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter length :");
		leng =sd.nextInt();
		System.out.println("Enter breath :");
		bre =sd.nextInt();
		
	}
	
	void n2() {
		reg=leng*bre;
		System.out.println("Total value "+reg);
		System.out.println();
		
	}
	
	void n3() {
		System.out.println("Length : "+leng);	
		System.out.println("Breath : "+bre);
		
	}
	

}
