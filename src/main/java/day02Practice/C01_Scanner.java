package day02Practice;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {


        // Kullanıcından adını, ikinci adını ve soyadını arasında 
        // bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // adının ilk karakterini, ikinci adının ilk karakterini ve soyadının 
        // ilk karakterini BUYUK harfle yazdırınız.

       Scanner input = new Scanner(System.in);
        System.out.println("please enter your name, second name and surname with spaces please..");
        String str = input.nextLine().toUpperCase().trim();
        char adIlkKarakter = str.charAt(0);

        char ikinciAdIlkKarakteri = str.charAt(str.indexOf(" ")+1);

        char ucuncuAdIlkKarakteri = str.charAt(str.lastIndexOf(" ")+1);

        System.out.println(""+adIlkKarakter+ikinciAdIlkKarakteri+ucuncuAdIlkKarakteri);
        


















    }
}
