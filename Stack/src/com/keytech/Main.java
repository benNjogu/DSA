package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		Employee jamesKamande = new Employee(123, "James", "Kamande");
		Employee aliceKamande = new Employee(1234, "Alice", "Kamande");
		Employee lenoxNjogu = new Employee(1235, "Lenox", "Njogu");
		Employee steveJobs = new Employee(12367, "Steve", "Jobs");
		
		ArrayStack stack = new ArrayStack(4);
		stack.push(jamesKamande);
		stack.push(aliceKamande);
		stack.push(lenoxNjogu);
		stack.push(steveJobs);
		
		stack.printStack();
		System.out.println("-----------------------------------------------------");
		System.out.println(stack.peek());	
		System.out.println("-----------------------------------------------------");
		stack.pop();
		stack.printStack();
		
		Employee bill = new Employee(1234, "Bill", "Gates");
		Employee jack = new Employee(1235, "Jack", "Ma");
		Employee musk = new Employee(12367, "Elon", "Musk");
		
		stack.push(bill);
		stack.push(jack);
		stack.push(musk);
		System.out.println("-----------------------------------------------------");
		stack.printStack();
		
	}

}
