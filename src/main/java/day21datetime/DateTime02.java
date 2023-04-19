package day21datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("y/MM/dd - hh:mm:ss a");
        String formattedLdt = dtf1.format(ldt);
        System.out.println(formattedLdt);//3/16/2023 - 08:08 pm















    }
}
