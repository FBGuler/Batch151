package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi aliniz, o sayi pozitif ise ekrana "Pozitif" yazdirin, deilse ekrana "Pozitif degil" yazsirin
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = input.nextInt();
        if (sayi>0){
            System.out.println("pozitif");
        }else {
            System.out.println("pozitif degil");
        }

        String result = sayi>0 ? "Pozitif" : "pozitif degil";
        System.out.println(result);









    }
}
