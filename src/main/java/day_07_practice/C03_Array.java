package day_07_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C03_Array {
    public static void main(String[] args) {

        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
        // ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız

        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        Scanner scan = new Scanner(System.in);


        int arr[]= new int[4];
        for (int i = 0; i < 4 ; i++) { //kullanicidan 4 tane rakam alacagimiz icin 0 dan 4 e kadar for dongusune aldik.
            System.out.println("Bir rakam giriniz.");
            int rakam = scan.nextInt();
            arr[i] = rakam; //Kullanicidan aldigimiz her rakami sirasiyla arraya atadik.
        }
        System.out.println(Arrays.toString(arr));


        double toplam = 0;
        for (int each:arr) {
            toplam += each;
        }

       double ortalama = toplam/arr.length;
        System.out.println(ortalama);

        for (int each:arr) {
            if (each>ortalama){
                System.out.println(each + " ");
            }
        }














    }
}
