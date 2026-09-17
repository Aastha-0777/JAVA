package tresurehuntClueSystem;

import java.util.Scanner;

public class TresureHuntClueSystem {
	
	static Scanner sc = new Scanner(System.in);
	
	public String name;
	public int levelNum;
	public String clue;
	
	public void scanData() {
		
		System.out.print("Enter the Player's Name : ");
		name = sc.nextLine();
		System.out.print("Enter the Player's Level Number : ");
		levelNum = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Clue : ");
		clue = sc.nextLine();
		
	}

	public static void main(String[] args) {
		
		
		
	}
	
}
