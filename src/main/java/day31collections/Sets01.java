package day31collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    /*
    1)Set ler tekrarsiz (==>unique) eleman depolamak icin kullanilir.
    2)3 tane Set Class vardir.
      a)HashSet Class: (cuval)
      "Hash" benzersiz bir id olusturma teknigidir. Bu teknige hashing technique denir.
      "HashSet" elemanlari rastgele siralanir.
      "HashSet" elemanlari siralamadigindan cok hizli calisir.
      "HashSet" ler tekrarsiz eleman depolamak icin kullanilir.
      "HashSet" ler "null" i eleman olarak kabul eder.

      b)LinkedHashSet Class: (okul kayit ta kullanabiliriz)
      "LinkedHashSet" elemanlari sizin verdiginiz siraya gore dizer. (insertion order) dizdiklerinden HashSetlere gore yavastirlar.
      "LinkedHashSet" ler tekrarsiz eleman depolamak icin kullanilir.

      c)TreeSet Class :
      "TreeSet" elemanlari natural order (kucukten buyuge ya da alfabetik siraya gore) duzenler.
      "TreeSet" elemanlari natural order a gore dizdiklerinden coook yavastirlar.
      En yavas set "TreeSet" lerdir.





     */
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Merve");
        hs.add("Tuba");
        hs.add("Sema");
        hs.add("Fatih");
        hs.add("Rana");
        hs.add("Sema");

        System.out.println(hs);//[Fatih, Sema, Rana, Merve, Tuba]
        System.out.println(hs.hashCode()); //149615145

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(19);
        lhs.add(353);
        lhs.add(7);
        lhs.add(null);
        lhs.add(null);

        System.out.println(lhs);//[313, 19, 353, 7, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(313);
        ls.add(195);
        ls.add(353);
        ls.add(17);
        System.out.println(ls);//[313, 195, 353, 17]

        lhs.retainAll(ls);
        System.out.println(lhs);//[313, 353]
        System.out.println(ls);//[313, 195, 353, 17]

        TreeSet<Character> ts = new TreeSet<>();
        ts.add(('G'));
        ts.add(('A'));
        ts.add(('Z'));
        ts.add(('R'));
        ts.add(('U'));
        //ts.add((null)); ekleyemeyiz hata verir
        System.out.println(ts);//[A, G, R, U, Z] natural order.

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z

        System.out.println(ts.lower('R'));//G  verilen elemanin bir oncekini verir.
        System.out.println(ts.lower('D'));//A

        System.out.println(ts.higher('R'));//U verilen elemanin bi ustundekini verir.
        System.out.println(ts.higher('T'));//U

        System.out.println(ts.headSet('R'));//[A, G]
        System.out.println(ts.headSet('R',true));//[A, G, R]

        System.out.println(ts.tailSet('R'));//[R, U, Z]
        System.out.println(ts.tailSet('R',false));//[U, Z]

        System.out.println(ts.ceiling('T'));//U "Eleman listede varsa kendini verir. Yoksa bir usttekini"
        System.out.println(ts.floor('T'));//R

        System.out.println(ts.subSet('G',false, 'Z',true));//[[R, U, Z]


    }
}
