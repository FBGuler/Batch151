package practices01;

import java.util.Arrays;
import java.util.Scanner;

public class StudentsSoru {
    public static void main(String[] args) {

        /* Example 1:
        Kullanicidan bir double sayi aliniz.
        1)Sayi eger 0 ise "Zero"
        2)Sayi pozitif ise
          a)1'den kucuk ise "Pozitive small number
          b)1.000.000 den buyuk ise "Pozitive large number"
          c) "Pozitif number"
        3)Sayi negatif ise
          a) 1 den kucuk ise "Negative small number"
          b)1.000.000 den buyuk ise "Negative large number"
          c)"Negative number"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir double sayi giriniz.");
        double x = input.nextDouble();


        if (x == 0) {
            System.out.println("Zero");

            if (x > 0) {
                if (x > 1000000) {
                    System.out.println("Pozitif larce number");
                } else {
                    System.out.println("Pozitif number");
                }

            } else if (x < 0) {
                if (Math.abs(x) < 1) {
                    System.out.println("Negative small number");
                } else if (Math.abs(x) > 1000000) {
                    System.out.println("Pozitive large number");
                } else {
                    System.out.println("Negative number");
                }
            }
            }


















        /*Example 2:
        Verilen bir Integer Array deki en kucuk pozitive elemani ve en buyuk negative elemani bulunuz.
        Orn: (-12, 18, -5, 23, -2, 0)==> en kucuk pozitif 18, en buyuk negative -2
         */


        int [] arr = {-12, 18, -5, 23, -2, };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[-12, -5, 0, -2, 18, 23]

        int minPozitive = arr[arr.length-1];
        int maxNegative = arr[0];

        if(contains(arr,0)){
            System.out.println("Bu array de 0 var 1. yol calisiyor");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i]<0 && arr[i+2] >0){

                    maxNegative =arr[i];
                    minPozitive =arr[i+2];

                }
            }
            System.out.println("En kucuk pozitif sayi : " + minPozitive);//18
            System.out.println("En buyuk negatif sayi : " + maxNegative);//-2

        }else{
            System.out.println("Bu arrayde 0 yok, 2. yol calisiyor");

            for (int w : arr) {
                if (w>=0 && w<minPozitive)
                    minPozitive = w;
                else if (w<0 && w>maxNegative)
                    maxNegative= w;
            }
            System.out.println("En kucuk pozitif sayi : " + minPozitive);//18
            System.out.println("En buyuk negatif sayi : " + maxNegative);//-2
        }























    }

    public static  boolean contains(int []array, int number){

        boolean result= false;

        for (int w : array){
            if (w==number)
                return true;
        }
        return result;
    }








}
