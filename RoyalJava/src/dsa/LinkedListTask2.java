//package dsa;
//
//import java.util.LinkedList;
//import java.util.Scanner;
//
//public class LinkedListTask2 {
//
//	static Scanner sc = new Scanner(System.in);
//	
//	public static void main(String[] args) {
//		
//		LinkedList<Integer> list = new LinkedList<Integer>();
//	
//		int last = 5;
//		
//		list.add(10);
//		list.add(30);
//		list.add(20);
//		list.add(50);
//		list.add(70);
//		list.add(60);
//		list.add(8);
//		
//		System.out.println("List : " + list);
//		
//		for(int i = 0; i < 5; i++) {
//			
//			int exchange = 0;
//			
//			for(int j = 0; j < last; j++) {
//				
//				if(list.get(j) < list.get(j + 1)) {
//					
//					int temp = list.get(j);
//					list.add(j+1, list.get(j + 1));
//					list.add(j, temp);
//					
//				}//end of if
//				
//			}//end of inner for
//			
//			if(exchange == 0) {
//				
//				break;
//				
//			}else {
//				
//				last--;
//				
//			}
//			
//		}//end of outer loop
//		
//		System.out.println("List after Sorting : " + list);
//
//	}
//	
//}
