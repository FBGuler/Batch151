package javaders.day01variablescanner;

import java.util.Scanner;

public class Practices01 {
    public static void main(String[] args) {


        //İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız


        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        for(String w:arr){
            String firstChar = w.substring(0, 1);
            String lastChar = w.substring(w.length()-1);
            if(firstChar.equals(lastChar)){
                System.out.println(w);
         
            }
        }






    }
}
