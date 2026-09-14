package stringtopic.mutableandimmutable;

public class AnagramStr {
	
	public static void main(String[] args) {
		
		String str1 = "listen";
		String str2 = "silent";
		boolean flag = false;
		
		if(str1.length() == str2.length()) {
			
			for(int i = 0; i < str1.length(); i++) {
				
				flag = false;
				
				for(int j = 0; j < str2.length(); j++) {
					
					if(str1.charAt(i) == str2.charAt(j)) {
						
						flag = true;
						break;
						
					}//end of if
					
				}//end of inner for
				
				if(!flag) {
					
					System.out.println("Both are not anagram!!");
					break;
					
				}//end of if
				
			}//end of outer for
			
		}else{
			
			System.out.println("Both are not anagram!!");
			
		}//end of if - else
		
		if(flag) {
			
			System.out.println("Both are anagram!!");
			
		}//end of if
		
		
	}

}
