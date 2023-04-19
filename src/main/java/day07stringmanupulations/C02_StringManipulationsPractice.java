package day07stringmanupulations;

import java.util.Scanner;

public class C02_StringManipulationsPractice {
    public static void main(String[] args) {

        /*

        Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz

        i) En az 8 karakterden olussun
        ii) Bosluk icermesin
        iii)En az bir tane buyuk harf olsun
        iv) En az bir tane kucuk harf olsun
        v) En az bir tane sembol olsun
        vi) En az bir tane rakam olsun


         */

        Scanner src = new Scanner(System.in);
        System.out.println("Lutfen bu kurallara gore\n" +
                "         i) En az 8 karakterden olussun\n" +
                "        ii) Bosluk icermesin\n" +
                "        iii)En az bir tane buyuk harf olsun\n" +
                "        iv) En az bir tane kucuk harf olsun\n" +
                "        v) En az bir tane sembol olsun\n" +
                "        vi) En az bir tane rakam olsun\n" +
                "            bir password giriniz.." );

        String x = src.nextLine();
        System.out.println("x = " + x);

       // i)
        boolean i = x.length() >7;


       // ii)
        boolean ii = !x.contains(" ");


       // iii)
        boolean iii = x.replaceAll("[^A-Z]", "").length()>0;

        
        // iv)
        boolean iv = x.replaceAll("[^a-z]","").length()>0;

        
        // v)
        boolean v = x.replaceAll("[a-zA-Z0-9]", "").length()>0;


        // vi)
        boolean vi = x.replaceAll("[^0-9]", "").length()>0;

        System.out.println("Password Gecerli mi : " + (i && ii && iii && iv && v && vi ));

       



































    }
}
