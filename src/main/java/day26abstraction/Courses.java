package day26abstraction;


/*
1)Bazen parent class daki method un body si hicbir child class tarafindan kullanilmaz.
bu durumda parent daki method da body yazmak hic kullanilmadigi icin mantikli degildier.
Biz de o method a body yazmayiz.
2)Body si yazilmayan method a "Abstract Method" denir.
Abstract Ingilizcede "vucutsuz veya soyut" anlamindadir.
3)Method un body sini yazmayinca Java hata verir, bide "abstract" keyword unu
kullanarak Java ya bu method un body si olmayacak deriz.
4)"Abstact" keywordunu kullaninca elde ettigimiz abstract method
normal class lara konulmamaz, o yuzden class i da "abstract" yapariz.
5)Parent taki method abstract ise butun child class lar o method u override etmek
zorundadir.
Bu yuzden tum child lar icin mecburi olmasini istedigimiz fonk. abstract
yapmak mantikli bir secimdir.
6)Body si olan method lar (Concrete Method) abstract classlarin icine yazilabilir.
abstract methodlar concrete class larin icine yazilamazlar.
7)Abstract keyword ile method body bir methodta ayni anda kullanilmaz.
8)Abstract class larin icinde "abstact methodlar" olur.Abstract methodlar body si olmadigindan
"eksik methodlar" gibi dusunulebilir.
Yani abstract class icinde eksik bir yapi barindirir, siz abstract class tan
obje uretirseniz abstract icindeki eksiklik objeye yansir, ve obje eksigi olan
bir obje olmus olur. Java bunu istemez cunku eksik obje eksik is yapar.
Buda aplication nin yanlis calismasina sebep olur, Java aplication i korumak icin abstract classlardan
object uretilmesini engellemisitr.
9)"Abstract class" larin constractor leri vardir ama object olusturamazlar.
10)"Final method" lar "abstract" olamazlar.
11)Private methodlar Abstract olamazlar.
12)Abstract class in abstract child i veya concrate chile i olabilir.
 */

/*
"Final" keyword'u aciklarmisiniz.
"final" keyword
i)Variable larda==> a)O variable a kesinlikle deger atamasi yapilmalidir
                    b)Ilk atanan deger asla degistirilemez

ii) method'larda==> a)O methodun body si degistirilemez.
                    b)O method override edilemez.

iii)Class'larda==> a)O class in child class'i olamaz ama final class in kendisi child olabilir.
                   b)

 */


public abstract class Courses {
    public abstract void math();

    public void art(){
        System.out.println("Learn art");
    }










}
