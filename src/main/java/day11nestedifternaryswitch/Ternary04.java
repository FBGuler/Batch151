package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {


        /*
        Kullanicidan aldigimiz sayi cift ise yarisini ekrana yazdirini,
        tek ise "Bu sayi ikiye bolunmez." yazdiriniz
         */

        /*
        1) Ternary'de true ve false durumlari icin size verilen data tipleri farkli ise olusturdugunuz container in data tipini Object yapin.
        2) Object bir class tir. Object Javada ki butun class larin parent idir. Yani Ademidir. Object classin parent i yoktur.
        3) Java da parent i olmayan tek class "Object Class" tir
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer..");
        int num = input.nextInt();

        Object result = num%2==0 ? num/2 : "Bu sayi ikiye bolunmez.";
        System.out.println("result = " + result);







    }
}
