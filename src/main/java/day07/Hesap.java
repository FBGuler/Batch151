package day07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hesap {

    private ArrayList<Order> orders = new ArrayList<>(); //[1001,1002,1003,1004]
    public void addOrder (Order order){
        orders.add(order);
    }

    public double getTotalAmount (){//toplam siparis tutari
        return orders. //[1001,1002,1003,1004]
                stream().
                mapToDouble(Order::getTotalAmount).
                sum();
    }

    public void printHesap (){

        System.out.println("***************HESAP FISI*********************");

        //             [2 Pizza, 3 Iskender, 5 Kebap, 4 Ayran ]
        for (Order order : orders){//[1001,1002,1003,1004]

            System.out.println("Sparis Kodu : " +order.getOrderCode());
            System.out.print("Yiyecekler : ");
            HashMap< MenuItem,Integer> items = order.getItems();

            for (Map.Entry<MenuItem,Integer> entry : items.entrySet()) {

                MenuItem item =entry.getKey();
                int adet =entry.getValue();

                System.out.printf("%-20s  %d x   %.2f TL ",
                        item.getName(), adet, item.getPrice());//"printf" formatli yazdirir. String icin "s", tamsayi icin "d", ondalikli sayilar icin "f"
                                                              //% formatli yazdir, -20 sola yazdir 20 karakter ayir.
            }

            System.out.println(order.getTotalAmount());

        }//for each tum yiyecekler

        System.out.println(getTotalAmount());













    }








}
