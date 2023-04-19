package practices01;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractices {
    public static void main(String[] args) {

    //String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
    //Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

        String [] b = new String[]{"Kemal", "Jonathan", "Merk", "Angie", "Veli"};
        int minLength = b[0].length();

        for ( String w : b) {
            minLength= Math.min(minLength,w.length());
        }
        for ( String w : b) {
            if (minLength==w.length()){
                System.out.println(w);
            }
        }






        //Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        //bulunuz.
        //Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2

        int [] num = new int[]{-12, 18, -5, 23, -2};//-12, -5 , -2,18, 23
        Arrays.sort(num);
        int minPozitif = num[num.length-1];
        int maxNegative = num[0];
        for (int m : num) {
            if(m>0){
                minPozitif = Math.min(minPozitif,m);
            }
            if (m<0){
                maxNegative = Math.max(maxNegative,m);

            }

        }

        System.out.println("Minimum positive: " + minPozitif);
        System.out.println("Maximum negative: " + maxNegative);









        //String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        //alınız.
        //Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM

        String [] str = new String[]{"Kemal", "Jonathan", "Mark", "Jackson", "Ali" };

        String firstLetters = "";

        for (String m : str){
            if (m.endsWith("n") || m.endsWith("k")){
                String firstLetter = m.split("")[0];
                firstLetters = firstLetters + firstLetter ;
            }
        }
        System.out.println("firstLetter = " + firstLetters);








        //String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        //Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

        String [] s = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int arrayLenght = 0;
        for (String f : s){
            arrayLenght= arrayLenght+ f.length();
        }
        System.out.println("arrayLenght = " + arrayLenght);



        //Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.
        Scanner str1 = new Scanner(System.in);
        System.out.println("Lutfen bir bol 'a' li cumle giriniz..");
        String a1 = str1.nextLine();
        int i = 0;
        String [] kelimeArray = a1.split(" ");
        for (String kelime: kelimeArray) {
            if (kelime.startsWith("a")||kelime.startsWith("A")){
                i++;
            }
        }
        System.out.println(i);












    }
}
