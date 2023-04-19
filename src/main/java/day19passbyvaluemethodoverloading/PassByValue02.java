package day19passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {
        String name = "Tom Hanks";
        System.out.println("name = " + name);

        String updateName= updateName(name,"Ali");//Tom Hanks Ali
        System.out.println(updateName);//Tom Hanks
        name = updateName(name,"senior");
        System.out.println("updateName = " + updateName);//Tom Hanks senior

    }
    public static String updateName (String name, String add){
        name = name+" "+ add;
        return name;
    }


}
