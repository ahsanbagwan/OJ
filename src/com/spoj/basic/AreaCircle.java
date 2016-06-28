package com.spoj.basic;

/**
 * Created by ahbagwan on 6/28/2016.
 */
public class AreaCircle {
    private static final double PI = 3.1415;

    public static double area(int radius){
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("area " + AreaCircle.area(5) );
    }
}
