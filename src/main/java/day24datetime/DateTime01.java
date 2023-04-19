package day24datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println("currentDate = " + myCurrentDate);//currentDate = 2023-03-21

        //Icinde bulundugumuz zaman dilimindeki tarihi verir.

        //Tarihten istedigimiz bileseni nasil aliriz.
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println("monthValue = " + monthValue);//3

        int yearValue = myCurrentDate.getYear();
        System.out.println("yearValue = " + yearValue);//2023

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println("dayValue = " + dayValue);//21
        
        Month monthName = myCurrentDate.getMonth();
        System.out.println("monthName = " + monthName);//MARCH

        // enum, java da sabit degerleri (Ay isimleri, gun isimleri, ulke isimleri) 
        // gibi depolamak icin kullanilir. Month bir enum dir.
        
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println("dayName = " + dayName);//TUESDAY

        //Ileriki tarihe nasil gidilir?
        LocalDate newDate = myCurrentDate.plusDays(13).plusMonths(1).plusYears(2);//2025-05-03

        //gecmis tarihe nasil gidilir?
        System.out.println(newDate.minusYears(2).minusMonths(1).minusDays(13));//2023-03-21

        //Specific bir tarihi objesi nasil olusturulur.
        LocalDate date1 = LocalDate.of(1980,8,10);
        LocalDate date2 = LocalDate.of(1985,7,19);

        //Bir tarihin baska bir tarihten sonra olup olmadigini nasil kontrol ederiz?
        Boolean r1 = date1.isAfter(date2);
        System.out.println(r1);//false

        Boolean r2 = date1.isBefore(date2);
        System.out.println(r2);//true

        Boolean r3 = date1.equals(date2);
        System.out.println(r3);//false

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz." mesaji veriniz.
        //Gelecege aitse "Bilet icin zamani girebilirsiniz" mesaji verin.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month and day numbers in the given order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);
        LocalDate currentDate = LocalDate.now();

        if (givenDate.isBefore(currentDate)){
            System.out.println( givenDate+ "   Gecersiz tarih girdiniz.");
        } else {
            System.out.println("Bilet icin zamani girebilirsiniz");
        }

        System.out.println("givenDate.lengthOfMonth() = " + givenDate.lengthOfMonth());//31

        //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz.
        System.out.println("Please enter year, month and day numbers in the given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y,m,d);
        System.out.println("date.getDayOfWeek() = " + date.getDayOfWeek());


    }
}
