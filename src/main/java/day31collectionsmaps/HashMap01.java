package day31collectionsmaps;

import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {


        /*
           /*
        MY NOTES:
            Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
            "key" kismi tekrarsiz, "value" tekrarli olabilir.
            Map'ler "key" ve "value" structure'ini kullanir.
            Map'lerdeki elemanlara "Entry" denir.
            Elemanlarin tamanina ise "EntrySet" denilir.
            "Entry"ler tekrarsiz oldugu icin "EntrySet"denilir.
            "Key" ve "Value" lar ayri ayri data type'larinda olabilirler.
            "Map"'ler Collection degildir, farkli bir yapidir.

            HashMap'ler "entry"leri rastgele siralar, bu yuzden en hizli map'dir.
     */

        /* Map deyince aklimiza sözlük gelmeli.

    (KEY)    =    (VALUE)                        Map'ler key-value structure'ni kullanir.
   Tekrarsiz         Tekrarli
                                                 Map'lerdeki elemanlara yani girilen elemana "Entry" denir.
       Cat   =       Evcil Hayvan
       Dog   =       Evcil Hayvan                Girilen elemanlarin tamamina "EntrySet" denir.
 Crocodile   =       Timsah                      Map'lerdeki elemanlar tekrarsiz oldugu icin
     Tiger   =       Kaplan

       **/


        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000} Rastgele siraladi.

        int USA = countryPopulation.get("USA");
        System.out.println(USA);//400000000
        //***get() methodu "key" ile calisir ve "value" kismini verir. ***Onemli bir method

        //Butun key leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();//[Netherland, USA, Turkey, Germany, Albania]

        //Butun value lari nasil alabilirim?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[18000000, 400000000, 83000000, 83000000, 3000000]

        //Example 1: countryPopulation map in deki ulkelerin nufuslarinin ort nedir?

        int sum = 0;

        for(Integer w: values){
            sum= sum+w;
        }
        System.out.println(sum/ values.size());//117400000

        //Elemanlari "enrtry"olan bir "Set" verdi
        //Loop'lar map'ler ile kullanilamaz. Sadece entry'ler arasinda gezmek istedigimizde loop kullanabiliriz
        Set<Map.Entry<String, Integer>>entries = countryPopulation.entrySet();
        System.out.println(entries);//[Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]

        //Example 2: countryPopulation map indeki ulkelerinisimlerinin character sayisi ile nufuslarinin toplamini bulunuz.

        int toplam = 0;
        for (Map.Entry<String, Integer> w: entries){
            toplam=toplam + w.getKey().length()+ w.getValue();
        }
        System.out.println(toplam);//587000033







    }
}
