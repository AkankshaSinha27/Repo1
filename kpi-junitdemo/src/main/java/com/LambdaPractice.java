package com;


public class LambdaPractice  {

	private int fun(int a,int b, MathOperation mathOperation) {
		return mathOperation.operation(a,b);
		
	}
	public static void main(String[] args) {
		LambdaPractice tester=new LambdaPractice();
		
		MathOperation addition = (int a,int b) -> a+b;
		MathOperation substraction = (a,b) -> a-b;
		MathOperation multiplication = (a,b) -> { return a*b;};
		MathOperation division = (int a,int b) -> a/b;
		
	System.out.println(tester.fun(9,10,addition));	
	System.out.println(tester.fun(10,1,substraction));	
	System.out.println(tester.fun(9,10,multiplication));	
	System.out.println(tester.fun(90,10,division));
	}
}
