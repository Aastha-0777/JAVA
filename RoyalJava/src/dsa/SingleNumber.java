package dsa;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        
    	int result = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
			
    		result ^= nums[i];
    		
		}
    	
    	return result;
//    	* **Self-Cancellation:** `x ^ x = 0` (Any number XORed with itself becomes `0`).
//    			* **Identity:** `x ^ 0 = x` (Any number XORed with `0` stays `x`).
//    			* **Order Doesn't Matter:** `a ^ b ^ a = (a ^ a) ^ b = 0 ^ b = b`.
    }
	
	public static void main(String[] args) {
		
		int[] arr = {2,2,1};
		
		int res = singleNumber(arr);
		
		System.out.println(res);
		
	}
	
}
