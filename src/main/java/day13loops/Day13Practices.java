package day13loops;

import java.util.Scanner;

public class Day13Practices {
    public static void main(String[] args) {

        //120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız

      //1.yol:
        for( int i = 120 ; i>10  ; i-- ){
            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
       //2.yol :
        String b = "";
        int x = 120;
        while (x>10){
            if(x%4==0 && x%6==0){
                b = b+x+" ";
            }
            x--;
        }
        System.out.println(b);

       //3.yol:
        String a = "";
        int y = 120;
        do{
            if(y%4==0 && y%6==0){
                a = a+y+" ";
            }
            y--;
        }while(y>10);
        System.out.println(a);

     //Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
     // Örneğin; accessories ´ ces
       String str = "accessories";
       String c = "";
       int i = 0;

       do {
           String d = str.substring(i, i + 1);
           if (str.indexOf(d) != str.lastIndexOf(d)) {
               if (!c.contains(d)) {
                   c = c + d;
               }
           }else
           i++;
       }while(i< str.length());
        System.out.println(c);


        //Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.

        //1. yol
        String s = "anna";
        String m ="";
        for( int z = s.length()-1  ; z>-1   ; z--  ){
            String d = s.substring(z,z+1);
            m = m+d;
        }
        if(s.equals(m)){
            System.out.println("palindromdur");
        }else {
            System.out.println("palindrom degildir");
        }







    }
}






