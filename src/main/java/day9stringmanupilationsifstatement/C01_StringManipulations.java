package day9stringmanupilationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {

        // Ex : Bir stringin hic karakter icerip icermedigini kontrol eden kodu yaziniz.

        String str = ""; // hiclik

        //1.yol
        boolean result1 = str.length()==0; //Java iki islem yapti
        System.out.println("result1 = " + result1);
        
        // 2.yol
        // ********************isEmpty() *******************

        // isEmpty () methodu Stringte hiclik varsa true dondurur.
        // Java da space de bir karakter oldugu icin
        // space varsa false dondurur.

        boolean resultt2 = str.isEmpty(); //Java bir islem yapti, daha hizli calisir
        System.out.println("resultt2 = " + resultt2);


        // Ex: Bir Stringin datanin space haric hicbir karakteri icerip icermedigini gosteren kodu yaziniz
        // 1. yol
        boolean resultt3 =str.replace(" ","").length()==0; //Javaya 3 islem yaptirdik
        System.out.println("resultt3 = " + resultt3);
        
        //2.yol
        str.replace(" ","").isEmpty(); //iki islem yaptirdik
        System.out.println("resultt3 = " + resultt3);


        //3.yol
        //*************************isBlank()************************

        boolean resultt4 = str.isBlank(); // bir islem yaptirdik. Eger hiclikse "" veya sadece bosluk varsa " " bu kullanilir.
        System.out.println("resultt4 = " + resultt4);

        boolean resultt5 = str.replace(" ", "").length()==0;
        System.out.println("resultt5 = " + resultt5);
        


        /*
          isBlank() ==> space+hiclik ise true dondurur.
          String bir datanin bos mu dolu mu old bakar.
          isEmpty den farki space varsa yine true dondurur.
          isEmpty() boslukta da false donduruyor onu bir karakter olarak goruyor.
        */
         
        //**************************indexOf()***************************

        //Verilen karakter veya karakterlerin ilk gorunumunun indexini verir. int bir deger dondurur.
        //Coklu data icin kullanildiginda ilk gordugu datanin ilk karakterinin indexini verir.
        //Olmayan bir karakterin indexi sorulursa bize -1 dondurur.
        
        //Ex: Bir Stringte  a,i,e karakterlerinin ilk gorumunun indexleri toplamini ekrana yazdiriniz.

        String s = "Java is easy to learn"; //1+5+8=14 verecek
        int aIdx = s.indexOf('a');
        System.out.println("aIdx = " + aIdx); //1

        String s2 = "Java is easy to learn to easy to";
        int idx = s2.indexOf("to");
        System.out.println("idx = " + idx); //13
        int pIdx = s.indexOf('p');
        System.out.println("pIdx = " + pIdx); //Olmayan bir karakterin indexi sosulursa bize -1 dondurur.

        int eIdx = s.indexOf('e');
        System.out.println("eIdx = " + eIdx);//8

        int iIdx = s.indexOf('i');
        System.out.println("iIdx = " + iIdx); //5

        int sIdx = s.indexOf('e');
        System.out.println("sIdx = " + sIdx); //8

        System.out.println("indexler Toplami == " + (aIdx+ iIdx+ eIdx)); //14
        
        //Ex: bir string de "Java" kelimesinin ilk olarak kacinci Idx te old nu gosteren kodu yaziniz.
        
        String cumle = "Ah Java vah Java sen ne guzel seysin Java";
        int indexJava = cumle.indexOf("Java");
        System.out.println("indexJava = " + indexJava); //3
        
        int indexQ = cumle.indexOf("QYX");
        System.out.println("indexQ = " + indexQ); //-1 yok cunku

        //Ex. Bir String de a,i,e karakterinin son gorunumunun indexleri toplami ekrana yaziniz.

        String c="Java is easy to learn";

        int aLast= c.lastIndexOf('a');//18
        System.out.println("aLast = " + aLast);

        int iLast=c.lastIndexOf('i');
        System.out.println("iLast = " + iLast);//5

        int eLast=c.lastIndexOf('e');
        System.out.println("eLast = " + eLast);//17

        System.out.println("Toplam index : "+(aLast+iLast+eLast));//Toplam index : 40


        
        
        

        
























    }
}
