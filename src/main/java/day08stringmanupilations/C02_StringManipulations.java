package day08stringmanupilations;

public class C02_StringManipulations {



    public static void main(String[] args) {

        //******************* replaceFirst ()*******************************

        /*
        replace() ile ayni isi yapiyor sadece ilk gordugu datayi degistiriyor.
         */

        String str = "  Hayirli Olsunda   ";
        System.out.println(str.replaceFirst("a","e")); //Heyirli Osunda

        String str1 =str.replaceFirst("a", "e");
        System.out.println("str1 = " + str1);

         //******************* trim ()********************************

        /*
        trim() bir String deki basinda ve sonunda ki space leri siler.
        arada ki space lere dokunmaz
         */

        //Ex:  str Stringindeki bas ve sonda ki space leri siliniz

        System.out.println(str.trim());

        // Ex: Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv ="599.99$      String laptop =299.99$

        String tv = "599.99$";
        String laptop = "299.99$";


        String tv2 = tv.replace("$","");
        System.out.println("tv2 = " + tv2);
        String laptop2 = laptop.replace("$","");
        System.out.println("laptop2 = " + laptop2);

         //************************** valueOf()*****************************

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);

        /*
        valueOf() methodu String olan datayi bize sayi haline getirir.
        */

        // Ex: Verilen ismin ilk isminin ilk harfini ve son isminin ilk harfini ekrana yazdiriniz

        String tamIsim = "Mehmet Fatih"; //MF
        char first = tamIsim.trim().toUpperCase().charAt(0); //M
        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(1);//F
        System.out.println("Ilk harf son harf ==" + first +second );

        String str3 = "Mehmet Fatih Yildirim ";
        char first2 = tamIsim.trim().toUpperCase().charAt(0);
        char second2 = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        char third2 = str3.trim().toUpperCase().split(" ")[2].charAt(0);
        System.out.println(" Ilk harf son harf: "+first2+second2+third2);
















    }
}
