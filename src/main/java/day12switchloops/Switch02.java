package day12switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        // ex 1: Kullanicidan iki sayi ve yapilacak islemi alan
        // ve +, -, *, /, % islemlerini yapan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz: ");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Lutfen yapilacak islemi giriniz. +, -, *, /, % 'den birini giriniz :");
        char opr = input.next().charAt(0);

        switch (opr) {
            case '+':
                System.out.println(a+ "+" +b +"=" +(a+b));
                break;
            case '-':
                System.out.println(a+ "-" +b +"=" +(a-b));
                break;
            case '*':
                System.out.println(a+ "*" +b +"=" +(a*b));
                break;
            case '/':
                System.out.println(a+ "/" +b +"=" +(a/b));
                break;
            case '%':
                System.out.println(a+ "%" +b +"=" +(a*b/100));
                break;
            default:
                System.out.println("Geçersiz bir değer girdiniz.");

        }



         // Ex 2:
        /*
        Kullanicidan aldiginiz character'in sesli harf olup olmadigini kontrol eden kodu yaziniz
        Sesli Harfler: a - e - i - o - u
         */

            Scanner input1 = new Scanner(System.in);
            System.out.println("Please enter a letter");
            char letter = input1.next().charAt(0);

            //1. Way:
            switch(letter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("It is a vowel");
                    break;
                default:
                    System.out.println("It is not a vowel");
            }

            //2. Way:
            System.out.println("Please enter a letter");
            String letter2 = input1.next().substring(0,1).toLowerCase();

            switch(letter2){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("It is a vowel");
                    break;
                default:
                    System.out.println("It is not a vowel");

            }

            //3. Way:
            System.out.println("Please enter a letter");
            String letter3 = input1.next().substring(0,1);

            switch(letter3){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println(letter3 + " is a vowel");
                    break;
                default:
                    System.out.println(letter3 + " is not a vowel");

            }

















        }
}
