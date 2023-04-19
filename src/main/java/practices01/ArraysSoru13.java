package practices01;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysSoru13 {
    public static void main(String[] args) {

//        Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
//        Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        int[] arr = new int[]{0, 0, 5, 1, 2, 1, 3, 1,};

        Arrays.sort(arr);
       int firstIndex = 0;
       int sonIndex = arr.length-1;

       int [] bosArr = new int[arr.length];
        System.out.println(Arrays.toString(bosArr));

       for (int w : arr) {
            if (w != 1) {
                bosArr[firstIndex]=w;
                firstIndex++;
            }else{
                bosArr[sonIndex]=w;
                sonIndex--;
            }

        }
        System.out.println(Arrays.toString(bosArr));






















    }
}

