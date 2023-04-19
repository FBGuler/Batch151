package introduction.b151practices.day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz
        Scanner input = new Scanner (System.in);

        System.out.println("Lutfen Iki sayi giriniz");

        Double firstNumber = input.nextDouble();
        Double secondNumber  = input.nextDouble();

        System.out.println( firstNumber + secondNumber );
        System.out.println( firstNumber - secondNumber );
        System.out.println( firstNumber * secondNumber );
        System.out.println( firstNumber / secondNumber );





    }

}
