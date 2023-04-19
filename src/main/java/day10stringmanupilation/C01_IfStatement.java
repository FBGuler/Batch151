package day10stringmanupilation;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        // If it rains; I will cancel the picnic.

        // Ex: Verilen bir karakterin buyuk harf ise,
        // ekrana "Buyuk Harf " yazdiran kodu yaziniz"

        char ch = 'A';
        if (ch>='A'&& ch<='Z'){
            System.out.println("Buyuk harf");
        }

         // verilen sayi cift sayi ise ekrana "cift sayi" yazdiran kodu yaziniz

        int ciftSayi = 24;
        if (ciftSayi%2==0){
            System.out.println("cift sayi");
        }


         // Kodun dinamik yazilmasi icin variable in ismi yazilir.
        //Direk deger yazilirsa hurd coding yani tek datalik kod olur.

        // Ex VErilen bir sayi 300'den kucuk veya 1200 'den buyuk
       // ise "Harika Sayi" yazdiran kodu yaziniz

        int a = 123;
        if (a<300 || a>1200) {
            System.out.println("Harika Sayi");
        }

        // Kullanicidan alinan datanin tek mi cift mi oldugunu yazdiran kodu yaziniz

        //I. yol bagimsiz if statement
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();
        if (sayi%2==0){
            System.out.println("Cift sayidir");
        }
        if (sayi%2!=0){
            System.out.println("Tek sayidir");
        }

        // II. yol (daha kolayi ) "else"
        if (sayi%2==0){
            System.out.println("Cift sayidir");
        }else {
            System.out.println("Tek sayidir");
        }


        // ex; verilen bir sayinin negatifmi pozitif mi notr mu old soyleyen kodu yaziniz

        if (sayi>0){
            System.out.println("Pozitif sayi");
        }else if(sayi ==0 ){
            System.out.println("Notr sayi");
        } else {
            System.out.println("Negatif sayi");
        }










    }
}
