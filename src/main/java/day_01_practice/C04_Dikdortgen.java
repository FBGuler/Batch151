package day_01_practice;

import java.util.Scanner;

public class C04_Dikdortgen {
    public static void main(String[] args) {

        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen dikdortgenin a kenarini giriniz..");
        int a =input.nextInt();
        System.out.println("Lutfen dikdortgenin b kenarini giriniz..");
        int b = input.nextInt();
        System.out.println("Dikdorgenin cevresi = "+ (a+b)*2);






















    }
}
