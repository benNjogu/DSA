package com.keytech;

public class Main {

	public static void main(String[] args) {

		int num = 3;
		int factorial = iterativeFactorial(num);
		System.out.println("Factorial of "+num+" is "+factorial);
		
	}

	public static int iterativeFactorial(int num) {
		
		if (num == 0) {
			return 1;
		}
		
		int factorial = 1;
		for(int i = 1; i<=num; i++) {
			factorial *= i;
		}
		
		return factorial;
	}
	
}
