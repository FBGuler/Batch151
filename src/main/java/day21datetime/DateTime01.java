package day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {


        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//19:04:00.809906900

        //Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);//19

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);//6

        int second= myCurrentTime.getSecond();
        System.out.println(second);//15

        int nano = myCurrentTime.getNano();
        System.out.println(nano);//852713200

        //Gelecek ve gecmis zamana nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(23);
        System.out.println(next);

        //Zaman formati nasil degistirilir?
        // 'mm' dakika 'ss' ise saniyeyi gosterir
        // 'MM' ise month ay demektir.
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss a");//hh kucuk h 12 lik saat sistemini kullanir
                                                                      //bosluk a koyarsaniz am, pm yazdirir.
        String formattedMyCurrentTime =dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);

        //Date formati nasil degisir?
        LocalDate myCurrentDate = LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);

        //Tarihi Gun/Ay isminin ilk 3 harfi/Yil sekline ceviriniz.
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);

        //Tarihi Gun/Ay ismi/Yil sekline ceviriniz. 25/August/2022
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        LocalDate dateInTashkent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent);

        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        //Koln 'de saat kac?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);










    }
}
