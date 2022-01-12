package com.keytech;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Employee jamesKamande = new Employee(123, "James", "Kamande");
		Employee aliceKamande = new Employee(1234, "Alice", "Kamande");
		Employee lenoxNjogu = new Employee(1235, "Lenox", "Njogu");
		Employee steveJobs = new Employee(12367, "Steve", "Jobs");
		Employee bliGates = new Employee(1221, "Bli", "Gates");
		
		LinkedList<Employee> employees = new LinkedList<>();
		//Adding at the front of the list
		employees.addFirst(steveJobs);
		employees.addFirst(lenoxNjogu);
		employees.addFirst(aliceKamande);
		employees.addFirst(jamesKamande);
		//Adding at the end of the list
		employees.add(bliGates);
		
		Iterator iterator = employees.iterator();
		System.out.print("HEAD ->");
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(" <=> ");
		}
		System.out.print("NULL");
	}

}
