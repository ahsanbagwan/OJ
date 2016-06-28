package com.spoj.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ahbagwan on 6/28/2016.
 */
public class Intersection {
    public static Integer[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for (int i=0; i < arr1.length; i++) {
            for (int j=0; j< arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    set.add(arr1[i]);
                }
            }
        }
        return set.toArray(new Integer[set.size()]);
    }

    public static void main(String[] args) {
        System.out.println("arr " + Arrays.toString(Intersection.intersection(new int[]{1,2,2,3}, new int[]{2,2})));
    }
}
