package day_02_practice;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {

                 /*
        Kullanicidan bir gun alin
        Eger gun cuma ise "Muslumanlar Icin Kutsal Gun" ;
        Eger gun cumartesi ise "Yahudiler icin Kutsal Gun"
        Eger gun pazar ise "Hristyanlar icin Kutsal Gun"
        yazdiran kodu olusturunuz
          */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz..");
        String gun = input.next().toLowerCase();

        if (gun.equals("cuma")){
            System.out.println("Muslumanlar Icin Kutsal Gun");
        }else if (gun.equals("cumartesi")){
            System.out.println("Yahudiler icin Kutsal Gun");
        }else if (gun.equals("pazar")){
            System.out.println("Hristyanlar icin Kutsal Gun");
        }else{
            System.out.println("Kutsal gun degil");
        }

        //2. yol
        switch (gun){
            case "cuma":
                System.out.println("Muslumanlar Icin Kutsal Gun");
                break;
            case "cumartesi":
                System.out.println("Yahudiler Icin Kutsal Gun");
                break;
            case "pazar":
                System.out.println("Hristiyanlar Icin Kutsal Gun");
                break;
            default:
                System.out.println("Siradan bir gun");
        }


         /*
Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola "
3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
 */

        System.out.println("Lutfen 3 karakterden daha uzun bir kelime giriniz");
        String str = input.next();
        if(str.length()<=3){
            System.out.println("Karakterden Daha Uzun Bir Kelime Girmelisiniz ");
        }else{
            String sonUcHarf= str.substring(str.length()-3);
            System.out.println(sonUcHarf+str+sonUcHarf);
        }










    }
}
