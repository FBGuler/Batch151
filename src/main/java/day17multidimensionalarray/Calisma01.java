package day17multidimensionalarray;

import java.util.Arrays;

public class Calisma01 {
    public static void main(String[] args) {

        String names[][] = new String[3][2];
        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";

        System.out.println(Arrays.deepToString(names)); //[[A, K], [P, M], [C, Z]]

        //Example 1: MultiDimentional array icinde ki specific elemani yazdir

        System.out.println(names[1][1]);
        System.out.println(Arrays.toString(names[0]));

        //Kisa yolla Multidimentional array nasil olusturulur?
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}};
        System.out.println(Arrays.deepToString(students)); //[[Ali, Kemal], [Cemal], [Ayhan, Beyhan, Seyhan]]

        //Example 1: yukaridaki students array inde toplam kac isim old bulunuz.
        int sum = 0;
        for (String[] w : students) {
            sum += w.length;
        }
        System.out.println(sum);

        //Example 2: yukaridaki students arrayin icinde "m" olan islemleri concole yazdir
        for (String[] w : students) {
            for (String z : w) {
                if (z.contains("m")) {
                    System.out.println(z);
                }
            }
        }


        //Bir integer multiDimentional array olusturunuz, tum elemanlarin carpimini hesaplayiniz.
        Integer numbers[][] = new Integer[][]{{2, 5}, {3, 5, 8}, {6}, {5, 2, 1}};
        System.out.println(Arrays.deepToString(numbers));//[[2, 5], [3, 5, 8], [6], [5, 2, 1]]

        int sum1 = 0;
        for (Integer[] w : numbers) {
            for (Integer z : w) {
                sum1 += z;
            }
        }
        System.out.println(sum1);


        //Cift boyutlu arrayi tek boyutlu array a ceviriniz.
        int number[][] = new int [][]{{2, 5}, {3, 5, 8}, {6}, {5, 2, 1}};
        int lenght = 0;
        for (int [] w: number) {
            lenght += w.length;
        }

        int number1 [] = new int[lenght];
        int idx = 0;
        for (int [] w: number) {
            for (int k: w) {
                number1 [idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(number1));//[2, 5, 3, 5, 8, 6, 5, 2, 1]

        //Example 5 : Bir int multidimentinal array deki en kucuk ve en buyuk elemanin top bulunuz.

        int ages [][] = {{15,4},{12,43,21},{7}};

        int min = ages[0][0];
        for (int [] w:ages ) {
            for (int k:w ) {
                min= Math.min(min,k);
            }
        }

        int max = ages[0][0];
        for (int [] w:ages ) {
            for (int k:w ) {
                max= Math.max(max,k);
            }
        }

        System.out.println(min + max);//47










    }
}