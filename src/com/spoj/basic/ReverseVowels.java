package com.spoj.basic;

import java.util.Arrays;

/**
 * Created by ahbagwan on 6/28/2016.
 */
public class ReverseVowels {
    private static final String[] vowels = new String[]{"a", "e", "i", "o", "u"};

    public static String reverseVowels(String string) {
        char[] charString = string.toCharArray();

        for ( int i = charString.length ; i>0 ; i--) {
            if (Arrays.asList(charString).contains(charString[i])){

            }
        }
        return "string";
    }
}
