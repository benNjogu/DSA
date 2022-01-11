package com.keytech;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(123, "James", "Kamande"));
		employees.add(new Employee(1234, "Alice", "Kamande"));
		employees.add(new Employee(1235, "Lemox", "Njogu"));
		employees.add(new Employee(12367, "Steve", "Jobs"));
		
		employees.forEach(employee->System.out.println(employee));
		System.out.println("-------------");
		System.out.println(employees.get(1));
		System.out.println("-------------");
		System.out.println(employees.isEmpty());
	}

}
