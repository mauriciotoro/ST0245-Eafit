/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller__5;

/**
 *
 * @author
 */
public class Taller5S {
    
    
    //ArrayMax
	public static int arrayMax(int[] array, int n) {
		int i, max, temp;
		max = array[n];
		if(n!=0){
			temp=arrayMax(array,n-1);
			if(temp>max)
				max=temp;
		}
		return max;
	}
    
    //groupSum
	public static boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        return groupSum(start + 1, nums, target - nums[start])
        || groupSum(start + 1, nums, target);
    }
	
	
	//fibonacci
	public static long fibonacci(int n) { 
		if (n <= 1) 
			return n;  
		else 
			return fibonacci(n-1) + fibonacci(n-2);  
	}
}