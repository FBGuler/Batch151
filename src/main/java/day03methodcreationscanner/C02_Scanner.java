package day03methodcreationscanner;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,

        // ulkesini sevip sevmedigini , maasini soran bir program yaziniz



        //1) Adim Object Olusturma
        Scanner input =new Scanner(System.in);


        //2) Kullaniciya ne yapacagini soyluyoruz
        System.out.println(" Lutfen maasinizi giriniz ");


        //4) Adim kullanicidan alinan datalar yapisina ve buyuklugune gore bir Variable'a yerlestirilir.
        long maas1 = input.nextLong();


        //4) Kullanicini verdigi bilgileri teyit edebilmesi vs. icin yazdiriyoruz.
        System.out.println("maas = " + maas1);


        Scanner input2 =new Scanner(System.in);//input2 Gonul hanim

        System.out.println("Lutfen cinsiyetinizi girinizi Kadin ise K erkek ise E harfi giriniz");// Gonul hanim yonlendirmeyi gordu
        char gender =input2.next().charAt(0);//gender == cinsiyet


        System.out.println("Lutfen adinizi giriniz");
        String isim = input2.next();

        System.out.println("Lutfen nereli oldugunuzu giriniz");
        String memleket= input2.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input2.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        short boy =input2.nextShort();

        System.out.println("Lutfen yasadiginizi ulkeyi sevip sevmediginizi yaziniz True / False olarak");
        boolean seviyorMu= input2.nextBoolean();

        System.out.println("Lutfen maasinizi giriniz");
        long maas = input2.nextLong();

        System.out.println("***************** Kimsin ***********************");
        System.out.println("gender  : "+gender+ "\nisim : "+isim+"\nmemleket : "+memleket+"\nyas : "+yas+"\nboy : "+boy+"\nseviyorMu : "+seviyorMu+"\nmaas : "+maas);



        /* Scanner kenarDikdortgen =new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");

        int num1 = kenarDikdortgen.nextInt();
        int num2 = kenarDikdortgen.nextInt();

        System.out.println( "Dikdortgen alan hesabi ==>" + num1*num2 );



        Scanner kubunAlani = new Scanner(System.in) ;

        System.out.println("Lutfen bir sayi giriniz");

        byte a = kubunAlani.nextByte() ;
        System.out.println(" Kubun alani ==> " + 6*(a*a));

        Scanner areaOfTheRectangle = new Scanner(System.in) ;
        System.out.println("Lutfen iki sayi giriniz");
        byte width = areaOfTheRectangle.nextByte();
        byte length = areaOfTheRectangle.nextByte();
        System.out.println("Area of a rectangle==>" + width*length);

        Scanner perimeterOfRectangle = new Scanner (System.in) ;
        System.out.println("Perimeter of a rectangle==>"+ 2*(width+length));

        Scanner volumeOfRectangularPrism = new Scanner(System.in) ;
        int a1 = volumeOfRectangularPrism.nextInt();
        int a2 = volumeOfRectangularPrism.nextInt();
        int a3 =volumeOfRectangularPrism.nextInt();
        System.out.println("Volume of a rectangular prism==>" + a1*a2*a3);

        Scanner AreaAndThePerimeterCircle = new Scanner(System.in);
        System.out.println("The area and the perimeter of a circle==>");

        float pi = 3.14159f ; */










    }
}
