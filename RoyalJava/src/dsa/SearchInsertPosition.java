package dsa;

public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {

		int low = 0;
		int high = nums.length - 1;
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(nums[mid] == target) {
				
				return mid;
				
			}else if(nums[mid] < target){
				
				low = mid + 1;
				
			}else {
				
				high = mid - 1;
				
			}	
			
		}
		
		return low;
		
	}

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 6 };

		int trgt = 5;
		
		int ans = searchInsert(arr, trgt);
		
		System.out.println("Result : " + ans);
		
	}

}
