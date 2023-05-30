package mini_projects.biletbusproject;

import java.util.Scanner;

public class Bilet {
    /*
    Project:

    Mesafeye ve sartlara gore otobus bileti fiyati
    hesaplayan uygulama
    Kullanicidan mesafe(km),
    yasi,
    yolculuk tipi(Tek Yon, Gidis-Donus)

    Mesafe basina ucret 0.1 TL/km olarak alin.
    (Gidis-Donus *2)
    Ilk olarak yolculugun toplam fiyatini hesaplayin ve sonrasinda ki
    kosullara gore musteriye asagidaki kurallari uygulayin;

    Kullanicidan alinan degerler gecerli (mesafe ve yas degerleri pozif sayi,
    yolculuk tipi ise 1 veya 2) olmalidir.
    Aksi taktirde kullaniciya "Hatali Veri Girdiniz!" seklinde bir uyari verilmelidir.


    1- Kisi "Yolculuk Tipini" gidis donus secmis ise bilet fiyati uzerinden
    %20 indirim uygulanir.

    2- Yas indirimi: Kisi 12 yasindan kucuk ise bilet fiyati uzerinden
    %50 indirim uygulanir.

    Kisi 12-24 yaslari arasinda ise bilet fiyati uzerinden
    %10 indirim uygulanir.

    Kisi 65 yasindan buyuk ise bilet fiyati uzerinden
    %30 indirim uygulanir.


    km=1500    100
    yas=20      12
    type=2       1
    tutar=216    9
     */

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int km = 0;
        int yas = 0;
        int yolculukTipi = 1;

        String plakaNumarasi ="78 MB 78";

        System.out.println("Lutfen gideceginiz mesafeyi km olarak veriniz.");
        km = input.nextInt();

        System.out.println("Lutfen yasinizi giriniz.");
        yas = input.nextInt();

        System.out.println("Lutfen yolculuk tipini giriniz." +
                "Sadece Gidis ise 1\nGidis-Donus ise 2");
        yolculukTipi = input.nextInt();


        if (km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double biletUcreti = km * 0.10;
            double yasIndirimOrani = 0;

            if (yas < 12) {
                yasIndirimOrani = 0.5;
            } else if (yas < 24) {
                yasIndirimOrani = 0.1;
            } else if (yas > 65) {
                yasIndirimOrani = 0.3;
            }
            biletUcreti -= biletUcreti * yasIndirimOrani;

            if (yolculukTipi==2){
                biletUcreti -= biletUcreti*0.2;
                biletUcreti *=2;
            }

            biletDokum(plakaNumarasi,km,yolculukTipi, biletUcreti,yasIndirimOrani);



        }else
            System.out.println("Hatali Ver Girdiniz..");


    }

    private static void biletDokum(String plakaNumarasi, int km, int yolculukTipi, double biletUcreti, double yasIndirimOrani) {
        System.out.println("===========Bilet Dokum=========");
        System.out.println("Otobus Plakasi : " + plakaNumarasi);
        System.out.println("Mesafe : " + km);
        System.out.println("Yolculuk Tipi : " + (yolculukTipi==1 ? "Tek yon" : "Gidis-Donus"));
        System.out.println("Bilet ucreti : " + biletUcreti);

        slowPrint("KEYIFLI YOLCULUKLAR DILERIZ..", 50);
        System.out.println();


    }

    public static void slowPrint(String text, int delay){
        for(char c : text.toCharArray()){
            System.out.print(c);
            try{
                Thread.sleep(delay);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
