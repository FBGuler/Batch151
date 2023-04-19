package LAMBDA.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> iller = new ArrayList<>(Arrays.asList("Van", "Hatay", "Edirne", "Gaziantep",
                "Eskisehir", "Ordu", "MUS", "MUS", "Nevsehir"));

        //System.out.println(karakterSysi5FazlaElSil(iller));//[Van, Hatay, Ordu, MUS, MUS]
        //System.out.println(hIleBaslayanYadaUIleBitenElSil(iller));//[Van, MUS, MUS]
       // System.out.println(elKarakterSayilarininKareleriniAl(iller));//[9, 9, 9]
        System.out.println(krktrSysCiftOlnYzdr(iller));//[Van, Hatay, Edirne, Gaziantep, Eskisehir, Ordu, MUS, MUS, Nevsehir]


    }

    /*
        // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz

        public static List<String> karakterSysi5FazlaElSil(List <String> iller){
            System.out.println((" 4)  "));

            iller.removeIf(t-> t.length()>5);
            return iller;


        }




        ////////////////////// ************************************************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz

    public static List<String> hIleBaslayanYadaUIleBitenElSil(List <String> iller){
        System.out.println((" 5)  "));

        iller.removeIf(t->t.startsWith("H") || t.endsWith("u"));

        return iller;

    }





        ////////////////////// ************************************************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin

    public static List<Integer> elKarakterSayilarininKareleriniAl(List <String> iller){
        System.out.println((" 6)  "));

        return iller.
                stream().
                map(Utils:: karesiniAl).//map(t->t.length() * t.length()). //Lambda Expression
                collect(Collectors.toList());

    }





     */

        ////////////////////// ************************************************ \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.

    public static List<String> krktrSysCiftOlnYzdr(List <String> iller){
        System.out.println((" 7)  "));

       iller.
               stream().
               filter(Utils::ciftMi).//filter(t->t.length()%2==0)
               collect(Collectors.toList());
       return iller;


    }







}
