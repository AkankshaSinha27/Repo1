package com;

public class Prime {

	public static String primenum(int n) {
		
		if(n<=1) {
			return "not prime";
		}
		 for (int i=2;i<Math.sqrt(n);i++) {
			 if(n%i==0) {
				 return "not prime";
			 }
		 }
			 return "Prime";
		 }
		
		
	}

