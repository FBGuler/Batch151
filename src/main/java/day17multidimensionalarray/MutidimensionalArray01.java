package day17multidimensionalarray;

import java.util.Arrays;

public class MutidimensionalArray01 {
    public static void main(String[] args) {

        //Bir array in icerisinde elemanlari Array ise bu Array Multidimensional arraydir
          //Multidimensional array nasil olusturulur?
          int a [][]=new int[3][2];

          //MultiDimensional Arraylere eleman nasil eklenir?
          a[0][0] = 5;
          a[1][1] = 45;
          a[2][0] = 123;
          a[1][0] = 81;
          a[2][1] = 0;
          a[0][1] =12;

          //MultiDimensional Arrayler yazdirmak icin deepToString kullanilir.
        System.out.println(Arrays.deepToString(a));

          //MultiDimensional Array icindeki specific bir elemani nasil yazdirir.
        System.out.println(a[1][1]); //45

          //MultiDimensional Array icindeki array nasil yazdirilir?
        System.out.println(Arrays.toString(a[1]));//[81,45]
        System.out.println(Arrays.toString(a[0]));//[5,12]

          //Kisa yoldan MultiDimensional Array nasil olusturulur
        String students[][] = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};


        //EXP 1: Yukaridaki students array inde toplam kac isim old bulunuz.
        int sum = 0;
        for( String[] w : students){
            sum = sum + w.length;
        }
        System.out.println(sum);//8

        //Exp 2: Yukaridaki students array inde icinde "m" olan isimleri consola yazdiriniz

        for (String[] w : students){
            for (String k : w){
                if(k.contains("m")){
                    System.out.println(k);
                }
            }
        }

        //Exp 3: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz

        int nums[][] ={{5,4},{2,3,2},{7}};
        int result =1;// carpma old icin 1

        for (int [] w : nums){
            for(int k : w){
                result = result*k;
            }
        }
        System.out.println(result);


















    }
}
