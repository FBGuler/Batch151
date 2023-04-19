package day_07_practice;

import java.util.Arrays;

public class C04_Array {

    // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
    // input : 1,2,-3,4,-5,-6
    // output :-1,-2,3,-4,5,6

    public static void main(String[] args) {


        int arr[] = {1,2,-3,4,-5,-6};

        int brr [] = new int [arr.length];

        int idx = 0;

        for (int each:arr){ //arr deki herbir elemani foreach ile aldik
            brr [idx]=each*-1; //her elemanin negatif degerini sirasi ile brr ye atadik.
            idx++; //indexi her seferinde 1 er artiralim.

        }
        System.out.println(Arrays.toString(brr));























    }





}
