package day02Practice;

import java.util.Scanner;

public class C02_ifElse {
    public static void main(String[] args) {

        /*
        Kullanicidan ucgenin a, b ve c kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        Girilen uzunlukların, bir dik ucgenin kenar uzunlukları olup olmadıgını konsola yazdırınız

        Örnek Ekran Çıktısı:

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz:  4
        üçüncü kenarı giriniz:  5
        Bu bir dik üçgendir
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ucgenin a kenarini giriniz..");
        int a = input.nextInt();

        System.out.println("Lutfen ucgenin b kenarini giriniz..");
        int b = input.nextInt();

        System.out.println("Lutfen ucgenin c kenarini giriniz..");
        int c = input.nextInt();

        if (a*a+b*b == c*c){
            System.out.println("Bu bir dik ucgendir");
        }else if (a*a==b*b+c*c){
            System.out.println("Bu bir dik ucgendir");
        }else if (a*a+c*c==b*b){
            System.out.println("Bu bir dik ucgendir");
        }else {
            System.out.println("Bu bir dik ucgen degildir");
        }





















    }
}
