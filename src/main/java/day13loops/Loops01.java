package day13loops;

public class Loops01 {

    public static void main(String[] args) {


        //21 den 180 e kadar hem 4 hemde 6 ile bolunebilen tamsayilari yaziniz.

        for (int x = 21; x<181; x++){
            if (x%4==0 && x%6==0){
                System.out.print(x+ " ");
            }
        }
        System.out.println();

        // Size verilen kucuk harfle yazilmis String in indexi cift sayi olan characterlerini buyuk  harfe donusturunuz

        String s="miami";

        for( int i =0; i<s.length(); i++ ){

            String ch = s.substring(i,i+1);

            if (i%2==0){

                System.out.print(ch.toUpperCase());
            }else{
                System.out.print(ch);
            }
        }
        System.out.println();
         // Verilen bir String te ilk 'a' harfinden onceki tum charakterleri cosola yazdiriniz
        // Hello Java ==> Hello J
          String t = "Hello Java";
        for (int i = 0; i< t.length() ; i++){
            char ch = t.charAt(i);
            if(ch=='a'){
                break; // Loop'u herhangi bir sarta gore kirmak icin "break" keyword kullanilir.
            }else{
                System.out.print(ch);
            }

        }

        System.out.println();
          //Verilen String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //"Tokatci==> ict
        String u = "Tokatci";
        for(int i = u.length()-1; i>=0; i--){
            char ch = u.charAt(i);
            if(ch=='a'){
                break;
            }else{
                System.out.print(ch);
            }
        }










    }
}
