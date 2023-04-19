package day_09_practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Method {
    public static void main(String[] args) {

                /*
        kullanıcıdan bir cumle sisteme girmesini isteyiniz.
        method olusturarak cumlede gecen sesli harfleri konsola yazdırınız
                */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println(cumle);//Java ile hayat guzel
        String arr[]=cumle.split("");
        System.out.println(Arrays.toString(arr));//[J, a, v, a,  , i, l, e,  , h, a, y, a, t,  , g, u, z, e, l]
        
        sesliharfleriyazdir(arr);

        bosluklariKaldir(arr);

        
        
        
        



    }

    public static void bosluklariKaldir(String[] arr) {

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].equals(" ")){
                System.out.println(Arrays.toString(arr).replace(arr[i],""));
            }
        }







    }

    public static void sesliharfleriyazdir(String[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].equalsIgnoreCase("a")
                    || arr[i].equalsIgnoreCase("e")
                    || arr[i].equalsIgnoreCase("i")
                    ||arr[i].equalsIgnoreCase("u")
                    ||arr[i].equalsIgnoreCase("o")){
                System.out.print(arr[i]);
            }

        }



//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lutfen bir cumle giriniz");
//
//
//        String [] cumle = scan.nextLine().split("");
//
////        bosluk(cumle);
//
//        sesliHarfler(cumle);
//
//
//    }
//
////
////   public static void bosluk (String[] str){
////
////       String cumle1 = "";
////
////       for (String w : str) {
////
//////           if (!w.trim().isEmpty()) {
//////               cumle1 += w.trim();
//////           }
////
////           if (!w.equals(" ")) {
////               cumle1 += w;
////           }
////
////
////       }
////       System.out.println(cumle1);
////
////       sesliHarfler(cumle1.split(""));
////
////   }
//
//
//
//
//
//
//
//
//
//
//    public static void sesliHarfler (String[] cumle){
//
//        String harf = "";
//        for (String w: cumle) {
//            if (w.equalsIgnoreCase("a")|| w.equalsIgnoreCase("e") || w.equalsIgnoreCase("i") || w.equalsIgnoreCase("o") || w.equalsIgnoreCase("u")){
//                harf = harf +w;
//                System.out.print(w);
//            }
//        }
//
//
//
//


    }

}
