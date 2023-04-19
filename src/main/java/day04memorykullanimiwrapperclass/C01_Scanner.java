package day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class C01_Scanner {

    //Kullanicidan aldiginiz 5 basamakli bir sayinin ilk iki ve son
    //2 basamagindaki sayilarin toplamini yazdiran kodu olusturunuz.


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;

        System.out.println("Lutfen 5 basamakli sayi giriniz...");

        int number = input.nextInt();


        //Son rakami al
        int lastDigit = number%10 ; //1
        // Sayiyi kucult
        number=number/10 ; //3867
        //Sondan ikinci rakami al
        int lastSecondDigit = number%10 ; //7
        number=number/10 ; //386
        int lastThirdDigit = number%10 ; //6
        number=number/10; //38
        int lastFouthDigit = number%10 ; //8
        number=number/10; //3
        int lastFifthDigit = number%10 ; //3

        System.out.println("ilk iki ve son iki basamagindaki sayilarin toplami==>"+
                (lastDigit+lastSecondDigit+lastFouthDigit+lastFifthDigit));












    }






}
