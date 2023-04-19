package day02Practice;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz..");
        char x = input.next().charAt(0);

        System.out.println((x>='a' && x<='z') || (x>='A'&&x<='Z') ?
                (x>='a' && x<='z' ? "Kucuk harf" : "Buyuk harf"):("Harf degil"));





















    }
}
