package day_02_practice;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {

          /*
      Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
      Eger İlk kelimenin karakter sayısı çift ise,
      ikinci kelimeyi birinci kelimenin ortasına koyun.
      İlk kelimenin karakter sayısı tek ise, konsola
      "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci kelime giriniz");
        String str1 = scan.next();
        System.out.println("Lutfen ikinci kelime giriniz");
        String str2 = scan.next();
        if(str1.length()%2==0){
            String ilkYarisi = str1.substring(0,str1.length()/2);
            String sonYarisi = str1.substring(str1.length()/2);
            System.out.println(ilkYarisi+str2+sonYarisi);
        }else{
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }



















    }
}
