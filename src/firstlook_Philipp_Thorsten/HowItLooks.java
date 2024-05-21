package firstlook_Philipp_Thorsten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HowItLooks {
	public static void main(String[] args) {
		// Some Data Set
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("John", 28));
		employees.add(new Employee("Jane", 35));
		employees.add(new Employee("Tom", 40));
		employees.add(new Employee("Alice", 25));
		employees.add(new Employee("Bob", 32));

		/*
		TODO
		    Filter employees who are older than 30.
    		Sort the filtered employees by their names.
    		Collect their names into a list.
		 */

		// Declarative
		List<Employee> filtered = new ArrayList<>();
		for (Employee e : employees) {
			if (e.getAge() > 30) {
				filtered.add(e);
			}
		}

		Collections.sort(filtered, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});

		List<String> names = new ArrayList<>();
		for (Employee e : filtered) {
			names.add(e.getName());
		}

		System.out.println(names);


		// Using streams:
		List<String> namesFromStreams = employees.stream()
				.filter(e -> e.getAge() > 30)
				.sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.map(Employee::getName)
				.collect(Collectors.toList());

		System.out.println(namesFromStreams);


	}

	static class Employee {
		private String name;
		private int age;

		// Constructor, getters, and setters omitted for brevity

		public Employee(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
	}
}
