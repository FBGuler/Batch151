package day18constructorsstatickeyword;

public class MethodOverloading {

    /*
    1)Bir method "ayni isim" ve "farkli parametre" lerle olusturulursa buna "Method Overloading" denir.
    2)"Method overloading" Java da "iyi organizasyon" icin onemlidir.
    3)Method overloading yaparken parametre 3 sekilde degistirilebilir.
             i)Parametrelerin data type larini degistirebiliriz.
             ii)Prametrelerin sayilari degistirilebilir.
             iii)Parametrelerin data type lari farkli ise yerleri degistirilebilir.
     4)Method overloading bir class in icinde olusur. bu yuzden private methodlarda overload edilebilir.
       Method overloading butun access modifier larda kullanilabilir.
    5)"static"  methodlar overload edilebilirler.
     */

    public static void main(String[] args) {


        System.out.println(add(3, 5));


    }

    public static int add (int a, int b){
        return a+b;

    }
    public static int add (int a, int b,int c) {
        return a + b + c;
    }

    public static double add (double a, int b) {
        return a + b;
    }

    public static double add (int a, double b) {
        return a + b;
    }



}
