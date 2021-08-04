/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * @Zheng
 */

/**
 * @author Zheng Fang
 */

public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if ( this.root ==null){
            //The lis t was empty, so this item is head
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compartTo(item));
            if (comparison <0){
                if (currentItem.next()!=null){
                    currentItem.next();
                }else {
                    currentItem.setNext(item).setPrevious( currentItem);
//                    item.setPrevious(currentItem);
                    return true;
                }
            }else if (comparison >0){
                if (currentItem.previous() !=null){
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
//                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
//                    currentItem.setPrevious(item);

                }else {
                    item.setNext(this.root).setPrevious(item);
//                    this.root.setPrevious((item));
                    this.root = item;

                }
            }
            else {
                //equal
                System.out.println(item.getValue() + " is alread present, not added.");
            }


        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null){
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem !=null){
            int comparison = currentItem.compartTo(item);
            if (comparison ==0){
                if(currentItem ==this.root){
                    this.root = currentItem.next();

                }else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() !=null){
                        currentItem.next().setPrevious((currentItem.previous()));
                    }
                }
                return true;
            }else if (comparison <0){
                currentItem = currentItem.next();
            }else {
                //comparison >0
                return false;
            }
        }


        // we reach the end and with out find anything
        return false;
    }

    @Override
    public void traverse(ListItem item) {
        if (root ==null){
            System.out.println("The list is null");
        }else {

        while (root !=null){
            System.out.println(root.getValue());
            root = root.next();
        }

    }

}
}
