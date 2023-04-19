package day18constructorsstatickeyword;

public class Student {
    /*
    1)"static" "class member" lar(variable+method+constructor+code blocks) tum object'ler tarafindan paylasilir.
    2)"static" "class member" lardaki degisiklikleri tum objectler tarafindan otomatik olarak gorulur
    3)"static" "class member" lar gokteki ay in dunyaya bagli old gibi, class a baglidirlar.
       Bu yuzden "static variable"lara nasil
     */

    /*
    Static olanlar class ismiyle cagirilir, static olmayanlar obje olusturup cagrilir.
     */

    public static int numOfRegisteredStd = 0;
    public int num = 0;

    public Student() {
        numOfRegisteredStd++;
        num++;

    }

    public static void main(String[] args) {

        System.out.println(numOfRegisteredStd);//0
        Student s1 = new Student();
        System.out.println(numOfRegisteredStd);//2

        Student s2 = new Student();

        Student s3 = new Student();

        System.out.println(numOfRegisteredStd);//3
        System.out.println(s1.num);//1





















    }
}
