package day06typecastingstringmanipulation;

import java.util.Locale;

public class C01_StringManipulation {
    public static void main(String[] args) {

      String a = "Benim Tek Rakibim Dunku Ben";
      
      //************ toUpperCase() ****************
      String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper); //a string inin buyuk harfle yazdirir


        //************ toLoverCase() ****************
        
        String aLover = a.toLowerCase();
        System.out.println("aLover = " + aLover);// a String ini kucuk harfle yazar

        //*************  charAt() *******************
        System.out.println("Ilk harfi yazdir==>"+a.charAt(0));//B
        System.out.println("10. Harfi giriniz==>" + a.charAt(10)); //R

        //"BASTAN IKINCI VE SONDAN IKINCI KARAKTERI ALINIZ VE YAN YANA YAZDIRINIZ"

           char firstChar = a.charAt(1);
           char lastChar = a.charAt(25);
        System.out.println("" + firstChar + lastChar); //ee

        // a Stringte karakter sayisini bulunuz

        System.out.println(a.length()); //27

        // a Stringindeki ilk dort karakteri aliniz

        System.out.println("sub1 = " + a.substring(0,4)); // [04), 0 dahil, 4 dahil degil

        // a string 4. indexi dahil 7 haric yazdiriniz

        System.out.println(a.substring(4,7)); //m T

        // a stringteki rakip kelimesini aliniz

        System.out.println(a.substring(10,15)); //Rakib

        System.out.println(a.substring(10)); //Rakibim Dunku Ben..

        // A sTRING INDE "bim" olup olmadigini kontrol ediniz


        //************ contains() ****************

        System.out.println(a.contains("bim")); //true

        //************ startsWith() ****************

        // a Stringinin "T" ile basladigini kontrol edin

        System.out.println(a.startsWith("T")); //true

        System.out.println(a.startsWith("Tek", 6));

        //prefix: baslangic ,offset: at gitsin
        //universite numaralari, yil+bolum kodu+kacinci sirada girdigi

        String str = "010205039";
        System.out.println(str.startsWith("05",4));













    }
}
