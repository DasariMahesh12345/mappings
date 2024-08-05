package constructor;

public class ConstOverLoadMainMethod {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstOverLoading S1=new ConstOverLoading(2);
        S1.display();
        S1.display(8);
        S1.display('a');
        S1.display();
        S1.display(20,30);
        S1.display(40,50,"Mahesh");
       // S1.display(40,50,"Mahesh",40);// not sutable for this method 
        S1.display(3.5);
        S1.display("srinu");
        //S1.display("srinu","sri");// not sutable for this method
        //S1.display(" ",18);//not sutable for this method
       // S1.display(" & ",18);// not sutable for this method
        
	}

}
