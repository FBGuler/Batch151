package practices01;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Calisma01 {
    public static void main(String[] args) {


        //Java guzel bir dil.

         /* Example 1:
        kullanıcıdan bir cumle sisteme girmesini isteyiniz.
        method olusturarak cumlede gecen sesli harfleri konsola yazdırınız
                */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        String [] arr = cumle.split("");

        boslukCikar(arr);

        System.out.println();
        sesliHarfler(arr);











    }

    public static void boslukCikar (String []x){
        String bos = "";
        for (String w: x) {
            if (!w.trim().isEmpty()){
                bos +=w;
            }
        }
        System.out.print(bos);


    }





    public static void sesliHarfler (String []x){

        for (int i = 0; i < x.length; i++) {
            if (x[i].equalsIgnoreCase("a")|| x[i].equalsIgnoreCase("e")|| x[i].equalsIgnoreCase("i")|| x[i].equalsIgnoreCase("o")|| x[i].equalsIgnoreCase("u")){
                System.out.print(x[i]);
            }
        }



    }





}
