package introduction.b151practices.day03scanner;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan bir diktortgenin iki kenar uzunlugunu aliniz
        //i) Alanini hesaplayiniz==> Kisa kenar. Uzun kenar
        //ii) Cevresini hesaplayiniz ==> 2 * Kisa kenar + 2 *Uzun kenar

        Scanner input = new Scanner (System.in);

        System.out.println("Lutfen Diktortgenin kisa kenar uzunlugunu giriniz..");
        Double shortSide = input.nextDouble();

        System.out.println("Lutfen Dikdortgenin uzun kenar uzunlugunu giriniz..");
        Double longSide = input.nextDouble();


        System.out.println("Alan = " +shortSide * longSide);
        System.out.println("Cevre = " +2*shortSide + 2* longSide);













    }



}
