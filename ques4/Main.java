package ques4;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Employee,Double> mp = new HashMap<Employee,Double>();
		
		Employee e1 = new Employee("Ram",37,"Software Engineer",780000);
		Employee e2 = new Employee("Sham",38,"Project Engineer",790000);
		Employee e3 = new Employee("Bharat",39,"Devops Engineer",800000);
		
		mp.put(e1,e1.salary);
		mp.put(e2,e2.salary);
		mp.put(e3,e3.salary);
		System.out.println(mp.get(e3));
	}

}
