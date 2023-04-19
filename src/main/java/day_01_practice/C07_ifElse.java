package day_01_practice;

import java.util.Scanner;

public class C07_ifElse {
    public static void main(String[] args) {

        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz: ");
        System.out.println("Lutfen ikinci sayiyi goriniz: ");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a>b){
            System.out.println(" ilk sayi buyuktur ikinciden buyuktur..");
        } else {
            System.out.println(" ilk sayi ikinciden buyuktur degildir..");
        }



















    }
}
