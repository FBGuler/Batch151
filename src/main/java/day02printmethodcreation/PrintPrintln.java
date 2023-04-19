package day02printmethodcreation;

import java.util.Scanner;


public class PrintPrintln {

    public static void main(String[] args) {


        //"TECHPRO EDUCATION" yazisini yukardan asagiya harf harf yazdiriniz
        // 1. YOL CTRL+D
        System.out.println("***** 1.Yol ******");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" "); //HICLIKTE OLUR ("")
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

    // "TECHPRO EDUCATION" yazisini TEK BIR SOUT ILE yukardan asagiya harf harf yazdiriniz

        System.out.println("***** 2.Yol ******");
        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        /*
         \n ===>  bir alt satira gecirir.
         \t ===>  bir tab bosluk birakir.
         \" ===>  ekrana " yazdirir
         \' ===> ekrana ' yazdirir
         ctrl+alt+L ===> ekrani duzenler

         */

    // JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini alt satira
    // yazdiran kodu tek bir sout ile yazdiriniz

        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");


    // JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini 1 tab bosluk birakan
    // kodu yaziniz

        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");

    //"Techpro" ile java cok 'kolay'
    // tek bir sout ile yazdiran kodu yaziniz

        System.out.println("Techpro ile java cok kolay");
        System.out.println("\" Techpro \" ile \' java \' cok kolay");

    //"MAHARET" hic 'DUSMEMEMEK' degil;


    //"Her dustugunde ayaga kalkabilmektir"


    //SEKLINDE NOKTALI VIRGULDEN SONRA
    //3 SATIR ALTTAN paragraf basi yaparak yazdiran kodu olusturunuz

        System.out.println("\"MAHARET\" hic \'DUSMEMEK\' " +
                "degil;\n\n\n\t\"Her dustugunde ayaga kalkabilmektir\"");



    //  Print ile Println arasindaki farklar
    // ln ==> line next bir sonraki satira gec

        System.out.println("**************** 1 *****************");
        System.out.print("Ali");
        System.out.println("Can");
    //AliCan yazdirir
        System.out.println("**************** 2 *****************");
        System.out.println("Ali");
        System.out.print("Can");
    //Ali
    //Can  yazdirir

        System.out.println("**************** 3 *****************");
        System.out.print("Ali");
        System.out.println("Can");
    //Can**************** 3 *****************
    //AliCan





}


        }
