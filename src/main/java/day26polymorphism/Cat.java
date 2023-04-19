package day26polymorphism;

public class Cat extends Animal {

   public void meow(){
      System.out.println("Cats meow");
   }



   @Override
   public void eat(){
      //child daki override edilmis eat() methoduna "Overriding Method "denir.
      //Parent taki override edilmis eat() methoduna "Overriden Method" denir.
      System.out.println("Cats eat");
   }

   @Override//Override Annotation override kurallarini java tarafindan kontrol edilmesini saglar.
   public void drink() {
      System.out.println("Cats drink");
   }

   @Override
   public Animal create() {
      return super.create();
   }

   @Override
   public int add(int a, int b) {
      return a+b;
   }

   @Override
   public Integer multiply(int a, int b) {
      return super.multiply(a, b);
   }





}

