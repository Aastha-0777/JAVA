package collectionfrmk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrListDemo {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(true);
		list.add(67);
		list.add(6789l);
		list.add(45.67);
		list.add(45.67788f);
		list.add("Java");
		
		Student s = new Student(1, 12, 67, "Aastha");
		
		list.add(s);
		
		// 4. using list itrator 
		
		ListIterator lItr = list.listIterator();
		
		while(lItr.hasNext()) {
			
			Object obj = lItr.next();
			
			if(obj instanceof Student) {
				
				Student s1 = (Student)obj;
			
				System.out.println(s1.getId() + " " + s1.getName() + " " + s1.getStd() + " " + s1.getMarks());
				
			}else {
				
				System.out.println(obj);
			
			}
			
		}
		
		System.out.println("------------------------");
		
		while(lItr.hasPrevious()) {
			
			Object obj = lItr.previous();
			
			if(obj instanceof Student) {
				
				Student s1 = (Student)obj;
			
				System.out.println(s1.getId() + " " + s1.getName() + " " + s1.getStd() + " " + s1.getMarks());
				
			}else {
				
				System.out.println(obj);
			
			}
			
		}
		
		//3. traditional way 
		
//		Iterator itr = list.iterator();
//		
//		while(itr.hasNext()) {
//			
//			Object obj = itr.next();
//			
//			if(obj instanceof Student) {
//				
//				Student s1 = (Student)obj;
//			
//				System.out.println(s1.getId() + " " + s1.getName() + " " + s1.getStd() + " " + s1.getMarks());
//				
//			}else {
//				
//				System.out.println(obj);
//			
//			}
//
//			
//		}
		
		//2. using advance for loop / foreach 
//		for(Object obj : list) {
//			
//			if(obj instanceof Student) {
//				
//				Student s1 = (Student)obj;
//			
//				System.out.println(s1.getId() + " " + s1.getName() + " " + s1.getStd() + " " + s1.getMarks());
//				
//			}else {
//				
//				System.out.println(obj);
//			
//			}
//			
//		}

		// 1. for loop
//		for(int i = 0; i < list.size(); i++) {
//			
//			Object obj = list.get(i);
//			
//			if(obj instanceof Student) {
//				
//				Student s1 = (Student)obj;
//				
//				System.out.println("list.get("+ i +") : " + s1.getId() + " " + s1.getName() + " " + s1.getStd() + " " + s1.getMarks());
//				
//			}else {
//				
//				System.out.println("list.get("+ i +") : " + obj);
//				
//			};
//			
//		}//end of for
//		
	}
	
}
