package day07;

import java.util.HashMap;

public class Order {

    private static int orderCount = 1000;//sparisin sayaci
    private int orderCode; //sparis kodu
    private HashMap<MenuItem, Integer> items = new HashMap<>();//items hashmap icinde (pizza, 2 adet)
    private double totalAmount = 0;

    public Order() {
        orderCode= orderCount++;

    }

    public void addItem(MenuItem item, int adet){
        items.put(item, adet);//items secenekler hashmap ine arguman olarak verilen item eklenir.
        totalAmount +=item.getPrice()*adet;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public HashMap<MenuItem, Integer> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

}
