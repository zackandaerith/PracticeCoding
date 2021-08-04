/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * @Zheng
 */

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
private static MobilePhone mymobilephone = new MobilePhone("701-936-1040");

    public static void main(String[] args) {
        System.out.println("Star the phone ....");
        printActions();
        boolean poweron = true;
        while (poweron){
            System.out.println("Please Enter the action through 1~6:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){

                case 0:
                    printActions();
                    break;

                case 1:
                    System.out.println("Contact list :");
                    mymobilephone.printContacts();
                    break;

                case 2:

                    System.out.println("Please enter the name :");
                    String name = scanner.nextLine();
                    System.out.println("Please enter the number :");
                    String number = scanner.nextLine();

                    Contact newcontact = new Contact(name,number);
                    mymobilephone.addNewContact(newcontact);
                    break;

                case 3:

                case 4:

                case 5:

                case 6:
                    poweron =false;
                    System.out.println("\nPhone is off");
                    break;
            }


        }




    }

    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - print a list of available actions\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - Turn off the phone.");
        System.out.println("Choose your action: ");
    }




}
