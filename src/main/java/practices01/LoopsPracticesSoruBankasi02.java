package practices01;

public class LoopsPracticesSoruBankasi02 {
    public static void main(String[] args) {

        //Loop 3. soru : Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.

        //1.yol
        String m = "anna";
        String x ="";
        for (int i=m.length()-1; i>-1; i--) {
            String c = m.substring(i, i + 1);
            x = x + c;
        }
            if (m.equals(x)) {
                System.out.println(x + "==Palindromdur");
            } else {
                System.out.println(x + "==Palindrom degildir");

            }


        //2.yol
        int t =123321;
            String m1 = String.valueOf(t);
            String x1 ="";
            int i1 = m1.length()-1;
        while (i1>-1){
            String c1 = m1.substring(i1, i1 + 1);
            x1 = x1 + c1;
            i1--;
        }
         if (m1.equals(x1)){
             System.out.println(x1 + "==Palindromdur");
         } else {
             System.out.println(x1 + "==Palindrom degildir");

         }

         //3. yol

        String str = "ece" ;
        String bos ="";
        int j = str.length()-1;
        do {
            String c2 = str.substring(j, j + 1);
            bos = bos + c2;
            j--;

        }while (j>-1);
            if (str.equals(bos)){
                System.out.println(bos + "==Palindromdur");
            } else {
                System.out.println(bos + "==Palindrom degildir");

            }



















    }
}
