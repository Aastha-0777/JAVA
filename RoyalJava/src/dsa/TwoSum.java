package dsa;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int nums[], int target) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int complement;
		int res[] = {-1, -1};
		
		for(int i = 0; i < nums.length; i++) {
			
			complement = target - nums[i];
			
			if(!(map.containsKey(complement))) {
				
				map.put(nums[i], i);
				
			}else {
				
				res[0] = map.get(complement);
				res[1] = i;
				return res;
				
			}
			
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		
		int num[] = {2, 11, 7, 15};
		int targ = 9;
		int res[] = new int[2];
		
		res = twoSum(num, targ);
		
		System.out.print("Result : ");
		
		for (int i : res) {
			
			System.out.print(i + " ");
			
		}
		
	}
	
}
