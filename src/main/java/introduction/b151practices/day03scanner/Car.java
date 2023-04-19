package introduction.b151practices.day03scanner;

import java.sql.SQLOutput;

public class Car {
    //Variable'lar olusturalim.
    public String model = "Corolla";
    public int fiyat =20000;

    //Methodlar olurturalim.
    //Note: "return void type" oldugunda method icinde "return" keyword kullanilmaz.
    //eger bir method yeni bir data uretmiyorsa sadece belli bir islem yapiyorsa return type i void olur.
    public void hareket (){
        System.out.println("Corolla hizli hareket eder...");

    }

       public void dur() {
           System.out.println( "Corolla guvenli bir sekilde durur...");
       }





}
