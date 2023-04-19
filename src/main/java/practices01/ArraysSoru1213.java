package practices01;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSoru1213 {
    public static void main(String[] args) {

//        Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
//        konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
//                Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String s1 = input.next();
        String [] kelime1 = s1.toLowerCase().split("");
        Arrays.sort(kelime1);

        Scanner scn = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String s2 = scn.next();
        String [] kelime2 = s2.toLowerCase().split("");
        Arrays.sort(kelime2);

        if (kelime1.length!=kelime2.length) {
            System.out.println("Anagram Degil");
        }else if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Anagram degil");
        } else if (Arrays.equals(kelime1,kelime2)){
            System.out.println("Anagramdir");
        }else System.out.println("Anagram degildir");


        //Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
        //büyük öğeler arasındaki farkı konsolda yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen array uzunlugunu giriniz");
        int uzunluk = scan.nextInt();
        int [] arr = new int [uzunluk];
        System.out.println("Girilen array elemanlari: "+ uzunluk +" ==> Lutfen elemanlari giriniz");


        for (int i = 0; i < uzunluk; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        int cikarma = arr[uzunluk-1]-arr[0];

        System.out.println("En buyuk ve en kucuk oge arasindaki fark : " + cikarma);


        //example 3:

       //Kullanicidan bir sayi arrayi isteyin.

        Scanner input1 =new Scanner(System.in);
        System.out.println("Lutfen array inizin uzunlugunu giriniz.");
        int len = input1.nextInt();
        int [] arrNumbers = new int[len];

        System.out.println("Lutfen elemanlari giriniz, girdiginiz sayilarin uzunlugu " + len + " e kadar olsun");

        for (int i = 0; i < len; i++) {
            arrNumbers [i]= input1.nextInt();
        }

        System.out.println(Arrays.toString(arrNumbers));




        

















    }
}
