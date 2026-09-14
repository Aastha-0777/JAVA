package dsa;

import java.util.Scanner;

public class BinarySearch {

	public int binarySearch(int arr[], int size, int target) {
		
		int low = 0;
		int high = size - 1;
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(arr[mid] == target) {
				
				return mid;
				
			}else if(target < arr[mid]) {
				
				high = mid - 1;
				
			}else {
				
				low = mid + 1;
				
			}//end of if - else ladder
			
		}//end of while
		
		return -1;
		
	}//end of binarySearch
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		final int SIZE = 100;
		int n , key;
		
		int[] arr = new int[SIZE];
		
		BinarySearch bs = new BinarySearch();
		
		System.out.print("Enter the Numeber of the Elements You Want : ");
		n = bs.sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("Enter the Arr[" + i + "] : ");
			arr[i] = bs.sc.nextInt();

		}//end of for
		
		System.out.print("Enter the Key You Want to Search : ");
		key = bs.sc.nextInt();
		
		int res = bs.binarySearch(arr, n, key);
		
		if(res != -1) {
			
			System.out.println("The Element " + key + " found at Index " + res + ".");
			
		}else {
			
			System.out.println("The Element " + key + " Not found.");
			
		}//end of if - else
		
	}//end of main
	
}
