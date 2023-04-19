package day07stringmanupulations;

import java.util.Scanner;

public class C02_StringManipulations {
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

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu\n " +
                "i) En az 8 karakterden olussun\n" +
                "ii) Bosluk icermesin\n" +
                "iii)En az bir tane buyuk harf olsun\n" +
                "iv) En az bir tane kucuk harf olsun\n" +
                "v) En az bir tane sembol olsun\n" +
                "vi) En az bir tane rakam olsun\n" +
                "giriniz...");

        String pwd = input.nextLine();

        //i)En az 8 karakterden olussun
        boolean krktrSys = pwd.length() > 7;
        boolean krktrSys2 = pwd.length() >= 8;// makbul olani >7 dir Javaya daha az is yaptirir.

        //ii) Bosluk icermesin
        boolean bosluk = !pwd.contains(" ");// " " ==>space karakteri icerir contains   !==> icermemeli

        //iii) En az bir tane buyuk harf olsun
        boolean buyukHarf = pwd.replaceAll("[^A-Z]", "").length() > 0; //(Method chain) Methodlari ayni satirda yanyana yazabiliriz buna method zinciri denir.

        //iv) En az bir tane kucuk harf olsun
        boolean kucukHarf = pwd.replaceAll("[^a,z]", "").length() > 0;

        // v) En az bir tane sembol olsun
        boolean sysmbol = pwd.replaceAll("[a-zA-Z0-9]", "").length() > 0;

        //vi) En az bir tane rakam olsun
        boolean rakamOlmli = pwd.replaceAll("[^0-9]", "").length() > 0;

        System.out.println("Password Gecerli mi : " + (krktrSys && bosluk && buyukHarf && kucukHarf
                && sysmbol && rakamOlmli));
       //Adem*567



    }
}
