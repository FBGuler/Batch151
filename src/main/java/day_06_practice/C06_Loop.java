package day_06_practice;

import introduction.b151practices.day03scanner.Scanner01;

import java.util.Random;
import java.util.Scanner;

public class C06_Loop {
    public static void main(String[] args) {

        //Soru 1) 5 ile 10 arasindaki(5 ve  10 dahil) sayilari  ayni satirda yazdirin

        //1.yol
        for (int i = 5; i <=10 ; i++) {
            System.out.print(i+" ");
        }

        System.out.println();
        //2.yol
        int a = 5;
        while(a<11){
            System.out.print(a+" ");
            a++;
        }
        System.out.println();
        //3.yol
        a=5;
        do {
            System.out.print(a+" ");
            a++;
        }while(a<=10);

        System.out.println();
        // kullanicidan pozitif bir tamsayi alip
         //do  while loop ile sayidan kucuk pozitif tamsayilari yazdiralim

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir pozitif tam sayi giriniz.");
        int sayi = input.nextInt();
        int x = 1;
        if (sayi>0) {
            do {
                System.out.print(x+" ");
                x++;
            } while (x < sayi);

        }else{
            System.out.println("Lutfen pozitif bir sayi giriniz");
        }

        System.out.println();

        for (int i = 1; i <sayi; i++) {
            System.out.print(i+" ");
        }


        System.out.println();
        // kullanicidan istedigi kadar sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        do {
            System.out.println("Lutfen sayi giriniz");
            int scn = scan.nextInt();
            toplam += scn;
            System.out.println(toplam+" ");

        }while(toplam<500);
        System.out.println("Toplam sayi bu kadar oldu kapasite doldu:" + toplam);

        System.out.println();

        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner input1 = new Scanner(System.in);
        int m1 =0;
        int toplam1 = 0;

        System.out.println("Toplama merkezine hosgeldiniz girdiginiz sayilari toplamak icin '0' a basiniz");
        do {
            System.out.println("Lutfen toplamak istediginiz sayilari giriniz");

            m1=input1.nextInt();
            toplam1 = toplam1 + m1;

        }while(m1!=0);
        System.out.println("toplam sayi:" +toplam1);




    }
}
