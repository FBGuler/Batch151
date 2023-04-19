package day24datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2023-03-21T11:39:42.733293400

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy-hh:mm a");
        String formattedLdt = dtf.format(ldt);
        System.out.println(formattedLdt);//21-03-2023-11:44 am



















    }
}
