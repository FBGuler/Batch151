package day02Practice;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk tam sayi giriniz..");
        int x = input.nextInt();
        System.out.println("Lutfen son tam sayi giriniz..");
        int y = input.nextInt();

        String result = x==y ? "Sayilar birbirine esit" : x>y ? ("Buyuk sayi"+ x) : ("Buyuk sayi"+ y) ;
        System.out.println("result = " + result);



























    }
}
