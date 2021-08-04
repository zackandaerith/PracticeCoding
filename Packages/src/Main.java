/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * @Zheng
 */

import com.zhengpackage.Series;

/**
 * @author Zheng
 */

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++){
            System.out.println(Series.nSum(i));
        }



        for (int i = 0; i <=10; i++){
            System.out.println(Series.factorial(i));
        }


        for (int i = 0; i <=10; i++){
            System.out.println(Series.fibonacci(i));
        }
    }


}
