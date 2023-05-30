package Lambda_Recap;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        ciftVePozitifLamExYazdir(sayi);//12 6 8
        System.out.println();
        ciftVePozitifMatRef(sayi);//12 6 8
        System.out.println();
        kareYazdir(sayi);//25 64 144 0 1 144 25 25 36 81 225 64
        System.out.println();
        kareTekrarsiz(sayi);//25 64 144 0 1 36 81 225
        System.out.println();
        buyKucSirala(sayi); //15 12 9 8 6 5 5 1 0 -5 -8 -12
        System.out.println();
        pozitifKupBirlerBas5(sayi);//125 125 3375
        System.out.println();
        topMetRef(sayi);//Optional[36]
        System.out.println();
        toplamLambdaEx(sayi);
        System.out.println();
        System.out.println(ciftKareKb(sayi)); //[0, 36, 64, 64, 144, 144] ***Return ettigimiz icin asagida burda sout ile yazdirdik


    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifLamExYazdir(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 == 0 && t > 0).
                forEach(t -> System.out.print(t + " "));
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifMatRef(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 == 0 && t > 0).
                forEach(Utils::yazdir);
    }


    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareYazdir(List<Integer> sayi) {
            /*sayi.
                    stream().
                    map(t->t*t).
                    forEach(Utils::yazdir);

             */
        sayi.
                stream().
                map(Utils::kareAl).
                forEach(Utils::yazdir);


    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareTekrarsiz(List<Integer> sayi){
        sayi.
                stream().
                map(Utils::kareAl).
                distinct().
                forEach(Utils::yazdir);
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın

    public static void buyKucSirala(List<Integer> sayi){
        sayi.
                stream().
                sorted(Comparator.reverseOrder()).
                forEach(Utils::yazdir);
    }

    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifKupBirlerBas5(List<Integer> sayi){
        sayi.stream().
                filter(t->t>0).
                map(Utils::kupAl).
                filter(t->t%10==5).
                forEach(Utils::yazdir);
    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın

    public static void topMetRef (List<Integer> sayi){
        Optional<Integer> sonuc =sayi.
                stream().
                reduce(Integer::sum);
        System.out.println(sonuc);
    }


    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın

    public static void toplamLambdaEx (List<Integer> sayi){
        int sonuc = sayi.
                stream().
                reduce(0,(a,b)-> a+b);
        System.out.print(sonuc);
    }

    //SORU9 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız

    public static List<Integer> ciftKareKb (List<Integer> sayi){
        List<Integer> sonuc = sayi.
                stream().filter(t->t%2==0).
                map(Utils::kareAl).sorted().
                collect(Collectors.toList());
        return sonuc;
    }







}


