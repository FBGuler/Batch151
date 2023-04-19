package day29collections;

import java.util.LinkedList;

public class LinkedList01 {


    public static void main(String[] args) {

        //Array list ler eleman ekleme ve eleman silmede tekrar indexleme yapmak zorunda olduklarindan,ArrayListler eleman bulmada cok basarilidir.
        //eleman ekleme ve silmede basarisizdirlar.
        //LinkedList ekleme ve cikarmada basarilidir. Cunku linkedLink ler index kullanmazlar. Bu yuzden node ekleme ve silme islemlerinde tekrar indexleme yapilmaz.
        //LinkedLink lerde node ekleme ve silme islemleri yaparken sadece pointleri degistirir.




//        ArrayListler eleman silme ve eklemede yavastirlar. Cunku tekrar indexlemeye ihtiyac duyarlar.
//                LinkedListler ise elaman silmede basarilidirlar. LinkedListlerde her eleman bir sonrakini gosteriyor
//        ve en sondakinin sonrasi olmasa da null gosterir. LinkedListeler index kullanmazlar.
//
//                LinkedListlerde en bastaki elemandan daha once Head eleman vardir. Son eleman'a Tail denir en sonda
//        oldugu icin. Elemanlarin yapisi farkli olup bunlara Node denir. Yapinin bir yuzune point, on yuzune
//        ornegimize gore harf olan kismina Data denir. Node, Data ve Point'den olusuyor.
//        Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz.



        /*
        1)LinkedListler node silme eklemede cok basarili olduklari icin,
        silme ve ekleme islemlerini coklukla yapacaginiz zaman LinkedList kullaniniz.
        2)ArrayListler indexleri adres gibi kullanir bu yuzden arraylistler search islemlerinde basarilidir.
        Note:Ihtiyaciniz olan connection cogu zaman silme ve ekleme islemleri yapacaksa (muze ziyaretcileri gibi)LinkedList,
        "search" islemleri yapacaksa"amerika eyaletleri gibi" ArrayList lullaniniz.
         */

        LinkedList<String>s = new LinkedList<>();
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");
        s.remove(2);

        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra, Ajdar]

        s.remove("Ajdar");
        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra]

        s.remove();//ilk eleman gider
        System.out.println(s);//[Steve, Esen, Muge, Cuneyt, Esra]

        s.addFirst("Esra");
        System.out.println(s);//[Esra, Steve, Esen, Muge, Cuneyt, Esra]

        s.removeFirstOccurrence("Esra");
        System.out.println(s);//[Steve, Esen, Muge, Cuneyt, Esra]

        System.out.println(s.peek());//Steve *****Ilk node bize verir ve listten silmez(copy+paste)
        System.out.println(s.poll());//Steve *****Ilk node bize verir ve listeden cikarir, remove gibi.(cut+paste)
        System.out.println(s);//[Esen, Muge, Cuneyt, Esra]

        /*
        Retrieves, but does not remove, the head (first element) of this list.
          Throws: NoSuchElementException if this list is empty
         Note:peek() ile element() ikisi de ilk elemani silmeden size verir
     Ama peek() list bos oldugunda size "null" verir, element() ise "hata" verir
         */

        String r1 = s.element();//Ilk elemani silmeden size verir(copy+paste)
        System.out.println(r1);//Esen
        System.out.println(s);//[Esen, Muge, Cuneyt, Esra]



        /*
       Removes and returns the first element of this list.
       Throws: NoSuchElementException – if this list is empty
       Note:poll() ile pop() ikisi de ilk elemani siler ve size verir
     Ama poll() list bos oldugunda size "null" verir, pop() ise "hata" verir
         */
        s.pop();
        System.out.println(s);//[Muge, Cuneyt, Esra]




//        Set tekrarsiz elemanlar ornegin email adresleri, tel no, kimlik nolarini depolamak icin Set kullanilir.
//                HashSet ve devami ne zaman kullanilir.
//                HashSet setlerin en hizlisi olup hiz ihtiyaci olunca bunu kullanin
//        LinkedHashSet elemanlarin girilen siraya gore dizilmesi icin kullanilir.
//        TreeSet elemanlari natural order'a gore dizmek icin kullanilir


    }
}
