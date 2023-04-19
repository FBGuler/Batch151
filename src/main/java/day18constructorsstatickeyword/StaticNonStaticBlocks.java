package day18constructorsstatickeyword;


/*
1)"static block"lar "static variable"lara "ilk degerlerini atamak"(initialize)icin kullanilir.
2)"static" bir variable a deger atamak icin kod yazmaniz gerekirse "static block" kullaniniz.
3)"static" bir variable a deger atamak icin yazilmasi gereken kod main method icine de yazilabilir ama
"static block" icine yazilan kod main method icine yazilan koddan once calisir.
4)Bir class ta birden fazla static varsa ilk yazilan ilk calisir.

 */

import java.time.LocalDate;

public class StaticNonStaticBlocks {

    //static variable lar "static block" kullanilmadan da "initialize" edilebilirler.
    public static double pi = 3.14;

    //static variable lar "static block" kullanilmadan da "initialize" edilebilirler.
    //Asagidaki gibi static bir variable a deger atamak icin kod yazmaniz gerekirse "static block" kullaniniz.
    public static double price;

    static {
        System.out.println("Hey I am a static block");
        LocalDate d = LocalDate.now();
        if (d.getMonthValue() == 3) {
            price = 1000;
        } else {
            price = 1200;
        }
    }
    static{
        System.out.println("Hey I am a static block 2");
    }

  //bu kodu static block icine degilde main nin icine yazsakta calisir. Ama static block lar class static old icin olusturulurken class a monte edilir static blocklar main den once calistirilir.

    public static void main(String[] args) {


        System.out.println("Hey I am a main method");


        LocalDate d = LocalDate.now();
        if (d.getMonthValue() == 3) {
            price = 1000;
        } else {
            price = 1200;
        }





    }



}
