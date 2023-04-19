package day03methodcreationscanner;

import java.util.Scanner;

public class C03_MethodCreation {

    public static void main(String[] args) {

        //Dikdortgenin alanini hesaplatan bir method olusturunuz.

        dikdortgeninAlani (10,20) ;

        //Kare Alanini hesaplatan methodu yaziniz

        System.out.println(kareAlani (4)+2);

        // Kullanicidan alacaginiz 4 basamakli sayinin ilk ve sonrakaminin toplamini
        //ekrana yazdiran programi yaziniz

        // % ==> Modulus operatoru sayinin bolumundan kalan sayiyi verir
        // 6574 %10 ==> 4

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz...");
        int sayi = input.nextInt();
        int sonRakam = sayi%10 ;
        int ilkRakam = sayi/1000 ;
        System.out.println("Ilk Rakam + Son Rakam ==> " + (sonRakam+ilkRakam));


        /*


        Javada method nasil olusturulur?
        1) Javada method main'in disinda olusturulur
        2)Tekrar tekrar kullanmamiz gerekiyorsa methos olustururuz

          Access Modifier + Return Type + methodIsmi + () +{}

          Islem yapilacak olan sayilari methodIsmi() parantezin icine eklenir.

        Scope ==> Kapsam Alani bir variable'in bir degerin hangi alanda kapsam icinde old gosterir.

         */

        toplamaYap(30,87);
        carpmaYap(12,6);


        //3) Verilen 3 sayidan ilk ikisini carpan ve sonucu
        // ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.


        }

        // 4) Verilen bir ondalikli sayisinin kupunu hesaplayip kullandiran bir method olusturunuz



        //5) Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz






    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    static void toplamaYap(int a, int b) { //Access modifiers defult old icin bir sey yazmadik.
        System.out.println(a+b);
    }

    private static int kareAlani(int a) {
        return a*a;
    }

    private static void dikdortgeninAlani(int a, int b) {

        System.out.println(a*b); //200
    }


} //class
