package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		Employee jamesKamande = new Employee(123, "James", "Kamande");
		Employee aliceKamande = new Employee(1234, "Alice", "Kamande");
		Employee lenoxNjogu = new Employee(1235, "Lenox", "Njogu");
		Employee steveJobs = new Employee(12367, "Steve", "Jobs");
		
		Queue queue = new Queue();
		queue.enqueue(jamesKamande);
		queue.enqueue(aliceKamande);
		queue.enqueue(lenoxNjogu);
		queue.enqueue(steveJobs);
		
		queue.printStack();
		System.out.println("-----------------------------------------------------");
		System.out.println(queue.peek());	
		System.out.println("-----------------------------------------------------");
		queue.dequeue();
		queue.printStack();
		
		Employee bill = new Employee(1234, "Bill", "Gates");
		Employee jack = new Employee(1235, "Jack", "Ma");
		Employee musk = new Employee(12367, "Elon", "Musk");
		
		queue.enqueue(bill);
		queue.enqueue(jack);
		queue.enqueue(musk);
		System.out.println("-----------------------------------------------------");
		queue.printStack();
		
	}

}
