package constructor;

public class MainMethodConstr {

	public static void main(String[] args) {
		
		PracticeConstructor pr =new PracticeConstructor();
		pr.set(10,12,15);
		pr.show();
		
		PracticeConstructor pr1 =new PracticeConstructor();
		pr.set(100,200,300);
		pr.show();
		
		
		// 3 variables 3 values
		DefaultConstructer df =new DefaultConstructer(10,20,30);
		df.all();
		// 70 assined 3 varables
		DefaultConstructer dd1 =new DefaultConstructer(70); 
		dd1.all();
		//default constructor
		DefaultConstructer dd2 =new DefaultConstructer();
		dd1.all();
	}

}
