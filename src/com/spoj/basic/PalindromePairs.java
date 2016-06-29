package com.spoj.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ahbagwan on 6/29/2016.
 */
public class PalindromePairs {
    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> pairs = new ArrayList<>();
        for (int i=0; i < words.length-1; i++) {
            for (int j = 0; j < words.length; j++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(words[i]);
                stringBuilder.append(words[j]);

                boolean isPalindrome = isPalindrome(stringBuilder.toString());

                if(isPalindrome){
                    pairs.add(Arrays.asList(new Integer[]{i, j}));
                }
            }
        }
        return pairs;
    }

    private static boolean isPalindrome(String word) {
        String reverse = reverse(word);
        return reverse.equals(word);
    }

    private static String reverse(String word) {
        char[] arr = word.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=arr.length; i > 0; i--) {
            stringBuilder.append(arr[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] words = new String[]{"bat", "tab", "cat"};
        List<List<Integer>> list = palindromePairs(words);

        System.out.println( "list " + list );
    }
}
