package introduction.b151practices;

import java.sql.SQLOutput;

public class Q04_Hipotenus {
    //Hipotenüs hesaplayan bir kod yazınız


    public static void main(String[] args) {
        int a = 15;
        a = 20;
        System.out.println(a);


        System.out.println(Math.sqrt(25));
        System.out.println(Math.sqrt(16));
        System.out.println(hipotenusHesapla(3, 4) * 2);
    }

    public static double hipotenusHesapla(double dikKenar1, double dikKenar2) {
        double hipotalamus = Math.sqrt(dikKenar1 * dikKenar1 + dikKenar2 * dikKenar2);
        System.out.println("Hello world");
        return hipotalamus;

    }

    public static int dikdotgenAlanHesapla(int a, int b) {
        int alan = a * b;
        return alan;

    }


}







