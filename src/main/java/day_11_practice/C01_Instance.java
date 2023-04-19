package day_11_practice;

import java.util.concurrent.Callable;

public class C01_Instance {


    int sayi;//0
    String isim; //null
    boolean ogrenciMi;//false


    public static void main(String[] args) {

                /*

    sayi, isim, ogrenciMi seklinde dort tane instance variable olusturalım.
    Bu instance variable'lerin default degerlerini main icerisinde yazdıralım

          */


        C01_Instance obje1 = new C01_Instance();
        System.out.println(obje1.isim);//null
        System.out.println(obje1.sayi);//0
        System.out.println(obje1.ogrenciMi);//false

        C01_Instance obje2 = new C01_Instance();
        obje1.isim= "Hasan";
        obje2.isim = "Huseyin";

        System.out.println(obje1.isim);// Hasan

        obje1.sayi= 20;
        obje2.sayi= 25;

        System.out.println(obje1.sayi);//20
        System.out.println(obje2.sayi);//25

        //instance variable lar objeye baglidir.
        //hangi obje uzerinden degisiklik yapildiysa, yapilan bu degisiklik sadece o objeyi baglar.


    }
}
