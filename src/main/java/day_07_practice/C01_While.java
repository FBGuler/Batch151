package day_07_practice;

import java.util.Scanner;

public class C01_While {
    public static void main(String[] args) {

        // Kullanıcıdan sisteme bir rakam girmesini isteyiniz
       // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz.");
        int rakam = input.nextInt();
        int num = 1;
        int factoriyel = 1;

        while (num<=rakam){
           factoriyel = factoriyel*num;
           num++;
        }
        System.out.println(rakam + "!= " +factoriyel);





















    }
}
