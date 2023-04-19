package day24datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime02 {
    public static void main(String[] args) {

        LocalTime myCurrentTime = LocalTime.now();
        System.out.println("myCurrentTime = " + myCurrentTime);//10:19:51.287053900

        int hour = myCurrentTime.getHour();
        System.out.println(hour);//10

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);//19

        int second = myCurrentTime.getSecond();
        System.out.println(second);//51

        int nano = myCurrentTime.getNano();
        System.out.println(nano);//287053900

        //Gelecekle gecmis zamana nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(10).minusHours(1);
        System.out.println(next);

        //Zaman formati nasil degistirilir?
        //DateTimeFormatter.ofPattern() methodu kullanilarak degistirilebilir.

        /* DateTime Class ta kullanilan tarih saat formatlari
        HH : mm ==> 24 lu saat sistemi
        hh : mm ==> 12 li saat sistemi AM, PM gosterilmez
        hh : mm a ==> 12 li saat sistemi AM, PM
        hh : mm : ss ==> saniyeyi gosterir
        HH : MM ==> Yanlis format cunku MM aylar icin kullanilir
        mm minutes demektir, MM month demektir.

        dd-MM-yyyy ==> gun-ay-yil
        MMM ==> Aug
        MMMM==> August
        yy ==> yilin son iki rakamini verir

         */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh : mm : ss a");
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println("formattedMyCurrentTime = " + formattedMyCurrentTime);// 11 : 02 : 51 am

        LocalDate myCurrentDate = LocalDate.of(2023,8,25);
        System.out.println(myCurrentDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);

        //Tarihi Gun / Ay isminin ilk 3 harfi verecek sekilde ceviriniz 25/aug/23
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formatDt = dt.format(myCurrentDate);
        System.out.println(formatDt);

        //Tarihi 25/August/2023 sekline ceviriniz
        DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String format = dt1.format(myCurrentDate);
        System.out.println(format);

        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //Tokyo da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-03-21

        //Amsterdam'da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //Tokyo da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//20:36:12.037927300










    }
}
