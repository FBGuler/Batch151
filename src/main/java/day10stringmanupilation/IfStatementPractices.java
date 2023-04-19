package day10stringmanupilation;

import java.util.Scanner;

public class IfStatementPractices {
    public static void main(String[] args) {

        // Ex: Verilen bir karakter buyuk harf ise,
        // ekrana "Buyuk Harf " yazdiran kodu yaziniz"

        char ch = 'A';

        if (ch>='A' && ch<'Z'){
            System.out.println("Buyuk harf");
        }

        // verilen sayi cift sayi ise ekrana "cift sayi" yazdiran kodu yaziniz

        int ciftSayi = -24;
        if (ciftSayi%2==0){
            System.out.println("cift sayi");
        }


        // Ex Verilen bir sayi 300'den kucuk veya 1200 'den buyuk
        // ise "Harika Sayi" yazdiran kodu yaziniz

        int a = 123;
        if (a<300 || a>1200){
            System.out.println("Harika Sayi");
        }

        // Kullanicidan alinan datanin tek mi cift mi oldugunu yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int x = input.nextInt();
        if (x%2==0) {
            System.out.println("Verilen sayi cifttir..");
        } else {
            System.out.println("Verilen sayi tektir..");
        }

        // ex; verilen bir sayinin negatifmi pozitif mi notr mu old soyleyen kodu yaziniz

        System.out.println("Lutfen bir sayi girinz..");
        int b = input.nextInt();
        if (b>0){
            System.out.println("Pozitiftir");
        }else if ( b<0){
            System.out.println("Negatif");
        }else {
            System.out.println("Notr");
        }














    }
}
