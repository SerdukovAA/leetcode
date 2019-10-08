package com.huawei.refactoring;

//300
public class LongestIncreasingSubsequence {


    public static int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = 1;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = 1;
            for (int j = i-1; j >=0 ; j--) {
                if(nums[i] > nums[j]){
                    arr[i] = Math.max(arr[i], arr[j]+1 );
                }
            }
            max = Math.max(max, arr[i]);
        }
        return max;
    }

}
