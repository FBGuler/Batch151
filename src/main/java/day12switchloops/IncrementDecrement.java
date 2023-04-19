package day12switchloops;

public class IncrementDecrement {
    public static void main(String[] args) {

        /*
        Increment artirmak, Decrement azaltmak demektir.
        Inrement toplama ve carpma ile , Decrement cikarma ve bolme ile yapilabilir.
        Inrement ve Decrement 3 yolla yapilabilir
          i) int i = 12; ==> i = i + 5;
          ii) int i = 12; ==> i += 5;
          iii) int i = 12; ==> i++;
             Note: 3, yol sadece 1 artirmak icin kullanilir

          i) int i = 12; ==> i = i -5;
          ii) int i = 12; ==> i -= 5;
          iii) int i = 12; ==> i--;
             Note: 3, yol sadece 1 artirmak icin kullanilir
         */


        int age = 12;
        System.out.println("age = " + age); //12
        
        age = age++;
        System.out.println("age = " + age);//12
        
        age = ++age; //pre increment
        System.out.println("age = " + age);
        
        age++; //post increment
        System.out.println("age = " + age);
        
        int salary = 40;
        salary = salary--; //Post Increment
        System.out.println("salary = " + salary);//40

        salary = --salary; //pre increment

        















    }
}
