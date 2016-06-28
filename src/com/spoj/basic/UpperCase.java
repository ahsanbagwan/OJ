package com.spoj.basic;

/**
 * Created by ahbagwan on 6/27/2016.
 */
public class UpperCase {
    public static void main(String[] args) {
        boolean uppercase = UpperCase.beginsWithUppercase("Ajju");
        System.out.println("uppercase " +uppercase);
        boolean lowercase = UpperCase.beginsWithUppercase("ajju");
        System.out.println("lowercase "+lowercase);

    }
    public static boolean beginsWithUppercase(String str) {
        char startLetter = str.charAt(0);
        return Character.isUpperCase(startLetter);
    }
}
