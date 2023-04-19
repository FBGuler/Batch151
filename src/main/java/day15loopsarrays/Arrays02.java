package day15loopsarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays02 {

    /*
    1)Application larda "data" ile bu data'lari isleyen kod'lar(Logic) birbirinden ayrilir.
    yani; logic data ya bagimli olmamalidir
    Data'ya bagimli olarak yazilan kodlara "hard code" denir.
    "hard code" hatali kod demektir

    Asagida ki grades array inde son elemani almak icin "4" veya "grades.lenght-1" kullanilabilir.
    "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
    kullanirsaniz hep dogru sonucu alirsiniz.

     */
    public static void main(String[] args) {

        //Array leri kisa yoldan nasil olustura biliriz?
        int grades[] = {67,98,100,34,76};
        System.out.println(Arrays.toString(grades));

        //Ex 1 : grades array'indeki en kucuk ve en buyuk grade'in toplamini ekrana yazdiran kodu yaziniz
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));//[34, 67, 76, 98, 100]

        System.out.println(grades[0]+grades[grades.length-1]);//134

        //Ex 2 : Size verilen bir String Array deki isimlerden 5 karakterden az character icerenleri
        //console'a yazdiriniz.

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for(String w : stdNames ){
            if (w.length()<5)
            System.out.println(w);
        }

        //Ex 3: Size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        // isimlerden onceki isimleri console'a yazdiriniz
        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));

        for(String w : stdNames ) {
            if (w.startsWith("F")) {
                break;
            }
            System.out.println(w);
        }

        //Ex 4: Size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        // isimlerden onceki isimleri ve F ile baslayani console'a yazdiriniz
        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));

        for(String w : stdNames ) {
            System.out.println(w);
            if (w.startsWith("F")) {
                break;
            }

        }
        System.out.println();
        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan
        // isimler haric diger isimleri console'a yazdiriniz

        Arrays.sort(stdNames);

        for(String w : stdNames ) {
            if (w.startsWith("F")) {
                continue; //isleme sokmak istemiyorsak "continue" kullaniriz
            } else {
                System.out.println(w);
            }
        }

        //short() method u numeric data lari kucukten buyuge (ascending) dizer,
        //String leri ise alfabetik sirada (alfabetically) dizer
        //ascending + alphabetically ==> Natural Order ****** Onemli


        

























    }
}
