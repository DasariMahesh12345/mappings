package constructor;

public class DefaultConstructer {
int max,soc,bio;
//3 variables
DefaultConstructer(int a,int b,int c){
	max =a;
	soc =b;
	bio =c;
}
//1 value assingned 3 variables
public DefaultConstructer(int i) {
	
	max=i;
	soc=i;
	bio=i;
}
//default constr
public DefaultConstructer() {
	
}
// methos
void all() {
	System.out.println("all sub marks:"+max+soc+bio);
}



}
