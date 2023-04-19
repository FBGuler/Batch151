package day_01_practice;

import java.util.Scanner;

public class C08_ifElse {
    public static void main(String[] args) {

        /*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen hizmet yilinizi giriniz..");
        System.out.println("Lutfen maasını giriniz..");
        int hizmet = input.nextInt();
        int maas = input.nextInt();
        if (hizmet>=5){
            System.out.println("Zamli maas  : " + (maas + (maas*10/100)));
        } else {
            System.out.println("Zam alabilmek icin "+ (5-hizmet) + " yıl daha calısmalisiniz");
        }


        System.out.println("Lutfen ucgenin uc kenar uzunlugunu giriniz");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x==y && y==z && x==z){
            System.out.println("Eskenar ucgen..");
        } else {
            System.out.println("Eskenar degil..");
        }

















    }
}
