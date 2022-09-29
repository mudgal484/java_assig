package ques2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.Salary==o2.Salary) {
			return 0;
		}else if(o1.Salary>o2.Salary) {
			return 1;
		}else {
			return -1;
		}
	}

}
