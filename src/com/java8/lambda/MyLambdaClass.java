package com.java8.lambda;

public class MyLambdaClass {
	
	public static void main(String args[])
	{
		MathOperations mathAdd= (int x , int y)->
			x+y;
		MathOperations mathSub= (int x , int y)->
			x-y;
		MathOperations mathDiv= (int x, int y)->
			x/y;
		MathOperations mathMul= (int x , int y)->
			x * y;
			
		System.out.println("Addition"+ mathAdd.operation(12, 12));
		System.out.println("Subtraction"+ mathSub.operation(12, 2));
		System.out.println("Division"+ mathDiv.operation(12, 2));
		System.out.println("Multiplication"+ mathMul.operation(12, 2));
		
		
		
	}
	

}

@FunctionalInterface
interface MathOperations{
	int operation(int x, int y);
}
