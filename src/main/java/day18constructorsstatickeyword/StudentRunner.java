package day18constructorsstatickeyword;

public class StudentRunner {
    public static void main(String[] args) {


        //static "numOfRegisteredStd" variablenin cagirmak icin sadece class ismini kullandik, object olusturmadik.
        System.out.println(Student.numOfRegisteredStd);

        //static olmayan "num" variable ni cagirmak icin object olusturduk.
        Student s1 = new Student();
        System.out.println(s1.num);

        //static olan "numOfRegisteredStd" variable nin object uzerinden de ulasilabilirsiniz ama bu hatadir.
        System.out.println(s1.numOfRegisteredStd);





    }
}
