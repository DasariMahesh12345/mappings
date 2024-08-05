package methodsconcept;

public class MehotdConcept {

	int math, pht, chey; // instance variables(or)class level variables

	// showMarks() does not recive any arguments and doent return any values
	void showMarks() {
		System.out.println("Marks :" + math + "," + pht + "," + chey); // o/p:o,o,o
	}

	// totalMarks() does not recive any arguments and doent return any values
	void totalMarks() {
		System.out.println("Total Marks:" + (math + pht + chey)); // o/p:0
	}

	// check() does not recive any arguments and doent return any values
	void check() {
		int x = 10, y = 20;
		System.out.println(x + y); // method level variable

	}

	// product(int a,int b) recive int a,b arguments and doent return any values
	void product(int a, int b) { // a,b are formal arguments and formal parameters
		System.out.println(a * b);// methos level but values main methos lo vunna values estham
	}

	// sum(int a,int b,int c) recive int a,b,c arguments and doent return any values
	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
		System.out.println(a * b * c);

	}

	// returnSum(int x,int y,int z) recive int x,y,z arguments and return any values
	int returnSum(int x, int y, int z) {
		return (x + y + z);

	}
}
