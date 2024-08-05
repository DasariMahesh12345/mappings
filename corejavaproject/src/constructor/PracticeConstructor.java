package constructor;

public class PracticeConstructor {
	int mat;
	int phy;
	int che;
	
	void set(int m,int p,int c) {
		mat=m;
		phy=p;
		che=c;
	}
	void show() {
		System.out.println("show method : "+mat+","+phy+","+che);
		display();              //main method lo display method ni call  cheikunda direct ga call cheivachu below method ni above method lo call chasi by susing pr any reference draware same obj lo method kabatti call cheivachu 
	}
	
    void display() {
    	System.out.println("display method : "+mat+","+phy+","+che);
    	
    }
}
