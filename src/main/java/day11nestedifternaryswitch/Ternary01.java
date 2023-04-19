package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan iki sayidan kucuk olani ekrana yazdiriniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int first = input.nextInt();
        int second = input.nextInt();

        //1.Yol:

        if (first < second) {System.out.println(first);} else {System.out.println(second);}


        //2.Yol: Use Ternary

        int result = first < second ? first : second;
        System.out.println(result);










    }
}
