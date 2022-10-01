package ani1;

public interface Interface_eg {

	default void add() {
		System.out.println("default");
	}
	
	public void prt(int c);

public class interf implements Interface_eg{
		
	
		
	public void add(int x,int y ){
		
		System.out.println(x+y);
	}
	public static void main(String[]args) {
		interf obj1 = new interf();
		obj1.add(8,7);
	}
	@Override
	public void prt(int c) {
		// TODO Auto-generated method stub
		
	}
		
	}	
	
}
