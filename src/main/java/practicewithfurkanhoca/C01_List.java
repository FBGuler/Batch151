package practicewithfurkanhoca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_List {
    /* Example 1:
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
        */


    public static void main(String[] args) {

        Random randomSayilar = new Random();
        List<Integer> sayilistesi = new ArrayList<>();
        int sayi = 0;

        while(sayilistesi.size()<200){
            sayi = randomSayilar.nextInt(1000);
            if (!sayilistesi.contains(sayi)){
                sayilistesi.add(sayi);
            }
        }
        System.out.println(sayilistesi);


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aramak istediginiz sayiyi giriniz.");

        int sayi2 = scan.nextInt();
        if (sayilistesi.contains(sayi2)){
            System.out.println("Bu sayi mevcut.");
        }else System.out.println("Bu sayi mevcut degil");



        // Example 2:
        // bir listede ortalamanin ustunde olan element sayisini bulunuz

        List<Integer> sayilar = List.of(5,10,15,25,30,35,4);
        double ort = 0;
        double sum = 0;
        for (int w : sayilar) {
            sum = sum + w;
        }
            ort= sum/sayilar.size();

        int counter = 0;
        for (Integer w: sayilar) {
            if (w>ort){
                System.out.println(w);
                counter++;
            }
        }
        System.out.println("List'deki sayilarin ortalamasindan buyuk eleman : " + counter + " tanedir.");









    }
}
