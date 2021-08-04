/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * @Zheng
 */

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;


    public MobilePhone(String myNumbers) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){

        if (findContact(contact) >=0) {
            System.out.println("Contact already exist");
            return false;
        }
        myContacts.add(contact);
        return contact == null;
    }
    public boolean updateContact(Contact contact, Contact updatecontact){
        int findPosition = findContact(contact);
        if (findPosition >=0){
        myContacts.set(findPosition, updatecontact);
        return true;

        }
    return false;

    }

    public boolean removeContact(Contact contact){

        int findPosition = findContact(contact);
        if (findPosition >=0){
            myContacts.remove(contact);
            return true;

        }
        return false;
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i =0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) return i;
        }
        return -1;

    }

    public Contact queryContact(String name){
        for (Contact i :myContacts){
           if (i.getName() == name) return i;
        }
        return null;
    }

    public void printContacts() {
        for (Contact i :myContacts){
            System.out.println(findContact(i)+1+ ". " + i.getName() + " -> " + i.getPhoneNumber());
        }
    }


}
