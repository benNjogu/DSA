package com.keytech;

public class Main {

	public static void main(String[] args) {

		Employee jamesKamande = new Employee(123, "James", "Kamande");
		Employee aliceKamande = new Employee(1234, "Alice", "Kamande");
		Employee lenoxNjogu = new Employee(1235, "Lenox", "Njogu");
		Employee steveJobs = new Employee(12367, "Steve", "Jobs");
		
		ArrayQueue queue = new ArrayQueue(1);
		queue.enqueue(jamesKamande);
		queue.enqueue(aliceKamande);
		queue.enqueue(lenoxNjogu);
		queue.enqueue(steveJobs);
		
		queue.printQueue();
		System.out.println("--------------------------------------------");
		queue.dequeue();
		queue.dequeue();
		queue.printQueue();
		System.out.println("--------------------------------------------");
		System.out.println(queue.size());
		System.out.println("--------------------------------------------");
		System.out.println(queue.isEmpty());
		System.out.println("--------------------------------------------");
		System.out.println(queue.peek());
		
	}

}
