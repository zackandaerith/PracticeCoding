


/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * @Zheng
 */

import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);


    public MinimumElement() {
    }

    private static int readInteger(){
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    private static int[] readElements(int count){
        int [] array = new int[count];
        for (int i = 0; i<array.length; i++){
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

        return array;
    }

    private static int findMin(int [] array){
        int min = array[0];
        for ( int i : array){
            if (min >array[i]) min = array[i];
        }
        return min;}


    public static void main(String[] args){
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readElements(count+1);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);
    }
    }

