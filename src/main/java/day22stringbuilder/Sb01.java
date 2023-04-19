package day22stringbuilder;

public class Sb01 {
    public static void main(String[] args) {
        /*
        1)"StringBuilder" String ureten bir Class dir.
        2)String Class kullanarak String uretiriz Java nicin "StringBuilder" Class i da olusturdu?
          "String" Class "immutable"(degistirilemez) String uretir, "StringBuilder" class "mutable" (degistirilebilir) String uretir.
        3)"immutable" demek original degerin korunmasi, degistirilemez olmasi demektir.
          "mutable" demek original degerin degistirilebilir olmasi demektir.
        4)"capacity" Javanin size verdigi data depolama yer sayisidir.
        Lenght ise size verilen data depolama yerinin kullanilan kismidir.
        5)Java baslangic olarak size capacity i 16 olarak verir.
        Siz verilen capacity i asarsaniz Java yeni capaciteyi varolanin 2 katinin 2 fazlasi olacak sekilde degistirir.

         */

        String s = "Java";

        s=s + "!";

        String u = "Apex";
        String v ="Apex";
        String y = "C++";


        //1.Way:
        StringBuilder t = new StringBuilder("Python");
        System.out.println(t);

        //String builder lara nasil ekleme yapilir.
        t.append("!").append("....");//Python!....
        System.out.println(t);//Python!

        //2.Way :
        StringBuilder r = new StringBuilder();
        System.out.println();

        r.append('c');
        System.out.println(r);

        //"capacity" ve "lenght" arasindaki fark nedir?
        StringBuilder sb1 = new StringBuilder("Money");

        int capacity = sb1.capacity();//21 depolamak icin bu kadar yer veriyor
        System.out.println(capacity);

        int lenght = sb1.length();//5
        System.out.println(lenght);

        //Default capacity i degistirebilir miyiz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2);//2

        sb2.append("...");
        System.out.println(sb2.capacity());//6
















    }
}
