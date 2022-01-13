package com.keytech;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

	private LinkedList<Employee> stack;

	public LinkedStack() {
		super();
		stack = new LinkedList<Employee>();
	}
	
	public void push(Employee employee) {
		stack.push(employee);
	}
	
	public Employee pop() {
		return stack.pop();		
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public int size() {
		return stack.size();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		ListIterator<Employee> iterator = stack.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
