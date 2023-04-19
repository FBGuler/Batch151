package day06typecastingstringmanipulation;

import java.sql.SQLOutput;

public class C01_StringManipulationsPractice {
    public static void main(String[] args) {

        String a = "Benim Tek Rakibim Dunku Ben";

        // i) Butun "a" harflerini buyuk harf yazdiriniz

        System.out.println(a.replaceAll("e", "E"));

        // ii) a Stringte karakter sayisini bulunuz

        System.out.println(a.length()); //27

        //iii) "BASTAN IKINCI VE SONDAN IKINCI KARAKTERI ALINIZ VE YAN YANA YAZDIRINIZ"
        
        char x =a.charAt(1);
        char y =a.charAt(25);

        System.out.println(""+x+y);

        //iv) a Stringindeki ilk dort karakteri aliniz

        System.out.println(a.substring(0,4)); //Beni

        //v) a string 4. indexi dahil 7. haric yazdiriniz

        System.out.println(a.substring(4,7)); //m T

        //VI) a stringteki rakip kelimesini aliniz

        System.out.println(a.substring(10,15)); //Rakib
        System.out.println(a.substring(10)); //Rakibim Dunku Ben

        //VII)  A sTRING INDE "bim" olup olmadigini kontrol ediniz

        boolean vii = a.contains("bim");
        System.out.println(vii); //true

        //viii) a Stringinin "T" ile basladigini kontrol edin

        System.out.println(a.startsWith("T")); // false

        //ix) "rini" 10. indekstemi
        System.out.println(a.startsWith("Rak",10));//true

       



























    }
}
