package com;

import java.util.ArrayList;
import java.util.List;

//interface TestForEach{
//	void print(List test);
//}
public class Foreach {

	public static void main(String[] args) {
		List<String> gameslist = new ArrayList<String>();
		gameslist.add("Football");
		gameslist.add("Cricket");
		gameslist.add("Chess");
		gameslist.add("Hockey");
		gameslist.add("Badminton");
		gameslist.add("Polo");
		
		
		gameslist.forEach(games -> System.out.println(games));  //lambda
		
		
	}
}
