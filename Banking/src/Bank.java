/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * @Zheng
 */

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public void addBranch(String name){
        Branch branch = new Branch(name);
        branches.add(branch);
    }
    public void addCustomer(String branch, String name, Double transaction){
        findBranch(branch).newCustomer(name,transaction);
    }

    private Branch findBranch(String BranchName){
        for (int i = 0; i < branches.size(); i++){
            if (branches.get(i).getName().equals(BranchName)) return branches.get(i);
        }
        return null;
    }


//    private Branch findBranch(String name){
//        return branches.get(branches.indexOf(name));
//    }

    public void addCustomerTransaction (String branch,String name, Double transaction){
        findBranch(branch).addCustomerTransaction(name,transaction);
    }
    public void ListCustomers(String branch, boolean print){
        findBranch(branch).printCustomerList();


    }

}
