package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList<String>cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");

        System.out.println(cities);

        //ArrayListte bir elemanin ilk gorunumu nasil silinir?
        //remove methodu bir elemanin ilkmgorunumunu siler
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]
        cities.remove(2);
        System.out.println(cities);//[Giresun, Yozgat, Miami, Giresun, Giresun, Yozgat]

        //ArrayList te bir eleman indexi kullanarak nasil silinir?
        System.out.println(cities.remove("2"));
        System.out.println(cities);

        //remove() methodu elemanli kullanilirsa ilk gorunumu siler
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden true ya da false verir.

        //Example 1: Bir Integer list olusturun ve 12 elemanini siliniz.
        //ArrayList olustururken sag tarafa (constructor) ArrayList yazmak zorndadir.
        //Ama sol tarafa ister List yazin ister ArrayList yazin calisir.
        //Detaylari Collections konusunda gorecez.

        List<Integer> ages = new ArrayList<>();//List yerine ArrayList te yazilir.Aralarinda kucuk bir fark var. biri babamin ogluyum der biri hepimiz ademin ogullariyiz der gibi.
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

//        ages.remove(12);
//        System.out.println(ages);
       //1.yol;
//        Integer nonPrimitive = 12;
//        ages.remove(nonPrimitive);
//        System.out.println(ages);
//
        //2.yol;
//        ages.remove((Integer)12);
//        System.out.println(ages);

        //3. yol;
//         ages.remove(ages.indexOf(12));
//         System.out.println(ages);


        //Kisa yoldan bir list olusturmak icn List.of()
        //methodunun kullanabiliriz.
        //List.of() methodu degistirilemez bir liste olusturmak icin kulllanilir.
        //bu method ile olusturulan list degistirmeye yonelik methodlari desteklemez.

        List<Character>initials = List.of('a','b','a', 'c','d');
        System.out.println(initials);//[a, b, c, d]
        //initials.add('e');//eklemez
        //initials.remove(0);//cikarmaz
        //initials.set(0,'u');//degistirmz
        System.out.println(initials);

        //indexOf(aranan karakter) methodu bir aranan karakterin ilk gorunumunun indexini verir.
        int r1 = initials.indexOf('c');
        System.out.println(r1);//3

        int r2 = initials.lastIndexOf('a');
        System.out.println(r2);//2
        //lastIndexOf() methodu aranan karakterin son gorunumunun indexini verir.

        //Example 2: Bir listtede ki tekrarsiz elemanlari console yazdirin
        List<Double>prices = List .of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);
        for ( Double w : prices) {
            if (prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.print(w+" ");//3.75 4.0
            }
        }

        //Example 3: Bir list te tekrarali olup olmadigini gosteren kodu yaziniz

        List<Integer> heights = List.of(3,13,3);
        int counter = 0;
        for (Integer w : heights) {
            if (heights.indexOf(w)!=heights.lastIndexOf(w)){
                counter++;
            }
        }
        if (counter==0){
            System.out.println("All elements are unique in the list");
        }else{
            System.out.println("At least one element is not unique in the list");
        }












    }
}
