package stringtopic.methodes;

import java.util.Iterator;

public class StringManuMethodes {
	
	public static void main(String[] args) {
		
		String name = " Aastha ";
		
		System.out.println("name.toLowerCase() : " + name.toLowerCase());
		System.out.println("name.toUpperCase() : " + name.toUpperCase());
		
		String string = "Royal Techosoft Private Limited Private Limited";
		
		System.out.println("string.contains(\"Private\") : " + string.contains("Private"));
		System.out.println("string.startsWith(\"royal\") : " + string.startsWith("royal"));
		System.out.println("string.endsWith(\"Limited\") : " + string.endsWith("Limited"));
		System.out.println("string.indexOf(\"Private\") : " + string.indexOf("Private"));
		System.out.println("string.lastIndexOf(\"Limited\") : " + string.lastIndexOf("Limited"));
		
		String str1 = " ";
		
		System.out.println("str1.isBlank() : " + str1.isBlank());
		System.out.println("str1.isEmpty() : " + str1.isEmpty());
		
		System.out.println("name.length() : " + name.length());
		name = name.trim();
		System.out.println("name.length() after trim : " + name.length());
		
		System.out.println("name : " + name);
		System.out.println("name.repeat(7) : " + name.repeat(7));
		
		String words[]  = string.split("\\s");
		
		for (int i = 0; i < words.length; i++) {
			
			System.out.println("Words["+i+"] : " + words[i]);
			
		}	
		
		System.out.println("string.replace(\"Techosoft\", \"TECHNOSOFT\") : " + string.replace("Techosoft", "TECHNOSOFT"));
		
		
		
	}

}
