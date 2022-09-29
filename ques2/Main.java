package ques2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		Employee e1 = new Employee("Ram",35.0,750000.0);
		employeeList.add(e1);
		Employee e3 = new Employee("Sham",32.0,560000.0);
		employeeList.add(e3);
		Employee e4 = new Employee("Bharat",23.0,280000.0);
		employeeList.add(e4);
		Employee e5 = new Employee("Krishna",34.0,700000.0);
		employeeList.add(e5);
		Employee e2 = new Employee("Gopal",38.0,480000.0);
		employeeList.add(e2);
		Employee e6 = new Employee("Radha",22.0,610000.0);
		employeeList.add(e6);
		
		for(Employee e : employeeList) {
			System.out.println(e.Name);
		}
		
		Collections.sort(employeeList);
		System.out.println("----after sorting using comparable-------");
		
		for(Employee e : employeeList) {
			System.out.println(e.Name);
		}
		
		Collections.sort(employeeList, new SalaryComparator());
		System.out.println("----after sorting using comparator by salary-------");
		
		for(Employee e : employeeList) {
			System.out.println(e.Name);
		}
	}

}
