/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * @Zheng
 */

/**
 * @author Zheng
 */

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStock = 0; // can be initialized later

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0; // or here ( but you wouldn't normally do both).
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if (price >0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityStock + quantity;

        if ( newQuantity > 0) {
            this.quantityStock = newQuantity;
        }

    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if (obj ==this){
            return true;
        }
        if (obj == null || (obj.getClass() !=this.getClass())){
            return false;
        }
        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);

    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 13;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");
        if (this == o){
            return 0;

        }

        if (o!=null){
            return  this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}
