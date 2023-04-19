package day34collectionsmaps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {


        //Ilk gelenin ilk cikmasi icin Queue yi kullaniyoruz. Ilk gelen urun ilk satilmasi lazim gibi.(fifo)

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Bread");
        wareHouse.add("Cheese");
        System.out.println(wareHouse);//[Milk, Meat, Egg, Bread, Cheese]

        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Egg, Bread, Cheese]

        System.out.println(wareHouse.peek());//Meat   copy-past= silmeden aliyor. Bos ise null verir.
        System.out.println(wareHouse);//[Meat, Egg, Bread, Cheese]

        System.out.println(wareHouse.element());//Meat  bos ise hata verir.
        System.out.println(wareHouse);//[Meat, Egg, Bread, Cheese]

        wareHouse.clear();

        System.out.println(wareHouse.peek());//null
        System.out.println(wareHouse);//[]
       // System.out.println(wareHouse.element());//Exception hata verdi.





    }
}
