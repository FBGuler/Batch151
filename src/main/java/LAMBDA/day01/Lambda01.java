package LAMBDA.day01;

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
/*

    1) Lambda method create etme degil mevcut methodlari library'den cagarip kullanmaktir
    2) Java 8 ile eklenmistir
    3)Functional Programming dir.mimari yapiya onem vermez
    )Hiz, Clean Code ve okunabilirlik acisindan onemlidir

 */

        List<String> iller = new ArrayList<>(Arrays.asList("VAN", "Edirne", "Ordu", "VAN", "Izmir", "Eskisehir", "Safranbolu", "Izmir", "MUS"));
        printsElements(iller);//VAN Edirne Ordu VAN Izmir Eskisehir Safranbolu Izmir MUS
        System.out.println();
        printsEl(iller);//VAN Edirne Ordu VAN Izmir Eskisehir Safranbolu Izmir MUS
        System.out.println();
        EHaricElYazdir(iller);//VAN Ordu VAN Izmir Safranbolu Izmir MUS
        System.out.println();
        KarakSaysdorttenAzYadir(iller);//VAN VAN MUS 
        System.out.println();
        KarakSaysdorttenAzYadir(iller);//VAN VAN MUS
        System.out.println();
        karakSaysDorttenCokTkrszKucukHrfYazdir(iller);//edirne izmir eskisehir safranbolu
        System.out.println();
        TkrszBuyukHrfAlfabetikSiraYazdir(iller);//EDIRNE ESKISEHIR IZMIR MUS ORDU SAFRANBOLU VAN
        System.out.println();
        tkrszKucukHrfUzunluklarinaGoreKcktnBygeYazdir(iller);//van mus ordu izmir edirne eskisehir safranbolu
        System.out.println();
        ilkHarfBykDigerKucukYazdir(iller);//Van Edirne Ordu Van Izmir Eskisehir Safranbolu Izmir Mus
        System.out.println();
        System.out.println(ilkHarfEveyaSOlanlariYazdir(iller));//[Edirne, Eskisehir, Safranbolu]
        System.out.println();

    }//main

    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol:

    public static void printsElements(List<String> iller) {
        for (String w : iller) {
            System.out.print(w + " ");
        }
    }


    //2.Yol:LAMBDA

    public static void printsEl(List<String> iller) {
        System.out.println(("1 ) "));
        iller.
                stream().  //datalari akisa aliyor.
                forEach(t -> System.out.print(t + " "));
    }


    //Example 2: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void EHaricElYazdir(List<String> iller) {
        System.out.println(("2 ) "));
        iller.
                stream().
                filter(t -> !t.startsWith("E")).
                forEach(t -> System.out.print(t + " "));

    }


    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void KarakSaysdorttenAzYadir(List<String> iller) {
        System.out.println(("3 ) "));
        iller.
                stream().
                filter(t -> t.length() < 4).
                forEach(t -> System.out.print(t + " "));
    }


    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.

    public static void KarakSaysDortCokTumEl(List<String> iller) {
        System.out.println(("4 ) "));
        iller.
                stream().
                filter(t -> t.length() < 4).
                map(t -> t.toUpperCase()).
                forEach(t -> System.out.print(t + " "));
    }


    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.

    public static void karakSaysDorttenCokTkrszKucukHrfYazdir(List<String> iller) {
        System.out.println(("5 ) "));
        iller.
                stream().
                distinct(). //benzersiz, tekrarsiz yapar.
                filter(t -> t.length() > 4).
                map(t -> t.toLowerCase()).
                forEach(t -> System.out.print(t + " "));

    }


    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.

    public static void TkrszBuyukHrfAlfabetikSiraYazdir(List<String> iller) {
        System.out.println(("6 ) "));
        iller.
                stream().
                distinct().map(t -> t.toUpperCase()).
                sorted().forEach(t -> System.out.print(t + " "));
    }

    /*
     sorted()==> 2 turlu kullanimi vardir.
     i) Icerisine arguman verilmezse,burada oldugu gibi
        sorted()natural order'a gore kucukten buyuge dogal siralaam yapar
     ii) sorted(Comparator) icerisine arguman verilirse bizim belirledigimiz parametreye gore siralama yapar
 */


    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

    public static void tkrszKucukHrfUzunluklarinaGoreKcktnBygeYazdir(List<String> iller) {
        System.out.println(("7 ) "));
        iller.
                stream().
                distinct().
                map(t -> t.toLowerCase()).
                sorted(Comparator.comparing(t -> t.length())).//karsilastirma.
                forEach(t -> System.out.print(t + " "));

    }


    // Example 8: Tum elemanlarin ilk harfini buyuk digerlerini kucuk yazdiran methodu olusturunuz

    public static List<String> ilkHarfBykDigerKucukYazdir(List<String> iller) {
        System.out.println(("8 ) "));
        iller.
                stream().
                map(t -> t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase()).
                forEach(t -> System.out.print(t + " "));

        return iller;
    }


    // Example 9: Ilk harfi "E" veya "S" olanlari yazdiran methodu olusturunuz.

    public static List<String> ilkHarfEveyaSOlanlariYazdir(List<String> iller) {
        System.out.println(("9 ) "));
       return iller.
                stream().
                filter(t->t.startsWith("E")|| t.startsWith("S")).
                collect(Collectors.toList());//bir akisin sonuclarini bir listin icinde toparlamak icin kullanilir.


    }





}














