package day07calisma;

import day07.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;

public class Hesap {
    private ArrayList<Order> orders = new ArrayList<>(); //[1001,1002,1003,1004]
    public void addOrder (Order order) {
        orders.add(order);
    }

    public double getTotalAmount (){
        return orders.stream().mapToDouble(Order::getTotalAmount).sum();
    }

    public void printHesap (){
        System.out.println("*********Hesap Fisi**********");
        for (Order order : orders){
            System.out.println("Sparis Kodu : " + order.getOrderCode());
            System.out.print("Yiyecekler : ");

        }
    }







}
