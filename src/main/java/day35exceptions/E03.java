package day35exceptions;

public class E03 {

    /*
    1)try block dan sonra coklu catch block kullanilabilir.
      catch block lar arasinda parent- child iliskisi yoksa catch blocklar istenildigin gibi siralanabilir.
      catch blocklar arasinda parent-child iliskisi varsa child ustte olmalidir.
    2)"Exception Class" tum Exception larin parentidir.
      Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi surece tek catch block i "Exception Class" ile kullanabilirsiniz.
    3)"try+ 1 catch" olur- "try+ cok catch" olur- "try" olmaz, tek basina kullanilamaz.
      "try" catch block olmadan kullanilabilir mi?
      "try +finally" olabilir.
     */




    public static void main(String[] args) {

        System.out.println(convertStringToIntDivideByLenght1("6"));
        System.out.println(convertStringToIntDivideByLenght2("6"));
        System.out.println(convertStringToIntDivideByLenght3("6"));


    }

    //Example 1: Bir String i integer a ceviren ve bu integer i String in lenght inin 1 eksigine bolen methodu olusturunuz.

    public static int convertStringToIntDivideByLenght1(String str) {

        int result = 0;
        try {

            int a = Integer.valueOf(str);

            result = a / (str.length() - 1);
        } catch (NumberFormatException e) {

            System.out.println("Non- digit character can not be used in valueOf()");

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }

        return result;



    }

    public static int convertStringToIntDivideByLenght2(String str) {

        int result = 0;
        try {

            int a = Integer.valueOf(str);

            result = a / (str.length() - 1);
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return result;
    }

    public static int convertStringToIntDivideByLenght3(String str) { //Parent child iliskisi varsa parent asagida child yukarda olmalidir.

        int result = 0;
        try {

            int a = Integer.valueOf(str);

            result = a / (str.length() - 1);
        } catch (ArithmeticException e) {

            System.out.println("Jump");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return result;
    }

    /*

MY NOTES
//valueOf() bos String'de de NumberFormatException hatasi verir
//Bir method'dan 2 farkli exception alma ihtimalimiz var. Ikisini birden handle etmemiz gerekir.
//valueOf() method'una sayi olmayan bir deger atanirsa "NumberFormatException" hatasi alinir.
//"Exception" tum exception'lari kapsayan genel bir exception turudur. 911 gibi...
//Excaption'a ozel durumlarda farkli "catch block"lar kullanmamiz gerekebilir
//"catch block"lar arasinda parent-child iliskisi varsa child yukarida parent asagida olmalidir.
Eger bu iliski yoksa "catch block"lar arasinda siralamanin onemi yoktur
//"Exception Class" tum exception classlarin parent'idir.


 */






}
