package methodsconcept;

public class MethodClaaMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MehotdConcept sr = new MehotdConcept();
		MehotdConcept ss = new MehotdConcept();

		sr.showMarks(); // order of execution 1st a method call chasthy adhi execute avtundhi
		ss.totalMarks();
		ss.check(); // 30
		ss.product(5, 4); // actual arguments //20
		ss.product(5, 5); // 25
		ss.product(5, 6); // 30
		ss.sum(10, 20, 30); // sum 60 and mul 600 both operations performed 1 methos
		int p = ss.returnSum(50, 60, 70); // p stores 180
		int q = ss.returnSum(2, 6, 7); // q stores 15
		int r = p + q; // total 195
		System.out.println("Total Sum : " + r);
		System.out.println();

		EampleRelatedMethodsRectClass rect = new EampleRelatedMethodsRectClass();
		rect.check(10, 12);
		rect.show();
		rect.area();
		rect.peri();
		int s = rect.peri();
		System.out.println("peri : " + s);

		System.out.println("above 1 st obj'rect' below one aother obj'rect1'");

		EampleRelatedMethodsRectClass rect1 = new EampleRelatedMethodsRectClass();
		rect1.check(50, 60);
		rect1.show();
		rect1.area();
		rect1.peri();
		int t = rect1.peri();
		System.out.println("peri : " + t);
	}

	// calling =====invoking anna 2 1 ty
	// argument =====parameter anna 2 1 ty

}
