/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * @Zheng
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    int[] array ={1,3,4,7,6,7};


        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("Array = " + Arrays.toString(array));
System.out.println("================");
    reverse(array);

        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("Reversed array =" + Arrays.toString(array));

    }
    public static void reverse(int[] array){
        for(int i =0; i <(array.length)/2; i++){
            int j = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = j;
        }


    }

}
