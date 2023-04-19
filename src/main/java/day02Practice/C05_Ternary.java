package day02Practice;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        /*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz..");
        int x = input.nextInt();
        String result = x%2==0 ? "Cift sayi " : ""+(x+3) ;
        System.out.println("result = " + result);






















    }
}
