package ques2;

public class Employee  implements Comparable<Employee>{
	Double Age; 
	Double Salary; 
	String Name;
	
	public Employee(String Name,Double i,Double Salary) {
		this.Name=Name;
		this.Age=i;
		this.Salary=Salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Name.compareTo(o.Name);
		
	}
}
