package arrayListMiniProjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmpMangementApp {

	public static Object searchEmpByValue(ArrayList<Employee> list, String searchValue, boolean flag) {

		if (flag) {

			for (int i = 0; i < list.size(); i++) {

				Employee e = list.get(i);
				if (searchValue.equals(e.getName())) {

					return true;

				}

			}

			return -1;

		} else {

			int searchId = Integer.parseInt(searchValue);

			for (int i = 0; i < list.size(); i++) {

				Employee e = list.get(i);
				if (e.getId() == searchId) {

					return true;

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
			System.out.println("8. Sort List By Comparable.");
			System.out.println("9. Sort List By Comparator.");
			System.out.println("10. Display All Employees Different traversal techniques.[Iterator + ListIterator]");
			System.out.println("11. Check whether a Employee is already enrolled.");
			System.out.println("12. Display total enrolled Employees.");
			System.out.println("13. Employee Application Exit");
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

				Object obj = searchEmpByValue(empList, searchId + "", false);

				if (obj instanceof Integer) {

					Integer result = (Integer) obj;

					if (result != -1) {

						System.out.println("Employe with id : " + searchId + " found in the Database!");

					} else {

						System.out.println("Employe with id : " + searchId + " is not found in the Database!");

					} // end of if

				} else {

					boolean resFlag = (boolean) obj;

					if (resFlag) {

						System.out.println("Employe with id : " + searchId + " found in the Database!");

					} else {

						System.out.println("Employe with id : " + searchId + " is not found in the Database!");

					}

				}

				break;

			case 5:

				System.out.print("Enter the Employee Name You Want to Search : ");
				sc.nextLine();
				String searchName = sc.nextLine();

				obj = searchEmpByValue(empList, searchName, true);

				if (obj instanceof Integer) {

					Integer result = (Integer) obj;

					if (result != -1) {

						System.out.println("Employe with Name : " + searchName + " found in the Database!");

					} else {

						System.out.println("Employe with Name : " + searchName + " is not found in the Database!");

					} // end of if

				} else {

					boolean resFlag = (boolean) obj;

					if (resFlag) {

						System.out.println("Employe with Name : " + searchName + " found in the Database!");

					} else {

						System.out.println("Employe with Name : " + searchName + " is not found in the Database!");

					}

				}

				break;

			case 6:

				for (int i = 0; i < empList.size(); i++) {

					e = empList.get(i);
					e.display();

				}

				break;

			case 7:
				break;

			case 8: {

				System.out.println("----------- SELECT ORDER -----------");
				System.out.println("1. Accending Order");
				System.out.println("2. Descending Order");
				System.out.println("3. Return");
				System.out.print("Enter Your Choice : ");
				int orderChoice = sc.nextInt();

				switch (orderChoice) {

				case 1:
					Collections.sort(empList);
					System.out.println("List Sorted in Accending Order Id Wise Using Comparable.");
					break;

				case 2:
					//coming soon...
					break;

				case 3:
					break;

				default:
					System.out.println("Please enter a valid choice...");

				}// end of switch

			}
				break;

			case 9: {

				System.out.println("----------- SELECT ORDER -----------");
				System.out.println("1. Accending Order");
				System.out.println("2. Descending Order");
				System.out.println("3. Return");
				System.out.print("Enter Your Choice : ");
				int orderChoice = sc.nextInt();

				switch (orderChoice) {

				case 1: {

					System.out.println("----------- SELECT ELEMENT -----------");
					System.out.println("1. ID Wise");
					System.out.println("2. Salary Wise");
					System.out.println("3. Name Wise");
					System.out.println("4. Return");
					System.out.print("Enter Your Choice : ");
					int ch = sc.nextInt();

					switch (ch) {

					case 1:
						Collections.sort(empList, new idWiseEmpSort());
						System.out.println("List Sorted in Accending Order Id Wise Using Comparator.");
						break;

					case 2:
						Collections.sort(empList, new salWiseEmpSort());
						System.out.println("List Sorted in Accending Order Salary Wise Using Comparator.");
						break;

					case 3:
						Collections.sort(empList, new nameWiseEmpSort());
						System.out.println("List Sorted in Accending Order Name Wise Using Comparator.");
						break;

					case 4:
						break;

					default:
						System.out.println("Please enter a valid choie...");

					}// end of switch

				}
					break;

				case 2: {

					System.out.println("----------- SELECT ELEMENT -----------");
					System.out.println("1. ID Wise");
					System.out.println("2. Salary Wise");
					System.out.println("3. Name Wise");
					System.out.println("4. Return");
					System.out.print("Enter Your Choice : ");
					int ch = sc.nextInt();

					switch (ch) {

					case 1:
						Collections.sort(empList, new idWiseEmpSortDesc());
						System.out.println("List Sorted in Descending Order Id Wise Using Comparator.");
						break;

					case 2:
						Collections.sort(empList, new salWiseEmpSortDesc());
						System.out.println("List Sorted in Descending Order Salary Wise Using Comparator.");
						break;

					case 3:
						Collections.sort(empList, new nameWiseEmpSortDesc());
						System.out.println("List Sorted in Descending Order Name Wise Using Comparator.");
						break;

					case 4:
						break;

					default:
						System.out.println("Please enter a valid choie...");

					}// end of switch

				}
					break;
					
				case 3:
					break;

				default:
					System.out.println("Please enter a valid choice...");

				}// end of switch

			}
				break;

			case 10:
				break;

			case 11:
				break;

			case 12:
				break;

			case 13:
				break;

			default:
				System.out.println("Invalid Choice!!\n\tPlease Enter From Above Chocies!!");

			}// end of switch

		} while (choice != 0);

	}

}
