package introduction.b151practices.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz.


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bes basamakli bir sayi giriniz..");
        int number = input.nextInt();
        //bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalani almaliyiz.
        //%==. modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir.
        //dolayisiyla %10 her zaman bize birler basamaginda bulunan basamagi verir.
        //bir tamsayiyi bir tam sayiya bolerseniz java sonucu kesinlikle bir tam sayi yapar.
        //java bu durumda yuvarlama yapmaz. ondalikli kismi iptal eder.
        //dolayisiyla bir tam sayiyi 10 a bolersen birler basamagini silmis oluruz.

        //son rakami al.
        int lastDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan iki rakami al
        int lastSecondDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan ucuncu rakami al
        int lastThirdDigit = number%10;
        //sayi kucult
        number=number/10;

        //sondan dorduncu rakami al
        int lastForthDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan besinci rakami al
        int lastFifthDigit = number%10;
        //sayiyi kucult
        number = number/10;

        System.out.println(lastDigit+lastSecondDigit+lastForthDigit+lastFifthDigit);









    }





}
