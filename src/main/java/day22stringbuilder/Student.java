package day22stringbuilder;

public class Student {


    //Student name public old icin diger c;lass lardan ulasilabilir.

    public String stdName = "Ali Can";


    //Access modifier i default olan ile public olan class member lar ayni pacjage icinde kullanildiklarinda ayni ozellikleri gosterirler.
    //Fakat farkli package a gectiginizde, "public" olanlara ulasabilir, "default" olanlara ulasilamaz.
    int age= 23;

    //Accesss modifier i private olanlar sadece olusturulduklari class ta gorunurler, disina ciktiginizda goremezsisniz.

    private String healthCondition ="Cancer";

    //Acceess Modifier i "protected" olan Class Member lar ayni package icinde iken "Public" gibi davranirlar.
    //Farkli package a gectiginizde "protected" olanlar sadece child classlardan olurlar.
    protected  int salary = 3000;

    //Class lar public ve defult olabilir ama private ve protected olamazlar.




}
