package arrayListMiniProjects;

import java.util.Comparator;

public class salWiseEmpSortDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if (e1.getSalary() < e2.getSalary()) {

			return 1;

		} else if (e1.getSalary() > e2.getSalary()) {

			return -1;

		} else {

			return 0;

		}

	}
	
}
