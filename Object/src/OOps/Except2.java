package OOps;

import java.util.Scanner;

public class Except2 {

	public static void main(String[] args) {
		
		try(Scanner sc1 = new Scanner(System.in);Scanner sc2 = new Scanner(System.in))
		{
			System.out.println("Enter");
			int num = sc1.nextInt()-sc2.nextInt();
			System.out.println(num);
			
			System.out.println(sc1.nextInt()+sc2.nextInt());
			
		}
		catch(Exception e) {
			System.out.println("catch");
		}
		finally {
			
		}
	}
}
