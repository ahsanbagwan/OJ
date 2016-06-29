package com.spoj.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ahbagwan on 6/29/2016.
 */
public class RemoveElement {
    // TODO wrong please correct
    public static int removeElement(Integer[] elements, int val) {
        int result = 0;
        for (int i=0; i < elements.length-1; i++){
            if ( elements[i] == val ) {
                elements[i] = elements[i+1];
            }
        }
        List<Integer> list = Arrays.asList(elements);

        return Collections.frequency(list, val);
    }

    public static void main(String[] args) {
        int frequency = RemoveElement.removeElement(new Integer[]{3,2,2,3}, 3);
        System.out.println("frequency " + frequency );
    }
}
