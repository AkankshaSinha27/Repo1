package OOps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class List2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");

		// set-not take duplicate value
		Set<String> sets = new HashSet<String>();
		// Set set2=new HashSet();
		sets.add("a");
		sets.add("a");
		sets.add("b");

		System.out.println(sets);
		System.out.println(list);

		// map<key,value>
		// student s1:r1,s2:r2....

		Map<String, Integer> hm = new HashMap<String, Integer>();

		// assumption: name can't be duplicate
		// using put( method

		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);
		hm.put("a", 500);

		hm.get("a"); // get method help to get value frm key

		System.out.println(hm);

	}
}