package day34collectionsmaps;

import java.net.ConnectException;
import java.sql.Connection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class HashMap01 {
    public static void main(String[] args) {

        //Hash ==Unique , benzersiz Id.
        //Map ==Sozluk.

        /*
        Cat       = Kedi
        Dog       = Kopek
        Hard      = Zor    ==>Herbir girdiye artik eleman degil "Entry" denir. Tum entry lere ise "Entry set denir.
        Difficult = Zor
        Tekrarsiz   Tekrarli yapilardan olusan bir yapi. Tekrarsiz kisma "Key", tekrarli kisma "Value" deniyor.
        Map ler key-value ikilisi ni kullanir.

        Entry ==> Key = Value
                 Key tarafi "Set" kullanir.


         */

    /*
    "Map" lerde sozluklerde ki gibi kelime ve manasi seklinde bir kullanim vardir.
    "Key" kismi tekrarsiz "value" kismi tekrarli olabilir.
    Maplerdeki elemanlara "Entry" denir.
    Elemanlarin tamamina "Entry Set" denir.
    Entry ler tekrarsiz oldugu icin "Entry Set" denilir.
    "Key" ve "Value" lar ayri ayri data tipinde olabilirler.
    "Map"ler Collection degildir.
    HashMap entry leri rastgele siralar. bu yuzden en hizli map tir.

     */

        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000 );
        countryPopulation.put("Albania", 30000000 );
        countryPopulation.put("USA", 400000000 );
        countryPopulation.put("Turkey", 83000000 );
        countryPopulation.put("Netherland", 1800000 );
        System.out.println(countryPopulation);//{Netherland=1800000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=30000000}

        System.out.println(countryPopulation.get("Germany"));//83000000 "get() methodu key i ister value yu verir."

        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]

        Collection<Integer> value = countryPopulation.values();
        System.out.println(value);//[1800000, 400000000, 83000000, 83000000, 30000000]


        //Example 1: Countrypopulation mapindeki nufuslarin ortalamasi nedir.
        Collection<Integer> values = countryPopulation.values();
        int sum = 0;
        for (Integer w: values) {
            sum = sum+w;
        }
        System.out.println(sum/ value.size()); //119560000

        //entrySet() methodu entry leri kalip halinde alip bize Set olarak verir.
        //Looplar mapler le kullanilamaz, onun icin entryset i kullaniriz.
        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);//[Netherland=1800000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=30000000]
        
        //Example 2: countryPopulation map indeki ulkelerin character sayisi ile  nufuslarinin toplamini bulunuz.
        
        int toplam= 0;
        for (Map.Entry<String,Integer> w:entries) {
           toplam= toplam + w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);//597800033
        
        

        








    }
}
