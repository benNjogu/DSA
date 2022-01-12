package com.challenge;

public class Main {

	public static void main(String[] args) {
		
		IntegerLinkedList list = new IntegerLinkedList();
		
		System.out.println(list.isEmpty());
		
		
		list.printList();
		System.out.println(list.getSize());
		System.out.println(list.isEmpty());
		
		list.removeFromFront();
		System.out.println(list.getSize());
		list.printList();
		
	}

}
