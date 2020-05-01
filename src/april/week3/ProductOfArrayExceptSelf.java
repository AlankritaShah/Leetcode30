package april.week3;

import java.util.Arrays;

/**
 * 
@author alankrita
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 *
 */

public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[nums.length - 1] = 1;
        for(int j=nums.length-2; j>=0; j--){
            output[j] = output[j+1] * nums[j+1];
        }
        
        int temp = 1;
        for(int j=0; j<nums.length;j++)
        {
            output[j] = output[j] * temp;
            temp = temp * nums[j];
        }
        return output;
    }
	
	public static void main(String [] args)
	{
		System.out.println(Arrays.toString(new ProductOfArrayExceptSelf().productExceptSelf(new int[] {1,2,3,4})));
	}
}
