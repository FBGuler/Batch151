package day9stringmanupilationsifstatement;

public class C01_StringManipulationsIfStatementPractice {
    public static void main(String[] args) {


        //Ex. Bir String de a,i,e karakterinin son gorunumunun indexleri toplami ekrana yaziniz.

        String c="Java is easy to learn";

        int ia = c.lastIndexOf('a');
        int ii = c.lastIndexOf('i');
        int ie = c.lastIndexOf('e');

        System.out.println("toplami =" + (ia+ii+ie));//40

        //    INTERVIEW QUESTIONS USA QA
        //    String str = "abbccdc"; tekrarsiz karakterleri ekrana yazdiriniz

       String str = "abbccdc";
       if ( str.indexOf('a')== str.lastIndexOf('a')){
           System.out.print('a');
       }

        if ( str.indexOf('b')== str.lastIndexOf('b')){
            System.out.print('b');
        }

        if ( str.indexOf('c')== str.lastIndexOf('c')){
            System.out.print('c');
        }

        if ( str.indexOf('d')== str.lastIndexOf('d')){
            System.out.println('d');
        } //ad

        // ex: sayi pozitif ise ekrana "Pozotif sayi" yazdiran kodu yaziniz

        int num =20;
        if (num>0){
            System.out.println("Pozitif sayi ");
        }



        // ex: Sayi -1 ile 10 arasnda ise ekrana "Rakam" yazdiriniz.

        int number = 8;
        if (number>-1 && number<10){
            System.out.println("Rakam");
        }

        // Ex: Sayi uc basamakli ise ekrana "Sayi uc basamaklidir" yazdiriniz

        int n = -234;
        n = Math.abs(n);
        if (n>99 && n<1000){
            System.out.println("Sayi uc basamaklidir");
        }















    }
}
