package practicewithfurkanhoca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_List {
    //Exemple 1:
    // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
    // bir method olusturun
    // orn : [1, 5, 3, 5, 6, 1, 7]  bu listi
    //       [1, 3, 5, 6, 7] bu hale donusturun


    /* Example 2:
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki cift ogeleri toplayin
        */


    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(1, 5, 3, 5, 6, 1, 7));

        tekrarsizListOlustur(sayilar);



        List<Integer> str = List.of(3,6,7,2,10,9,4);
        int sum = 0;
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i)%2==0){
                sum += str.get(i);
            }
        }
        System.out.println(sum);//22









    }

    public static void tekrarsizListOlustur(List<Integer> sayilar) {
        List<Integer> yeniList = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (!yeniList.contains(sayilar.get(i))) {
                yeniList.add(sayilar.get(i));
            }
        }

        System.out.println(yeniList);//[1, 5, 3, 6, 7]

    }
}
