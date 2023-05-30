package mini_projects.aracsigortaappproject;

    /*
      Proje: Arac Sigorta Prim Hesaplama
      Arac tipleri : Otomobil, kamyon, otobus, motosiklet
      Otobus: 18-30 koltuk veya 31 ve ustu koltuk
      Tarife Donemi : Aralik 2022, Haziran 2022
      1.donemi : Haziran 2022                          2.donem : Aralik 2022
        otomobil:2000                                  2500
        kamyon:3000                                    3500
        otobus: tip1: 4000  tip2: 5000                 tip1: 4500  tip2: 5500
        motosiklet: 1500                               1750
        Hatali giriste hesaplama basarisiz uyarisi verip tekrar menu gosterin.

   */

import java.util.InputMismatchException;
import java.util.Scanner;

public class AracSigortaApplication {
    public static void main(String[] args) {

        start();
    }

    private static void start() {
        Scanner input = new Scanner(System.in);
        boolean isFail; //hesaplamanin durumunu kontrol etmek icin..
        //hatali giriste veya yeni islem secenegi sunmak icin menu tekrar gosterilsin: while/do-while

        do {
            isFail = false;
            System.out.println("== Zorunlu Sigorta Primi Hesaplama ==");
            System.out.println("Tarife donemi seciniz: ");
            System.out.println("1. Haziran 2022 ");
            System.out.println("2. Aralik 2022 ");

            //Exception handle etme:
            int term = 0;
            try {
                term = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Gecersiz giris, lutfen sayi giriniz.");
            }
            input.nextLine();

            //girilen donem gecerli mi ;
            if (term == 1 || term == 2) {
                Arac arac = new Arac();
                String termName = term== 1 ? "Haziran 2022" : "Aralik 2022";
                System.out.println("Arac tipini giriniz : ");
                String select = input.next(); //kamyon
                arac.type = select;
                arac.countPrim(term);
                if (arac.prim > 0) {

                    System.out.println("Hesaplama islemi basariyla tamamlandi.");
                    //sonucu yazdir
                    System.out.println("Arac tipi : " + arac.type);
                    System.out.println("Tarife donemi : " + termName);
                    System.out.println("Aracinizin ilgili donem sigorta primi : " + arac.prim);
                    isFail = isAgain(input);
                }else {
                    System.out.println("Hesaplama basarisiz, tekrar deneyiniz!!!");
                    isFail = isAgain(input);
                }

            } else {
                    System.out.println("Hatali girs!!!");
                isFail = true;
            }


        } while (isFail);
        System.out.println("Iyi gunler dileriz..");


    }

    private static boolean isAgain(Scanner input) {
        boolean isFail;
        System.out.println("Yeni islem icin 1, cikis icin 0 veya herhangi bir sayi giriniz :");
        int choice = input.nextInt();
        if (choice == 1)
            isFail = true;
        else
            isFail = false;
        return isFail;
    }
}
