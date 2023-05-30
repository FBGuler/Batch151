package day15loopsarrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Calisma01 {
    public static void main(String[] args) {

// Kullanicidan coklu datayi bir array e yerlestirebilmesi icin kodu yaziniz.

        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen gireceginiz datanin miktarini yaziniz..");
        int lenght = input1.nextInt();


        String[] studentsNames = new String[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Please enter the " + (i + 1) + ". Name of Student :");
            System.out.println("Please, enter 'q' for exit. ");
            String str = input1.next();

            if (str.equalsIgnoreCase("q")) {
                break;
            } else {
                studentsNames[i] = str;
            }
        }
        System.out.println(Arrays.toString(studentsNames));


        //Example1 :
        /*
        +,-,*,/,% islemlerini yapan bir hesap makinasi olusturunuz.
        Kullanici 'q' ya basmadigi surece isleme secip yapabilsin.
         */

        /*        Scanner input = new Scanner(System.in);
                double num1, num2;
                char operator;

                do {
                    System.out.println("Lutfen yapmak istediginiz islemi secin (+, -, *, /, %) veya cikmak icin 'q' basin: ");
                    operator = input.next().charAt(0);

                    if (operator != 'q') {
                        System.out.println("Lutfen iki sayi girin: ");
                        num1 = input.nextDouble();
                        num2 = input.nextDouble();

                        switch (operator) {
                            case '+':
                                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                                break;
                            case '-':
                                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                                break;
                            case '*':
                                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                                break;
                            case '/':
                                if (num2 != 0) {
                                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                                } else {
                                    System.out.println("Sifira bolme hatasi!");
                                }
                                break;
                            case '%':
                                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                                break;
                            default:
                                System.out.println("Gecersiz islem secildi!");
                                break;
                        }
                    }

                } while (operator != 'q');
*/

           //Example 2: Specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz.

       // 1.way
        String [] names = {"K", "C", "R", "A", "S"};
        String el = "X";
        /*int counter = 0;

        for (String w: names) {
           if (w.equalsIgnoreCase(el)){
               counter++;
           }
        }
        if (counter>0){
            System.out.println("Array has X.");
        }else System.out.println("Array no has X .");

        */

        //2. way

        Arrays.sort(names);
        int result= Arrays.binarySearch(names,"X");
        if (result<0){
            System.out.println("Array has no  " + el );
        }else System.out.println("Array has  " + el);




        //Example 2: Size verilen bir arrayda kac cumle ve kac harf old yazdiran kodu yaziniz.
        String s = "Java is easy. Learn Java earn money.";
        String kelime [] = s.split(" ");
        int kacKelime = kelime.length;
        System.out.println(kacKelime);//7

        String harfler [] = s.replaceAll("[^a-zA-Z]", "").split("");
        int kacHarf = harfler.length;
        System.out.println(kacHarf);//































            }
        }








