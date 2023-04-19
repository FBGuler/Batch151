package practices01;

public class LoopsPracticesSoruBankasi01 {
    public static void main(String[] args) {

        //120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.
        //1. yol

        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        //2.yol
        int i = 120;

        while (i > 10) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }

            i--;
        }
        System.out.println();
        //3.yol
        String sum = "";
        int r = 120;

        do {

            if (r % 4 == 0 && r % 6 == 0) {
                sum = sum + r + " ";
            }

            r--;

        } while (r > 10);
        System.out.println(sum);


        //exp 2: Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ´ ces

        //do-while
        String str = "accessories";
        String sum1 = "";
        int a = 0;


        do {
            String c = str.substring(a, a + 1);
            if (str.indexOf(c)!=str.lastIndexOf(c)) {
                if(!sum1.contains(c)) {
                    sum1 = sum1 + c;
                }

            }
            a++;
        }while (a < str.length()) ;

            System.out.println( sum1); //ces




















    }
}
