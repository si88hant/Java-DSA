
public class Kadanes_Algorithm {

	public static void main(String[] args) {
		
		// this is leetcode's problem #53. Maximum Subarray
		
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int max_subarray_sum = maxSubArray(nums);
		
		System.out.println(max_subarray_sum);

	}
	
    public static int maxSubArray(int[] nums) {
    
       /* watch pepcoding video for detailed explanation */
        
        int csum = nums[0];
        int osum = nums[0];
        
        for(int i=1; i<nums.length; i++){
            if(csum > 0){
                csum += nums[i];
            }
            else{
                csum = nums[i];
            }
            
            if(csum > osum){
                osum = csum;
            }
        }
        return osum;
    }

}
