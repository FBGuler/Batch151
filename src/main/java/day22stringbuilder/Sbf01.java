package day22stringbuilder;

public class Sbf01 {
    public static void main(String[] args) {


        /*
        1)StringBuffer Java da String ureten bir Class dir.
        2)StrinBuffer StringBuilder a cok benzer ikiside "mutable" String uretir.
        3)StringBuffer "multi-thread", ama StringBuilder "multi-thread" degildir. "multi-thread" bir anda cok is yapabilmek demek.
        4)Java StrinBuffer i StringBuilderdan once olusturdu.
        5)StringBuilder "multi-thread" olmadigindan StringBuffer dan daha hizli calisir.
        6)"multi-thread" yapilirken yapilan islerin sirasi onem arzeder, yapilan isleri mantikli bir
        siraya koymak "syncronizatio" olarak adlandirilir. StringBuffer "multi-thread" old. icin ayni zaman "synchronized" dir.


        3 tane Strin olusturan class ogrendik.
        1)Immutable String lazimsa : String Class
        2)Mutable String lazimsa;StringBuilder ve StringBuffer
                                 i)StringBuilder'i "multi-thread" gerekmezse kullaniriz.
                                 ii)StringBuffer'i "multi-thread" gerekirse kullaniriz.
         */


        StringBuffer sbf1 = new StringBuffer("Jav");





    }






}
