package Poly;

public class Runtime {

	void bike() {
	System.out.println("bike");
}
}
class Hero extends Runtime{
	void bike() {
		System.out.println("bike 2");
	}




public static void main(String args[] ){
		Runtime obj1 = new Hero();
		obj1.bike();
	}
}

	
	
	
	

