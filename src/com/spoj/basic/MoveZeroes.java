package com.spoj.basic;

/**
 * Created by ahbagwan on 6/29/2016.
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] == 0) {
                nums[nums.length] = 0;
                nums[i] = nums[i+1];
            }
        }
        System.out.println("nums " + nums );
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
}
