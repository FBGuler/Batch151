package practices01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClassPractice {
    public static void main(String[] args) {

        //String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        //Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

        String [] str = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int minLenght = str[0].length();//Kemal
        for ( String w: str) {
            minLenght= Math.min(minLenght, w.length());
        }
        for (String w :str){
            if (minLenght==w.length()){
                System.out.println(w);
            }
        }


        //Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        //bulunuz.
        //Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2

        //1. yol
        int  sayi [] = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(sayi);//{[-12, -5, -2, 18, 23]
        System.out.println(Arrays.toString(sayi));

        for (Integer i=0 ; i<sayi.length ; i++) {
            if (sayi[i]<0 && sayi[i+1]>0) {
                System.out.println(sayi[i]+" "+sayi[i+1]);
            }
        }

        //String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        //alınız.
        //Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JMJ

        String names [] = new String[]{"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
        String firstLetter = "";
        for (String w : names){
            if (w.endsWith("n") || w.endsWith("k")){
                firstLetter = firstLetter+ w.substring(0,1);
            }
        }
        System.out.println(firstLetter);



        //String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        //Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

        String name [] = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int toplam = 0;
        for (String w: name){
            toplam = toplam+w.length();
        }
        System.out.println(toplam);

        //Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.

        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a sentence with a lot of 'A'..");
        String f = input.nextLine();
        String fArray []= f.split(" ");
        int l = 0;
        for (String w: fArray){
            if(w.startsWith("a")||w.startsWith("A")){
                l++;
            }
        }

        System.out.println(l);














    }
}
