package com.java;

import java.util.Arrays;
import java.util.Scanner;

class NthLargestNumberInArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i=0; i<n; i++) {
//			arr[i] = sc.nextInt();
//		}
		
		int[] arr = {3,2,1,5,6,4};
		int k = 3;
		//int k = sc.nextInt();
		
		System.out.println(findKthLargest(arr, k));
	}
    public static int findKthLargest(int[] nums, int k) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        
        int ans = 0;
        k = nums.length - k;
        System.out.println(Arrays.toString(nums));
        for(int index = nums.length-1; index>=0; index--){
            if(index == k){
                ans = nums[k];
            }
        }        
        return ans;
    }
}