package day08stringmanupilations;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_StringManupilations {
    public static <Scanning> void main(String[] args) {

        /*
          Kullanicidan email adresini girmesini isteyin,
          Asagidaki kurallara gore kullanicinin
          girdigi email adresini kontrol ediniz.
           i)mail adresi "@gmail" icermeli
           ii)Space characteri mail'de olmamali
           iii)mail adresinde buyuk harf olmamali
           iv)En az bir tane noktalama isareti bulunmali
        */

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen mail adresinizi\n" +
                "           i)mail adresi \"@gmail\" icermeli\n" +
                "           ii)Space characteri mail'de olmamali\n" +
                "           iii)mail adresinde buyuk harf olmamali\n" +
                "           iv)En az bir tane noktalama isareti bulunmali\n seklinde veriniz..");

        String mail =input.nextLine();

        // i)mail adresi "gmail" icermeli
        boolean first = mail.contains("gmail");
        System.out.println("gmail = " + first);

        //ii)Space characteri mail'de olmamali
        boolean second = ! mail.contains(" ") ;
        System.out.println(" Space = " + second);

        //iii)mail adresinde buyuk harf olmamali
        boolean third =!mail.contains("[A-Z]");
        System.out.println("buyuk harf = " + third);

        //iv)En az bir tane noktalama isareti bulunmali
        //boolean four =!mail.contains("[a-z]"); // Contains methodu regex karakterlerle dogru bir sekilde calismaz,
        // bu nedenle replaceall ya da replace ile silme yapip geriye kalanlarin lenght()'ne bakilir.

        boolean forth =mail.replaceAll("[a-zA-Z0-9]","").replace(" ", "").length()>0;
        System.out.println("noktalama isareti = " + forth);

        boolean forth0 = mail.replaceAll("[a-z0-9]","").
        replaceAll("[\\p{Punct}]","").
        replace(" ","").length()>0;

        //boolean sixth = mail.replaceAll("^\\P{P}","").length()==0;

        boolean forth1 = mail.replaceAll("[^\\P{P}]", "").length()>0;
        System.out.println("forth1 = " + forth1);// bu yontem daha makbul

        System.out.println(first && second && third && forth );

       /* Noktalama Isaretleri :
        17 noktalama işareti var. Bunlar; nokta, virgül, noktalı virgül, iki nokta,
                üç nokta, soru işareti, ünlem işareti, kısa çizgi, uzun çizgi, eğik çizgi, ters eğik çizgi,
        tırnak işareti, tek tırnak işareti, denden işareti, yay ayraç, köşeli ayraç, kesme

      */
          String str ="burada bi gariplik var @.?-!";
        System.out.println(str.replaceAll("[^\\p{Punct}]",""));



























    }

}
