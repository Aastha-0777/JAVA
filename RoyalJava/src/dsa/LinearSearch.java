package dsa;

import java.util.Scanner;

public class LinearSearch {

	public int linearSearch(int arr[], int n,int target) {
		
		for(int i = 0; i < n; i++) {
			
			if(arr[i] == target) {
				
				return i;
				
			}
			
		}//end of for
		
		return -1;
		
	}//end of linearSearch	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinearSearch l = new LinearSearch();
		
		final int SIZE = 100;
		int n;
		int key;
		
		int arr[] = new int[SIZE];
		
		System.out.print("Enter the number of Element you Want : ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.print("Enter the Arr["+ i + "] : ");
			arr[i] = sc.nextInt();
			
		}//end of for
		
		System.out.print("Enter the Value You Want to Search : ");
		key = sc.nextInt();
		
		if(l.linearSearch(arr, n, key) == -1) {
			
			System.out.println(key + " not Found.");
			
		}else {
			
			System.out.println(key + " found at Index " + l.linearSearch(arr, n, key) + ".");
			
		}//end of if-else
		
	}
	
}


