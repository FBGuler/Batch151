package day_02_practice;


import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {



                // INTERWIEW QUESTIONS
                // Ex : Kullanicidan aldiginiz bir sekil ile asagidaki sekli olusturan kodu yaziniz

        /*

                  A     // 2 space+ ch + 2 space
                 A A    // 1 space + ch + 1 space +ch + 1 space
                A A A   //  1 ch + 1 space +1 ch + 1 space+ 1 ch
         */

                Scanner input = new Scanner(System.in);
                System.out.println("Lutfen bir karakter veriniz...");
                char ch = input.next().charAt(0);
                System.out.println("  "+ch+"  ");
                System.out.println(" "+ch+" "+ch+" ");
                System.out.println(ch+" "+ch+" "+ch);

                // Ex : Kullanicidan 2 sayi alip 4 islem yapan ve islemlerin
                // sonuclarini ekrana yazdiran basit bir hesap makinesi kodunu yaziniz
        System.out.println("Lutfen 2 sayi giriniz..");
            double sayi1 = input.nextDouble();
            double sayi2 = input.nextDouble();
        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1/sayi2);
        System.out.println(sayi1*sayi2);


        //Ex : Kullanicidan alacagimiz 5 basamakli bir sayinin
        // ilk iki ve son iki rakamlari toplamini bulan kodu yaziniz.

        System.out.println("Lutfen 5 basamakli bir sayi giriniz");//12345
        int sayi = input.nextInt();
        int a = sayi%10;//5
        int b = sayi/10;//1234
        int c = b%10;//4
        int d = sayi/1000;//12
        int e = d%10;//2
        int f = sayi/10000;//1
        System.out.println(a+c+e+f);


        int sayilarintop=sayi%10+sayi/10%10+sayi/1000%10+sayi/10000;
        System.out.println(sayilarintop);




























    }
}
