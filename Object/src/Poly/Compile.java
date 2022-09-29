package Poly;

public class Compile {
	
 void Area(int r) {
	 System.out.println("area" +r);
}

 void Area(int l,int b) {
	System.out.println("area" +l +b);
}
public static void main(String[]arg) {
	Compile ob1= new Compile();
	ob1.Area(9);
	ob1.Area(7,8);
}
}
