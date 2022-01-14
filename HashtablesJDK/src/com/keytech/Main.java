package com.keytech;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Employee jamesKamande = new Employee(123, "James", "Kamande");
		Employee aliceKamande = new Employee(1234, "Alice", "Kamande");
		Employee lenoxNjogu = new Employee(1235, "Lenox", "Njogu");
		Employee steveJobs = new Employee(12367, "Steve", "Jobs");
		Employee elon = new Employee(12367, "Elon", "Musk");
		
		Map<String, Employee> hTable = new HashMap<String, Employee>();
		hTable.put("james", jamesKamande);
		hTable.put("alice", aliceKamande);
		hTable.put("lenox", lenoxNjogu);
		hTable.put("steve", steveJobs);
		hTable.putIfAbsent("steve", elon);
		
//		Iterator<Employee> iterator = hTable.values().iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		
		hTable.forEach((k,v) -> System.out.println("key = "+k+" value = "+v));
		System.out.println("Retrieve key steve-> "+hTable.get("steve"));
		System.out.println("---------------------------------------------------------");
		hTable.remove("steve");
//		Iterator<Employee> iterator1 = hTable.values().iterator();
//		while(iterator1.hasNext()) {
//			System.out.println(iterator1.next());
//		}

		hTable.forEach((k,v) -> System.out.println("key = "+k+" value = "+v));
		System.out.println("---------------------------------------------");
//		hTable.remove("alice");
//		hTable.printHashtable();
//		System.out.println("---------------------------------------------");
//		System.out.println("Retrieve key lenox-> "+hTable.get("lenox"));
	}

}
