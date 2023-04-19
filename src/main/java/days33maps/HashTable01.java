package days33maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
    HashMap ile HashTable arasindaki fark nedir?? Interview sorusu:
    1)HashMap "tread-safe" degildir. HashTable "tread-safe" dir.
      HashMap  "syncronized" degildir, HashTable "syncronized" dir.
    2)HashMap bir tane "null" key'e ve istediginiz kadar "null"value a musaade eder.
      HashTable keylerde ve value larda da "null" kullanilmasina musaade etmez.
    3)HashMap hizlidir, HashTable HashMap e gore yavastir.
    Note: HashMap ve HasTable ikiside entry leri rastgele siralar.



     */



    public static void main(String[] args) {


        Hashtable<String, Integer> stdAges = new Hashtable<>();
        stdAges.put("Tom", 43);
        stdAges.put("Jim", 52);
        stdAges.put("Jack", 21);
        stdAges.put("Henry", 43);
        stdAges.put("Walker", 85);
        //stdAges.put(null, 85); ==> HashTable lerin keylerine null konulamaz.
        //stdAges.put("Chris", null); == >HashTable lerin value larina null konulamaz.

        System.out.println(stdAges);//{Jim=52, Henry=43, Tom=43, Walker=85, Jack=21}


        //element methodu HasMap te yok HasTable da vardir.









    }
}
