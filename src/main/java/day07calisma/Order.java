package day07calisma;

import day07.MenuItem;

import java.util.HashMap;

public class Order {

    private int orderCount =1000;
    private int orderCode;

    public Order() {
        orderCode = orderCount++;
    }
    public int getOrderCode(){
        return orderCount;
    }


    private HashMap<MenuItem, Integer>items = new HashMap();

    private HashMap<MenuItem, Integer> getMenu (){
        return items;
    }





    private double totalAmount = 0;




    public void addItem (MenuItem item, int adet){
        items.put(item, adet);
        totalAmount = totalAmount+ item.getPrice()*adet;
    }
    public double getTotalAmount(){
        return totalAmount;
    }


}
