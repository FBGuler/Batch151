package introduction.b151practices.day02datatypesmethodcreation;

import java.util.Scanner;

public class MileToKilometer {

    public static void main (String[] args) {

        Scanner mile = new Scanner (System.in) ;
        System.out.println (" Bir sayi gir. ");
        Double mileToKm = mile.nextDouble() ;
        System.out.println( mileToKm + " mil = " + (mileToKm * 1.6)+ " km'dir." );



    }



}
