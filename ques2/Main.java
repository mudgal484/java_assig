package ques2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		Employee e1 = new Employee("Meenakshi",20.0,210000.0);
		employeeList.add(e1);
		Employee e3 = new Employee("Nancy",22.0,310000.0);
		employeeList.add(e3);
		Employee e4 = new Employee("Krati",23.0,220000.0);
		employeeList.add(e4);
		Employee e5 = new Employee("Richa",24.0,710000.0);
		employeeList.add(e5);
		Employee e2 = new Employee("Mansi",21.0,410000.0);
		employeeList.add(e2);
		Employee e6 = new Employee("Sakshi",24.0,110000.0);
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
