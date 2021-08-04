/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * @Zheng
 */

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void newCustomer(String name , Double transaction){
        Customer customer = new Customer(name, transaction);
        customers.add(customer);
    }

    public  void addCustomerTransaction(String name, double transaction){
        findCustomer(name).addTransition(transaction);
    }

    public Customer findCustomer(String name){
        if(customers.contains(name))
        return customers.get(customers.indexOf(name));
        else System.out.println("Customer don't exist");
        return null;
    }

    public void printCustomerList(){
        for (Customer i :customers){
            System.out.println(customers.indexOf(i)+" : "+i.getName());
        }
    }
}
