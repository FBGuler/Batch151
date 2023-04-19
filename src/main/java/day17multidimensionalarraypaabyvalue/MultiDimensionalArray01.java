package day17multidimensionalarraypaabyvalue;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        /*
        1)Bir arrayin elemanlari da array olursa bu tarz arraylere "Multidimensional Array" denir
         */

        //"Multidimensional Array nasil olusturulur?
        String names[][] = new String[3][2]; // [[null ,null],[null ,null ],[null ,null]]
                                             //       0      ,     1       ,     2    indexi

        names[1][0] ="P";
        names[2][1] ="Z";
        names[0][0] = "A";
        names[0][1] ="K";
        names[1][1] ="M";
        names[2][0] = "C";
        System.out.println(Arrays.deepToString(names));//[[A, K], [P, M], [C, Z]]

        //"Multidimensional Array" leri console'a yazdirmak icin "toString()" methodu degil "deepToString()" methodunu kullaniniz.

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir
        System.out.println(names[1][1]); //M

        //Multidimensional Array icindeki bir array i yazdirmak
        System.out.println(Arrays.toString(names[0])); //[A, K]
        System.out.println(Arrays.toString(names[1])); //[P,M]

        //Kisa yoldan Multidimensional Array nasil olusturulur
        String students [][] = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan", "Seyhan"},{"Ceyhan", "Kayahan"} } ;

        //Example 1: Yukaridaki students array inde toplam kac isim old. bulunuz
        int sum =0;
        for(String[] w : students){
              sum = sum+ w.length;
        }
        System.out.println(sum);//8

        //Example 2: Yukaridaki students array in icinde "m" olan isimleri cosole a yazdiriniz
        for (String[] w : students){
            for(String k: w){
                if(k.contains("m")){
                    System.out.println(k);
                }
            }
        }//Kemal, Cemal

       //Example 3 : Bir integer multidimensional Array olusturunuz, tum elemanlarin carpimini hesaplayiniz.
        int nums [][] = {{5,4},{2,3,2},{7}};

       int carpim =1;
       for( int[] w : nums){
          for(int k : w){
              carpim = carpim *k;
          }
       }
        System.out.println(carpim);//1680

        //Example 4 : Iki boyutlu bir array i tek boyutlu bir arraya ceviriniz
        int numbers [][] = {{5,4},{2,3,2}}; // ==> {5,4,2,3,2}

        //Step 1 ; Iki boyutlu array de kac eleman old bulan kodu yazmaliyiz
        int toplamElemanSayisi=0;
        for(int[] w : numbers){
           toplamElemanSayisi = toplamElemanSayisi + w.length;
        } //toplam eleman sayisi 5


        //step 2; tek boyutlu array i iki boyutlu Arrayin eleman sayisini kullanarak  olusturmaliyiz

        int newArr[] =new int[toplamElemanSayisi];//int default degeri 0 dir.

        //Step 3 ; Iki boyutlu array deki elemanlari tek boyutlu array e transfer etmeliyim

        int idx = 0;

        for (int[] w: numbers){
            for(int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        //Exemple 5 ; Bir integer multidimensional array daki en kucuk ve en buyuk elemanin toplamini bulunuz

        int ages [][] = {{15,4},{12,43,21}};// 4+43 = 47

        int small = ages[0][0];

        for (int[] w : ages){
            for(int k : w){
                small = Math.min(small,k);
            }
        }
        System.out.println(small);
























    }
}
