package day07stringmanupulations;

public class C01_StringManupilations {
    public static void main(String[] args) {

        String s= "Learn Java earn money" ;
        // *********************endsWith ()*********************

        /*
         endswhit()  Metnin belirli bir data ile bitip bitmedigini verir.
         Bize boolean bir sonuc dondurur.
         Tek karakterde coklu karakterde kullanilabilir.
        */


        //*********************replace**********************
         /*
         Metnin icerisindeki belirli bir datanin yerine verilen diger datayi yerlestirir.
         Bize String bir data döndürür.
         Tekli (Char) karakterler ile de coklu (String) karakter ile de calisir.
         Ancak her iki tarafta da cift tirnak "" ya da her iki tarafta da tek tirnak '' kullanilmalidir.
         */

        // Examp: S Stringini "money" ile bitip bitmedigini kontrol ediniz.

        System.out.println(s.endsWith("money"));//true
        boolean inEnd = s.endsWith("money");
        System.out.println("inEnd = " + inEnd); //true

        //Example: s Stringindeki "money" kelimesini "dolar" kelimesi ile yer degistiriniz

        String s1 = s.replace("money", "dolar") ;
        System.out.println("s1 = " + s1); // Learn Java earn dolar

        System.out.println(s.replace("money","dolar"));


        //ex: s Stringindeki learn kelimesini win kelimesine ceviriniz

        System.out.println(s.replace("earn", "win")); //Lwin Java win money.

        //Ex: s Stringindeki "a" harflerini "*" ile degistiriniz

        System.out.println(s.replace("a", "*"));
        System.out.println(s.replace('a', '*'));//tek tirnak yani char i secmek daha iyi, daha az yer kaplar

        // Ex: s String "n" harfi ile "***" degistiriniz

        System.out.println(s.replace("n", "***"));

        //Ex: s String tum "e" harflerini siliniz

        System.out.println(s.replace("e",""));

        //Char container icerisine mutlaka bir karakter yerlestirilmelidir.
        //Space bir carakterdir ama hiclik java da char icin kullanilamaz.
        //Bu nedenle silme islemi yaparken mutlaka String kullanilamaz.


               //********************* replaceAll() **********************
         /*
         Metnin icerisindeki belirli tum datanin yerine verilen diger datayi yerlestirir.
         Bize String bir data döndürür.
         Bir grup datayi ifade edebilmek icin Regular Expression (Regex) kullanilir
         */


        String t = "Yucel 25 ya$indadir sandik ama 30' mis." ;

        // Ex:t Stringindeki tum rakamlari "*" a ceviriniz

        System.out.println(t.replaceAll("[0-9]", "*")); // [0-9] deniyor tum rakamlar icin replaceAll kullaniliyor.

        /*
        En cok kullanilan Regexler
        1) Tum Rakamlar ==> [0-9]
        2) Tum Kucuk harfler==>[a-z]
        3) Tum Buyuk harfler ==>[A-Z]
        4) Tum harfler ==> [a-zA-Z]
        5) Tum Harfler ve Rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama Isaretleri ==> \\p{Punct}
        7) Tum Sesli harfler ==> [aeiouAEIOU]

        ^ ==> Haricinde, -den farkli
        1) Tum Rakamlar haric ==> [^0-9]
        2) Tum Kucuk harfler haric==>[^a-z]
        3) Tum Buyuk harfler haric==>[^A-Z]
        4) Tum harfler haric==> [^a-zA-Z]
        5) Tum Harfler ve Rakamlar haric==> [^a-zA-Z0-9]
        6) Tum noktalama Isaretleri haric==> \\p{Punct}
        7) Tum Sesli harfler haric==> [^aeiouAEIOU]




         */

        // Ex: t Stringindeki tum harfleri ve tum rakamlari ! ceviriniz

        System.out.println(t.replaceAll("[a-zA-Z0-9]","!"));

        // Ex: t Stringindeki tum space ler disindaki karakterleri "+" ya donusturunuz

        System.out.println(t.replaceAll("[^ ]", "+"));

        // Ex: t String teki tum kucuk farfler disindaki karakterleri "?" e donustur

        System.out.println(t.replaceAll("[^a-z]", "?"));

        //Ex: t Stringindeki tum sesli harfler disindaki karakterleri "&" donusturunuz

        System.out.println(t.replaceAll("[^aeiouAEIOU]","&"));



        String m ="Dolma Kalem";
        System.out.println(m.replace("Kalem","Biber"));

        String n = "Mehmet Fatih bey 20 yasinda QA_Developer kursun $ dolarla maas kazanmistir...";
        System.out.println(n.replaceAll("[0-9]","*"));
        System.out.println(n.replaceAll("[A-Za-z0-9]","@"));
        System.out.println(n.replaceAll("[^ ]","+"));
        System.out.println(n.replaceAll("[^a-z]", "*"));
        System.out.println(n.replaceAll("[^aeiouAEIOU]","&"));














    }
}
