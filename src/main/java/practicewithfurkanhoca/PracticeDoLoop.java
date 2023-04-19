package practicewithfurkanhoca;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeDoLoop {
    public static void main(String[] args) {

        //Soru 1) 5 ile 10 arasindaki(5 ve  10 dahil) sayilari  ayni satirda yazdirin

        int a=5;
        do {
            System.out.print(a+" ");
            a++;
        }while( a<11);

        // kullanicidan pozitif bir tamsayi alip
        //do  while loop ile sayidan kucuk pozitif tamsayilari yazdiralim

        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = input.nextInt();
        int counter = 1;
        if (sayi>0){
            do{
                System.out.print(counter + " " );
                counter++;
            }while(counter<sayi);
        }else System.out.println("Lutfen pozitif olan bir sey giriniz");

        System.out.println();
        for (int i = 1; i <sayi ; i++) {
            System.out.print(i+" ");
        }

        // kullanicidan istedigi kadar sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

        System.out.println();



















    }
}
