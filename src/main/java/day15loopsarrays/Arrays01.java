package day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        1)Array, Javanin ayni data tipinde, coklu data depolamak icin olusturdugu bir yapidir.
        2)Array de sadece primitive data veya non primitive data ya ait referanslarlar ile calisabilir.
        3)Array ler "super fast" dir ve memory de cok az yer kaplarlar
         */

        //Array nasil olusturulur
        String stdNames[] = new String[5]; //data sayisini yazmazsak Java hata verir.[] icine bi deger vermeliyiz.

        //Array nasil yazdirilir
        System.out.println(Arrays.toString(stdNames)); //[null, null, null, null, null] == null lar String in default degerleridir

        //Array a nasil eleman eklenir
        stdNames[0] = "Ajda"; // [Ajda, null, null, null, null]
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";//[Ajda, null, Kemal, Cuneyt, null]
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Kemal, Cuneyt, Filiz]
        System.out.println();

        //Array 'deki specific bir elemani nasil alabiliriz?
        System.out.println(stdNames[3]); //Cuneyt
        System.out.println();

        //Ex 1: stdNames array indeki her ismin sonuna '*' koyarak yazdiriniz

        //1.yol
        for(int i=0; i<stdNames.length; i++){//length Stringlerde parantezli, Array lerde parantezsiz (method degil)kullanilir
            System.out.println(stdNames[i]+"*");
        }
        System.out.println();

        //2.yol : for-each loop ==> (Enhanced(Zenginlestirilmis) Loop
        //Mumkunse hep for-each loop kullanilir degilse digerleri kullanilir.

        for(String w : stdNames ){
            System.out.println(w+"*");
        }

        //Ex 2: Bir Integer Array olusturunuz, 5 eleman ekleyiniz, elemanlarin toplamini bulup console a yazdiriniz
        int x[] = new int[5];
        x[0] = 2;
        x[1] = 3;
        x[2] = 4;
        x[3] = 5;
        x[4] = 7;

        int sum = 0;
        for(int w : x){
            sum=

                    sum + w;
        }
        System.out.println(sum);

        //Example 3: Bir char Arrays olusturunuz, 3 eleman ekleyiniz, elemanlarin carpimini bulup console yazdiriniz
        char y[] =  new char[3];
        y[0] = 'a';//65
        y[1] = 'b';//66
        y[2] = 'c';//67
        
        int carpim = 1;
        for(char w : y){
            carpim = carpim *w;
        }
        System.out.println("carpim = " + carpim); //941094
        
        































    }
}
