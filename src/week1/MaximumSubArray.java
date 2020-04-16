package week1;
/**
 * 
@author alankrita
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 *
 */
public class MaximumSubArray {
	public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int cal = 0;
        for(int i=0;i<nums.length;i++){
            cal += nums[i];
            if(cal>sum)
                sum = cal;
            if(cal < 0)
                cal = 0;
        }
        return sum;
    }
	
	public static void main(String [] args)
	{
		System.out.println(new MaximumSubArray().maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}

}
