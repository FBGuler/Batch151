package day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class Araba {

    public String model = "v60"; //Variable'lar pasif ozellikler
    public String renk = "Beyaz";
    public int fiyat = 1500000;

    public static void main(String[] args) {


    /*

    //Class ==> Variable (Pasif Ozellikler)
            ==> Methodlar (Aktif Ozellikler)

     */
        //Class ismi   objenin ismi   =   new   Classismi()==> Constructor;
        Scanner input       =   new   Scanner (System.in);
        Araba         volvo      =   new   Araba();

        hareket();
        dur();
        yakit();

        System.out.println(volvo.fiyat);
        System.out.println(volvo.model);
        System.out.println(volvo.renk);
        volvo.hareket();
        volvo.dur();
        volvo.yakit();



    }//main


    static void dur(){
        System.out.println("Volvo guvenli durur...");
    }

    static void yakit(){
        System.out.println("Volvolar az yakit tuketir...");
    }

    static void hareket(){ //Aktif Ozellikler
        System.out.println("Volvo cok hizli gider...");
    }

}//class

