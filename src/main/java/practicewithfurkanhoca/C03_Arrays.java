package practicewithfurkanhoca;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_Arrays {
    /* 7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
        true veya false sonucu donen bir method olusturun
        */

    public static void main(String[] args) {

        String isimler[]={"furkan","veli","huseyin","hakan","ali","ece","isa","cem","ibrahim"};

        Scanner src = new Scanner(System.in);
        System.out.println("Lutfen aradiginiz ismi giriniz..");
        String arananIsim = src.next();

        bosMu(isimler, arananIsim);





    }

    public static void bosMu(String isimler[], String arananIsim) {
        boolean sonuc = false;
        for (String w: isimler) {
            if (w.equalsIgnoreCase(arananIsim)){
                sonuc = true;
            }
        }
        System.out.println(sonuc);
    }


}
