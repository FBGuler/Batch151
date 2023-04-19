package day_01_practice;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

          /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz...");
        String adi = input.nextLine();

        System.out.println("Lutfen soyadinizi giriniz...");
        String soyadi = input.nextLine();

        System.out.println("Lutfen yaşınızı giriniz...");
        int yas = input.nextInt();

        System.out.println("Lutfen boyunuzu giriniz...");
        int boy = input.nextInt();

        System.out.println("Lutfen kilosunuzu giriniz...");
        int kilo = input.nextInt();


        System.out.println("Adi : "+adi+"\n"+ "Soyadi : "+soyadi+"\n"+ "Yas : "+yas+"\n"+ "Boy : "+boy+"\n"+ "Kilo : "+kilo);














    }
}
