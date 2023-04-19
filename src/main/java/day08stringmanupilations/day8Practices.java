package day08stringmanupilations;

import java.util.Scanner;

public class day8Practices {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen mail adresinizi\n" +
                "           i)mail adresi \"@gmail\" icermeli\n" +
                "           ii)Space characteri mail'de olmamali\n" +
                "           iii)mail adresinde buyuk harf olmamali\n" +
                "           iv)En az bir tane noktalama isareti bulunmali\n seklinde veriniz..");

        String mail =input.nextLine();
        // i)
        boolean i = mail.contains("@gmail");

        // ii)
        boolean ii = !mail.contains(" ");

        //iii)
        boolean iii = !mail.contains("[A-Z]"); //????????????????????????????????????????????????????????????????????????????

        //iv
        boolean iv = mail.replaceAll("[A-Za-z0-9]", "").replace(" ","").length()>0;


        System.out.println( i && ii && iii && iv );

        // Ex: Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv ="599.99$      String laptop =299.99$

        String tv = "599.99$";
        String laptop = "299.99$";

        String tv1 = tv.replace("$","");
        String laptop1 = laptop.replace("$","");

        Double toplam = Double.valueOf(tv1) + Double.valueOf(laptop1);
        System.out.println("toplam = " + toplam);

        // Ex: Verilen ismin ilk isminin ilk harfini ve son isminin ilk harfini ekrana yazdiriniz

        System.out.println("Lutfen isminizi ve soy isminizi giriniz");
        String name = input.nextLine();
        System.out.println(""+name.charAt(0) + name.split(" ")[1].charAt(0));






















    }
}
