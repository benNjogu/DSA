package com.keytech;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(123, "James", "Kamande"));
		employees.add(new Employee(1234, "Alice", "Kamande"));
		employees.add(new Employee(1235, "Lenox", "Njogu"));
		employees.add(new Employee(12367, "Steve", "Jobs"));
		
		employees.forEach(employee->System.out.println(employee));
		System.out.println("-------------");
		System.out.println(employees.get(1));
		System.out.println("-------------");
		System.out.println(employees.isEmpty());
		System.out.println("-------------");
		employees.set(0, new Employee(789, "Kenedy", "Kimanga"));
		employees.forEach(employee->System.out.println(employee));
		System.out.println("-------------");
		System.out.println(employees.size());
		System.out.println("-------------");
		employees.add(3, new Employee(987, "John", "Doe"));
		System.out.println("-------------");
		employees.forEach(employee->System.out.println(employee));
		System.out.println("-------------");
		Employee[] employeeArray = employees.toArray(new Employee[employees.size()]);
		for(Employee employee : employeeArray) {
			System.out.println(employee);
		}
		System.out.println("-------------");
		System.out.println(employees.contains(new Employee(1234, "Alice", "Kamande")));
		System.out.println("-------------");
		System.out.println(employees.indexOf(new Employee(1234, "Alice", "Kamande")));
		System.out.println("-------------");
		employees.remove(3);
		employees.forEach(employee->System.out.println(employee));
	}

}
