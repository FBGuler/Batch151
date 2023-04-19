package operations01;

import java.util.Scanner;

public class C02_operations {
    public static void main(String[] args) {

        //Kullanicidan iki sayi isteyiniz ve bunlari assignment operation islemlerini yapiniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println(sayi1);//
        sayi1=sayi1+4;
        System.out.println(sayi1);//
        sayi1+=4;
        System.out.println(sayi1);
        System.out.println(sayi1/=sayi2);//2
        System.out.println(sayi1);//2
        sayi2=sayi1;
        System.out.println(sayi2);
        sayi1%=sayi2;
        System.out.println(sayi1);//0




















    }
}
