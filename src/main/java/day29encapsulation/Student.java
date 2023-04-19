package day29encapsulation;

public class Student {

    //Encapsulation ==> kelime anlami itibariyle kapsulleme demektir
    //Encapsulation Data Hiding (==>Veri saklamak)
    //Data nasil saklanir?
    //Access Modifierlarini private yaparak datayi diger classlardan gorunmez hale getiririm. Boylece data ti saklamis olurum
    //get methodlar public olur
    //get methodun return type i okudugu variable in return type ile ayni olur
    //get method bir boolean variable icin olusturulduysa eger ismi "is" ile baslar.

     private String stdId ="AC2023102T";
     public int age = 19;

     private double notOrt = 3.53;
     private boolean succesful = false;

     //Encapsulation yaptigimiz data yi istersek diger classlardan okuyabiliriz.
     //Nail okuruz?
     //"get method" olusturarak Encapsulate edilmis datanin degerini okuyabiliriz.


    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }
    /*
    Encapsulation yaptigimiz datayi istersek diger classlardan degistirebiliriz.Nasil degistirebiliriz?
    "Set method" olusturarak Encapsulation ettigimiz datanin degerini degistirebiliriz.
        a)set methodlari herzaman "public" olur.
        b)set methodlarin return type i her zaman void olur.
        c)set method parametre kullanir, parametrenin data type i veriable ile ayni olmak zorundadir.
  ====> set method kullanarak varolan object uzerinde degisiklikler yaparak o object i sanki yeni
  bir object mis gibi kullanabiliriz.
     get method larin diger adi "getter", set methodlarin diger adi "setter" dir.
     */

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}
