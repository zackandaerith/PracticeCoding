/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * @Zheng
 */

package com.zhengpackage;

/**
 * @author Zheng
 */

public class Series {
    public static long nSum(int n){
        long sum = 0;
        for (int i = 1; i <n; i++){
            sum +=i;
        }

        return sum;
    }

    public static long factorial(int n){
        if (n==0 ) return 0;
        long sum = 1;
        for (int i =1; i <n; i++){
            sum = sum*i;

        }
        return sum;
    }

    public static long fibonacci(int n){
        if (n ==0) return 0;
        if (n ==1) return 1;
        long sum = 0;
        long nMinus1= 1;
        long nMinus2 = 0;
        for (int i =1; i <n; i++){
            sum = (nMinus1 + nMinus2);
            nMinus2 = nMinus1;
            nMinus1 = sum;
        }
        return sum;
    }



}
