package day_01_practice;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isim ve soy isminizi giriniz: ");
        String isimSoyisim = input.nextLine().toUpperCase();
        char ilkHarf = isimSoyisim.charAt(0);
        String harf = isimSoyisim.split(" ")[1].charAt(0) + "";
        System.out.println(ilkHarf + harf);
        
        //IKINCI YOK 
        char harf1 = isimSoyisim.split(" ")[1].charAt(0);


        //3. yol (Hocanin yolu)
        char harf2 = isimSoyisim.charAt(isimSoyisim.indexOf(" ") + 1);

        System.out.println(""+ilkHarf + harf2);

















    }
}
