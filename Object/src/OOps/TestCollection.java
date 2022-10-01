package OOps;

import java.util.ArrayList;

/**
 * @author AkankshaSinha
 *
 */
public class TestCollection {
	public static void main(String[] args) {

		// list is of type arraylist
		// arraylist is belonging to java.util package
		// initialization
		// only string allowed
		ArrayList<String> list = new ArrayList<String>();

		// size is not pre determined
		ArrayList list2 = new ArrayList();

		list.add("a");// only allows string
		list.add("b");

		//list2.add(1);// any value
		//list2.add("x");
		//list2.add("x","y"); we cant add more than 1 element in one go
		
		System.out.println(list.get(0));
		System.out.println(list2);
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i)=="b")//i=0,1,2....
			System.out.println(i);
		}
		
			for(int j=0;j<10;j++) {
				list2.add(j);
			}
			System.out.println(list2);
		

	}
}
