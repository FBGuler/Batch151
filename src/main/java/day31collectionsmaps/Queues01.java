package day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;
import java.util.WeakHashMap;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Egg, Cheese]

        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek());//Meat == listeden silmeden bize verir.Bu bos queues de NULL verir. copy-paste
        System.out.println(wareHouse.element());//Meat == listeden silmeden bize verir.Bos queues de hata verir. copy-paste

        System.out.println(wareHouse.poll());//Meat == listeden silerek bize verir. cut-paste



        wareHouse.clear();
        System.out.println(wareHouse.poll());//null
        System.out.println(wareHouse.remove());//Exception




    }
}
