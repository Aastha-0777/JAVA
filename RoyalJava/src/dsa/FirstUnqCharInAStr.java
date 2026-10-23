package dsa;

public class FirstUnqCharInAStr {

	public static int firstUniqChar(String s) {
 
		int alpCounters[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for (int i = 0; i < s.length(); i++) {
			alpCounters[s.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if(alpCounters[s.charAt(i) - 'a'] == 1) 	
				return i;
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int idx = firstUniqChar("leetcode");
		
		System.out.println(idx);
		
	}

}
