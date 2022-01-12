package com.challenge;

public class IntegerLinkedList {

	private IntegerNode head;
	private int size;
	
	public void addToFront(Integer integer) {
		IntegerNode node = new IntegerNode(integer);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insertSorted(Integer value) {
		if (head == null || head.getInteger() >= value) {
			addToFront(value);
			return;
		}
	}
	
	public IntegerNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		
		IntegerNode removeNode = head;
		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
		
	}
	
	public void printList() {
		IntegerNode current = head;
		System.out.print("HEAD -> ");
		while(current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.print("NULL");
		System.out.println();
	}
}
