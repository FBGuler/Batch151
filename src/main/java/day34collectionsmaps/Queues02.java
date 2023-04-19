package day34collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();
        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);//[Egg, Milk, Meat, Orange, Tomatoes]

          /*
        Queue bir interface dir, bu yuzden constractoru yoktur. Dolayisiyla object olustururken new keyword unden sonra kullanilamaz.
        Data type "Queue" olan bir object olusturmak icin new keywordden sonra
          a)LinkedList veya
          b)PriorityQueue classlari kullanilir.
        Queue olustururken constractor olarak PriorityQueue kullanirsaniz elemanlari kendi belirleyeceginiz kurala gore siralama hakkiniz olur.
          */

        // Deque ==>Double ended queue ==> iki uclu kuyruk
        //Deque deki add(), get(), poll(), remove(), meyhodlari first-last seklinde iki uclu bulunur.
        Deque<String> d = new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");
        System.out.println(d);//[Milk, Meat, Egg, Orange, Tomatoes]









    }
}
