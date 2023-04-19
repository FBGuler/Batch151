package day14loops;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {

        //Kullanicidan alinan bir tamsayinin tekarsiz rakamlarinin toplamini bulunuz
        // 1838 ==> 1+3=4 olacak

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");//1838 diye kabul edersek
        String s = input.next();

        int sum = 0;
        for( int i=0      ;    i<s.length()     ;  i++   ){

            String d= s.substring(i,i+1);//1
            if(s.indexOf(d) == s.lastIndexOf(d)){ //0=0
            // eger if(s.indexOf(d) != s.lastIndexOf(d)){  dersek ayni rakamlari toplar
                sum = sum+ Integer.valueOf(d);
            }
        }
        System.out.println(sum);

        //Bir String teki tekrarli karakterleri ekrana yazdiran kodu ekrana yazoiniz
        //Alabala ==> la
        String t ="Alala";
        String result ="";

        for(int i = 0; i<t.length(); i++) {
            char ch = t.charAt(i);
            if ((t.indexOf(ch) != t.lastIndexOf(ch)) && !result.contains("" + ch)) {
                                                     //bu kisim tekrarlilari yazdirmiyor
                result = result + ch;
            }
        }
        System.out.println(result);





















    }
}
