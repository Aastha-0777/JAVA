package pragatimam.tasks;

import java.util.Scanner;

public class StringTask1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter a String : ");
		String str1 = sc.nextLine();
		
		try {
			
			while(str1 != null) {
				
				int lastIdx = str1.lastIndexOf(str1.charAt(0));
				
				System.out.print(str1.charAt(0) + "" + (lastIdx + 1));
				
				str1 = str1.replace(Character.toString(str1.charAt(lastIdx)), "");
					
			}
			
		} catch (Exception e) {


		}
		
		
	}

}
