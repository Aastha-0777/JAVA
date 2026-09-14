package basicApplications;

import java.util.Scanner;

public class HotelMenu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		int qty = 0;
		int total = 0;
		int p = 20;
		int c = 15;


		do {
			
			System.out.println("----------------------------------- HOTEL MENU -----------------------------------");
			System.out.println("1. Gujarati");
			System.out.println("2. South Indian");
			System.out.println("3. Punjabi");
			System.out.println("4. View Total Bill");
			System.out.println("5. Exit");
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : {
				
				int gjChoice;
				int gjTotal = 0;
				int gt = 380;
				int dd = 80;
				int sk = 50;
				
				do {
					
					System.out.println("----------------------- GUJARATI MENU -----------------------");
					System.out.println("1. Gujarati Thali --- Rs.380");
					System.out.println("2. Dal Dhokdi --- Rs.80");
					System.out.println("3. Sev Kahmadi --- Rs.50");
					System.out.println("4. Papad --- Rs.20");
					System.out.println("5. Chach --- Rs.15");
					System.out.println("6. Exit Gujarati Menu.");
					System.out.print("Enter Your Choice : ");
					gjChoice = sc.nextInt();
					
					switch(gjChoice) {
					
					case 1 : {
						
						System.out.println("You Have Choosen Gujarati Thali.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * gt);
						gjTotal += (qty * gt);
						
					}
					break;
					
					case 2 : {
						
						System.out.println("You Have Choosen Dal Dhokdi.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * dd);
						gjTotal += (qty * dd);
						
					} 
					break;
					
					case 3 : {
						
						System.out.println("You Have Choosen Sev Khamdi.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * sk);
						gjTotal += (qty * sk);
						
					} 
					break;

					case 4 : {
						
						System.out.println("You Have Choosen Papad.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * p);
						gjTotal += (qty * p);
						
					}
					break;
					
					case 5 : {
						
						System.out.println("You Have Choosen Chach.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * c);
						gjTotal += (qty * c);
						
					}
					break;
					
					case 6 : {
						
						total += gjTotal;
						System.out.println("Exiting Gujarati Menu....");
						break;
					}
					
					default : System.out.println("Invalid Choice!!");
					
					}//end of gjSwitch - case
					
				}while(gjChoice != 6);
			
			}// end of Gujarati case 
			break;
			
			case 2 : {
				
				int siChoice;
				int siTotal = 0;
				int pd = 110;
				int md = 200;
				int pi = 170;
			
				do {

					System.out.println("----------------------- SOUTH INDIAN MENU -----------------------");
					System.out.println("1. Plain Dosa --- Rs.110");
					System.out.println("2. Masala Dosa --- Rs.200");
					System.out.println("3. Podi Idli --- Rs.170");
					System.out.println("4. Papad --- Rs.20");
					System.out.println("5. Chach --- Rs.15");
					System.out.println("6. Exit South Indian Menu.");
					System.out.print("Enter Your Choice : ");
					siChoice = sc.nextInt();
					
					switch(siChoice) {
					
					case 1 : {
						
						System.out.println("You Have Choosen Plain Dosa.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * pd);
						siTotal += (qty * pd);
					
					}
					break;

					case 2 : {
						
						System.out.println("You Have Choosen Masala Dosa.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * md);
						siTotal += (qty * md);
						
					}
					break;
					
					case 3 : {
						
						System.out.println("You Have Choosen Podi Idli.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * pi);
						siTotal += (qty * pi);
	
					}
					break;
					
					case 4 : {
						
						System.out.println("You Have Choosen Papad.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * p);
						siTotal += (qty * p);
						
					}
					break;
					
					case 5 : {
						
						System.out.println("You Have Choosen Chach.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * c);
						siTotal += (qty * c);
						
					}
					break;
					
					case 6 : {
						
						total += siTotal;
						System.out.println("Exiting South Indian Menu....");
						break;
					}
					
					default : System.out.println("Invalid Choice!!");
					
					}//end of siSwitch - case

				}while(siChoice != 6);
				
			}//end of South Indian case
			break;
			
			case 3 : {
				
				int pbChoice;
				int pbTotal = 0;
				int pt = 400;
				int l = 50;
				int ap = 80;
				
				do {
					
					System.out.println("----------------------- PUNJABI MENU -----------------------");
					System.out.println("1. Punjabi Thali --- Rs.400");
					System.out.println("2. Lassi --- Rs.50");
					System.out.println("3. Aloo Paratha --- Rs.80");
					System.out.println("4. Papad --- Rs.20");
					System.out.println("5. Chach --- Rs.15");
					System.out.println("6. Exit Punjabi Menu.");
					System.out.print("Enter Your Choice : ");
					pbChoice = sc.nextInt();
					
					switch(pbChoice) {
					
					case 1 : {
						
						System.out.println("You Have Choosen Punjabi Thali.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * pt);
						pbTotal += (qty * pt);
						
					} 
					break;
					
					case 2 : {
						
						System.out.println("You Have Choosen Lassi.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * l);
						pbTotal += (qty * l);
						
					}
					break;
					
					case 3 : {
						
						System.out.println("You Have Choosen Aloo Paratha.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * ap);
						pbTotal += (qty * ap);
						
					}
					break;
					
					case 4 : {
						
						System.out.println("You Have Choosen Papad.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * p);
						pbTotal += (qty * p);
						
					}
					break;
					
					case 5 : {
						
						System.out.println("You Have Choosen Chach.");
						System.out.print("Enter Your Quantity : ");
						qty = sc.nextInt();
						System.out.println("Quantity : " + qty);
						System.out.println("Total : " + qty * c);
						pbTotal += (qty * c);
						
					}
					break;
					
					case 6 : {
						
						total += pbTotal;
						System.out.println("Exiting Punjabi Menu....");
						break;
					}
					
					default : System.out.println("Invalid Choice!!");

					}//end of pbSwitch - case
					
				}while(pbChoice != 6);
	
				
			}//end of Punjabi Case
			break;
			
			case 4 : {
				
				System.out.println("Your Total Bill is : " + total);
				
			}
			break;
					 
			case 5 : {
				
				System.out.println("Exiting Hotel Menu Application....");
				break;
			}
			
			default : System.out.println("Invalid Choice!!");
			
			}//end of switch-case
			
		}while(choice != 5);
	
	}

}
