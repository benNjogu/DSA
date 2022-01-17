package com.keytech;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {

		//This is usually a minHeap - peek() gives the minimum value
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(25);
		pq.add(-22);
		pq.add(1343);
		pq.add(54);
		pq.add(0);
		pq.add(-3492);
		pq.add(429);
		
		System.out.println(pq.peek());
		pq.remove();
		System.out.println(pq.peek());
		//poll removes the high priority item
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		System.out.println(pq.remove(54));
		System.out.println("------------------------------------------");
		
		Object[] ints = pq.toArray();
		for (Object num : ints) {
			System.out.println(num);
		}
		
	}

}
