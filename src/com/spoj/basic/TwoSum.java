package com.spoj.basic;

import java.util.Arrays;

/**
 * Created by ahbagwan on 6/29/2016.
 */
public class TwoSum {
    public static int[] twoSum(int nums[], int target) {
        int[] result = new int[2];
        for (int i=0; i < nums.length-1; i++) {
            if(nums[i]+nums[i+1]==target){
                result[0] = i;
                result[1] = i+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2,7,11,15}, 9);
        System.out.println( "result: " + Arrays.toString(result)); // TODO remove syso and add unit test
    }
}
