package arrayListMiniProjects;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMangementApp {

	public static int searchEmpByValue(ArrayList<Employee> list, String searchValue, boolean flag) {

		if (flag) {

			for (int i = 0; i < list.size(); i++) {

				Employee e = list.get(i);
				if (searchValue.equals(e.getName())) {

					return i;

				}

			}

			return -1;

		} else {

			int searchId = Integer.parseInt(searchValue);
			
			for (int i = 0; i < list.size(); i++) {

				Employee e = list.get(i);
				if (e.getId() == searchId) {

					return i;

				}

			}

			return -1;

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Employee> empList = new ArrayList<Employee>();
		int choice = 0;

		do {

			System.out.println("================== EMPLOYEE MANAGEMENT APPLICATION ==================");
			System.out.println("1. Add Employee--list");
			System.out.println("2. Update Employee By Id");
			System.out.println("3. Delete Employee By Id");
			System.out.println("4. Search Employee By Id");
			System.out.println("5. Search a Employees by Name.");
			System.out.println("6. Display All Employee Records");
			System.out.println("7. Remove All Employees from list.");
			System.out.println("8. Display All Employees Different traversal techniques.[Iterator + ListIterator]");
			System.out.println("9. Check whether a Employee is already enrolled.");
			System.out.println("10. Display total enrolled Employees.");
			System.out.println("11. Employee Application Exit");
			System.out.print("Enter above choice for Employee Application : ");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				Employee e = new Employee();
				e.scanData();
				empList.add(e);
				System.out.println("Employee's Record Added Successufully in the List!!");
				break;

			case 2:
				break;

			case 3:

				System.out.print("Enter the Employee ID You want to Delete : ");
				int id = sc.nextInt();
				boolean deleteFlag = true;

				for (int i = 0; i < empList.size(); i++) {

					e = empList.get(i);

					if (e.getId() == id) {

						deleteFlag = false;
						empList.remove(i);
						System.out.println(
								"Employe with id : " + id + " has been removed Successufully form the Database!");

					}

				}

				if (deleteFlag) {

					System.out.println("Employe with id : " + id + " is not found in	 the Database!");

				}

				break;

			case 4:

				System.out.print("Enter the Employee ID You Want to Search : ");
				int searchId = sc.nextInt();
				
				int result = searchEmpByValue(empList, searchId+"", false);
				
				if(result != -1) {
					
					Employee emp = empList.get(result);
					emp.display();
					
				}else{

					System.out.println("Employe with id : " + searchId + " is not found in the Database!");

				} // end of if

				break;

			case 5:

				System.out.print("Enter the Employee Name You Want to Search : ");
				sc.nextLine();
				String searchName = sc.nextLine();
				
				result = searchEmpByValue(empList, searchName, true);

				if(result != -1) {
					
					Employee emp = empList.get(result);
					emp.display();
					
				}else {

					System.out.println("Employe with id : " + searchName + " is not found in the Database!");

				} // end of if

				break;

			case 6:

				for (int i = 0; i < empList.size(); i++) {

					e = empList.get(i);
					e.display();

				}

				break;

			case 7:
				break;

			case 8:
				break;

			case 9:
				break;

			case 10:
				break;

			case 11:
				break;

			default:
				System.out.println("Invalid Choice!!\n\tPlease Enter From Above Chocies!!");

			}// end of switch

		} while (choice != 0);

	}

}
