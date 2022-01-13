package com.keytech;

import java.util.LinkedList;
import java.util.ListIterator;

public class Queue {

	private LinkedList<Employee> queue;

	public Queue() {
		super();
		queue = new LinkedList<Employee>();
	}
	
	public void enqueue(Employee employee) {
		queue.add(employee);
	}
	
	public void dequeue() {
		queue.remove();
	}
	
	public Employee peek() {
		return queue.peek();
	}
	
	public int size() {
		return queue.size();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public void printStack() {
		ListIterator<Employee> iterator = queue.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
