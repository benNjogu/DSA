package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		Employee jamesKamande = new Employee(123, "James", "Kamande");
		Employee aliceKamande = new Employee(1234, "Alice", "Kamande");
		Employee lenoxNjogu = new Employee(1235, "Lenox", "Njogu");
		Employee steveJobs = new Employee(12367, "Steve", "Jobs");
		
		SimpleHashTable hTable = new SimpleHashTable();
		hTable.put("jameskama", jamesKamande);
		hTable.put("alicekam", aliceKamande);
		hTable.put("lenoxnj", lenoxNjogu);
		hTable.put("stevej", steveJobs);
		
		hTable.printHashtable();
	}

}
