package day05typecastingasciivaluestringmanipulations;

import javax.lang.model.SourceVersion;

public class C02_AsciiValue {

    public static void main(String[] args) {

        /*'A' karakterinin Ascii degerini hesaplatan kodu yaziniz
        Javada Char data tipini matematiksel islemlerde kullanirsaniz.
        Ascii tabledaki sayisal degerleri alir

        Numeric data type lari = byte, short, int, long, float, double
        char karakterin hem sayisal deger barindirir
        */


        int asciiA = 'A';
        System.out.println("asciiA = " + asciiA);//65

        int asciia = 'a';
        System.out.println("asciia = " + asciia);//97

        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem);//33

        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace); //32

        int asciiYildiz = '*';
        System.out.println("asciiYildiz = " + asciiYildiz); //42

        String isim = "Zeki";
        char ch = 'z';
        char sembol = '*';

        // int intCh=z;

        //149.9999TL *2
        int deger = 20;
        char smbl = '$';

        System.out.println(deger + smbl);//20$ 20+36=56

        int deger2 = 0;
        char smbl2 = '+';

        System.out.println("deger2+smbl2 = " + (deger2 + smbl2)); //43

        /*
        Javada "+" sembolu iki int icin matematikteki gibi toplama islemi yapar
        iki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirir
        Buna "Concatination" denir
        Java metematik bilir islem onceligine gore calisir
        i)Uslu Sayilar
        ii)Parantez ici
        iii)carpma/bolme
        iv) toplama/cikarma

        */

        String name = "123";
        int number =45;
        System.out.println(name+number); //12345 Concatination ucuca ekler yanyana yazdirir, resim gibi gorur Stringten dolayi.

        String str1 ="Java";
        String str2 ="Guzel";
        int sayi1 =5;
        System.out.println(str1+str2+sayi1); // JavaGuzel5
        
        int asciiG='G';
        System.out.println("asciiG = " + asciiG); //asciiG=71

        char rakam1 ='1';
        System.out.println("rakam1 = " + rakam1); //1

        char rakam2 ='2';
        System.out.println("rakam2 = " + rakam2);//2

        char rakam3 ='3';
        System.out.println("rakam3 = " + rakam3);//3

        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);//4

        System.out.println("rakam4+rakam1+rakam2+rakam3 = " + rakam1+rakam2+rakam3+rakam4); //202 aski degerlerini toplar
        // 1==>Ascii 49 2==>50  3==>51  4==>52
        //Javada char data type'ni matematiksel işlemlerde kullanirsaniz,Ascii table daki sayisal degerleri alir.

        byte b =5;
        char ch2= 'h';

        int asciih = 'h';
        System.out.println("asciih = " + asciih); //104

        int ascii5 ='5';
        System.out.println("ascii5 = " + ascii5); //53

        System.out.println("b>ch2 = " + (b> ch2)); //false

        long l=542168784578L;
        System.out.println(""+ (ch2>l));//f

        float f =2.456484f;
        double d= 2.19658;
        System.out.println("" + (f>d));//t

        System.out.println(""+(b<f));//f

        int sayiInt =200;
        long sayiLong =100L;
        System.out.println("" + (sayiInt>=sayiLong)); //t
        System.out.println(""+ (sayiInt==sayiLong)); //f
















        












    }


}
