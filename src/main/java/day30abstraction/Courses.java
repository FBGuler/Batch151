package day30abstraction;

public abstract class Courses {

   public abstract void math ();

   public void art (){
      System.out.println("Learn Art");
   }






   /*
   1)Eger bir class ta objecy olusturulmasini istemiyorsak ve bu class i sadece child class larin yapmak
   zorunda olduklari gorevleri belirlemek icin kullaniyorsak "Abstraction" yapariz.
   2)Bazen parent class taki methodun body si hicbir child clas tarafindan kullanilmaz.Bu durumda parenttaki
   methoda body yazmak hic kullanilmadigi icin mantikli degildir.Bizde o methoda body yazmayiz.
   3)Body si yazilmayan methoda Abstract method denir.Abstract ingilizcede vucutsuz ya da soyut denir.
   4)Methodun body sini yazmayinca Java bize hata verir.Biz de abstract keywordunu kullanarak bu methodun body si olmayacak
   deriz.
   5)abstract keywordunu kullaninca elde ettigimiz abstract method, normal classlara konulamaz.o yuzden
   classi da abstract yapmaliyiz.
   6)Parentta ki method abstract ise tom child classlar o methodu override etmek ve body eklemek zorundadir.
   Bu yuzden tum childlar icin mecburi olmasini istedigimiz fonction lari abstract
   yapmak mantikli bir secimdir.
   7)Body si olan methodlar (concrete method) abstract classlarin icine yazilabilir.ama abstract methodlar
   concrete classlarin icine yazilamazlar.Concrete methodlar child classlar tarafindan override edilmek zorunda degildir.
   8)abstract keyword ile method body bir methodda ayni anda kullanilamaz.
   9)final methodlar abstract olamazlar. final methodlar override edilemezler.
   Halbuki  halbuki abstract methodlar override edilmek icin olusturulur Bu celiskidir, bu yuzden java abstract
   10) Abstract classlarin icinde abstract methodlar olur, abstract methodlarin body si olmadigindan eksik methodlar gibi dusunulebilir.
   yani abstract classlar eksik yapi barindirir, siz abstract class ta birsey uretirseniz objeye yansir.Java bunu istemez cunku eksik obje eksik is yapar.
   Buda application in yanlis calismasina sebep olur.Javada application i korumak icin abstract classlarin object uretilmesi engellenmistir.
   11)Abstract classlarin constractoru vardir ama object olusturamazlar.
   12)abstract classlarin abstract child i veya concrete chili olabilir.
   13)Abstract methodlar "Private" olamazlar cunku child classlar abstract methodlari kullanirlar.private yapinca kullanima kapali hale gelir
   bu celiskidir, bu yuzden Java abstract methodlarin private olmasina musade etmez.

   */









































}
