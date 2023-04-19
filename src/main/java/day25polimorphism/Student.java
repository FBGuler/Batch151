package day25polimorphism;

public class Student {
    public String stdName = "TomHanks";
    public int age = 23;

    //Encapsulation nedir? Data saklamaktir. (Data hiding )
    //Data yi nasil saklrsin? Access Modifier ini "private" yaparak
    private String stdId = "AC2023102T";
    private double gpa = 3.87;
    private boolean successful = false;

    //Encapsulation yaptiginiz data yi istersek diger class lardan okuyabiliriz.
    //Nasil okuruz? "get method" olusturarak Encapsulate edilmis data ynin degerini okuyabiliriz.

    //i) Get methodlari hep "public" olur. ii)get methodlarin return type i okudugu variable in type i ile ayni olur.
    //iii)get method ismi "is" ile baslar

    public String getStdId(){

        return stdId;
    }

    public double getGpa() {

        return gpa;
    }

    //Encapsulation yapilan variable in data type i "boolean" ise
    //get method ismi "is" ile baslar
    public boolean isSuccessful() {

        return successful;
    }

    //Encapsulation yaptigimiz data'yi istersek diger class'lardan okuyabiliriz
    //Nasil okuruz? "get method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz.
   //i)get method'lar hep "public" olur. ii) get method'un "return type"i okudugu variable'in return type'i ile ayni olur.
   //iii)get method bir boolean variable icin olusturulduysa ismi "is" ile baslar.
    //iv) set method kullanarak varolan object uzerinden degisiklikler yaparak o object i sanki yeni bir object mis gibi kullanabiliriz.
    //Note: getmethod larin diger adi "getter", set method'larin diger adi "setter" dir.


    public void setGpa(double gpa) {

        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {

        this.successful = successful;
    }
}
