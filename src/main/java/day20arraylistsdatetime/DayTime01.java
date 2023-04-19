package day20arraylistsdatetime;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DayTime01 {
    public static void main(String[] args) {

        //Icinde bulundugumuz zaman dilimindenki tarihi nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//2023-03-15

        //Tarihten istedigimiz bileseni nasil aliriz?
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);//3

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//15

        //Asagidaki "Month" bir Enum'dir.
        //Enum Java da sabit degerleri(Ay isimleri, Gun isimleri, Ulkede ki sehir isimleri, Samanyolu galaxisindekigezegen isimleri)
        // depolamak icin kullanilir.
        Month montName = myCurrentDate.getMonth();
        System.out.println(montName); //march

        //Asagidaki "DayOfWeek" bir Enum'dir.
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//Wednesday

        System.out.println(myCurrentDate.plusDays(5).plusDays(2).plusDays(4));//2023-03-20

        System.out.println(myCurrentDate.minusYears(30).minusMonths(2).minusDays(18));

        //Specific bir tarih objesi nasil olusturulur?
        LocalDate gokhanDob = LocalDate.of(1986, 6, 10);
        LocalDate fatihDob = LocalDate.of(1985, 2, 25);

        //Bir tarihin bir tarih ten sonra olup olmadigi nasil kontrol edilir?
        System.out.println(gokhanDob.isAfter(fatihDob));//true

        //Bir tarihin bir tarihten once olup olm nasil kontrol ederiz?
        System.out.println(fatihDob.isBefore(gokhanDob));//true

        //Bir tarihin bir tarihe esit olup olmad. nasil kontrol edilir?
        boolean r3 = gokhanDob.isEqual(fatihDob);//F

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise
        //"Gecersiz tarih giriniz" mesaji veriniz.
        //Kullanicidan ald. tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month, and day numbers in the given order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day);

        if(givenDate.isBefore(LocalDate.now())){
            System.out.println("Invalid date");
        }else{
            System.out.println("Enter time for the ticket");
        }

        int lengthOfMonth = myCurrentDate.lengthOfMonth();
        System.out.println(lengthOfMonth);

        //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodunu yaziniz.
        System.out.println("Please enter year, month, and day numbers in the given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y, m, d);
        System.out.println(date.getDayOfWeek());



    }
}
