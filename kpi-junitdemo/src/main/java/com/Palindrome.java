package com;

public class Palindrome {

	public String palindrome(int x) {
	int num=x;
	int sum=0;
	int y;
	
	while(num>0) {
		y=x%10;
		sum=(sum*10)+y;
		x=x/10;
	}
	
	if(sum==x) {
		return "Palindrome";
	}
	
	else {
		return "Not palindrome";
	}
	
}
}