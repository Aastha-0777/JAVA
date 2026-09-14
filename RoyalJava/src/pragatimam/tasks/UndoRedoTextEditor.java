package pragatimam.tasks;

import java.util.Scanner;

public class UndoRedoTextEditor {
	
	private final static int MAX = 100;
	private static String[] textStack = new String[MAX];
	
	private static int textCounter = 0;
	
	public static void insetText() {
		
		System.out.println("-------------------------------");
		
		if(textCounter != MAX) {
			
			sc.nextLine();
			System.out.print("Enter the Text : ");
			String text = sc.nextLine();
			
			textStack[textCounter] = text;
			textCounter++;
			
			System.out.println("Text Inserted Successfully!!");
			
		}else {
			
			System.out.println("The Text Stack is Full!!");
			
		}//end of if - else
		
		
	}//end of insertText
	
	public static void undoText() {
		
		if(textCounter < 0) {
			
			System.out.println("Text Stack Underflowed!!");
			
		}else {
			
			textCounter--;
			System.out.println("Undo Successful.");
			
		}//end of if - else
		
	}//end of undoText
	
	public static void redoText() {
		
		if(textCounter != MAX) {
			
			textCounter++;
			System.out.println("Undo Successful.");
			
		}else {
			
			System.out.println("The Text Stack is Full!!");
			
		}//end of if - else
		
	}//end of redoText
	
	public static void display() {
		
		System.out.println("-------------------------------");
		
		for(int i = 0; i < textCounter; i++) {
			
			System.out.println(textStack[i]);
			
		}//end of for
		
	}//end of display
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		/*
		 
		 ===== Undo Redo Text Editor =====
		1. Insert Text
		2. Undo
		3. Redo
		4. Display
		5. Exit
		 
		  */
		
		while(true) {
			
			System.out.println("===== Undo Redo Text Editor =====");
			System.out.println("1. Insert Text");
			System.out.println("2. Undo");
			System.out.println("3. Redo");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.print("Enter Your Choice : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : insetText();
					 break;
					 
			case 2 : undoText();
					 break;
					 
			case 3 : redoText(); 
					 break;
					 
			case 4 : display(); 
					 break;
					 
			case 5 : System.out.println("Exiting the Undo Redo Text Editor...");
					 System.exit(0);
					 
			default : System.out.println("Invalid Choice!!");
			
			}//end of switch
			
		}//end of while
		
	}

}
