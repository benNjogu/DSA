package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		Employee jamesKamande = new Employee(123, "James", "Kamande");
		Employee aliceKamande = new Employee(1234, "Alice", "Kamande");
		Employee lenoxNjogu = new Employee(1235, "Lenox", "Njogu");
		Employee steveJobs = new Employee(12367, "Steve", "Jobs");
		
		SimpleHashTable hTable = new SimpleHashTable();
		hTable.put("james", jamesKamande);
		hTable.put("alice", aliceKamande);
		hTable.put("lenox", lenoxNjogu);
		hTable.put("steve", steveJobs);
		
		hTable.printHashtable();
		
		System.out.println("Retrieve key steve-> "+hTable.get("steve"));
		
	}

}
