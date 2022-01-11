package com.keytech;

import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = new Vector<>();

		employees.add(new Employee(123, "James", "Kamande"));
		employees.add(new Employee(1234, "Alice", "Kamande"));
		employees.add(new Employee(1235, "Lenox", "Njogu"));
		employees.add(new Employee(12367, "Steve", "Jobs"));

	}

}
