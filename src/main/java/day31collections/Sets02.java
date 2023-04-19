package day31collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {

        //Example 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.

        //1.yol:
        long t1 = System.nanoTime();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("t@gmail.com");
        emails.add("g@gmail.com");
        emails.add("x@gmail.com");
        emails.add("e@gmail.com");
        emails.add("b@gmail.com");
        emails.add("c@gmail.com");

        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, e@gmail.com, g@gmail.com, t@gmail.com, x@gmail.com]

        long t2 = System.nanoTime();


        //2. Way recommended

        HashSet<String> emailsHs = new HashSet<String>();
        emailsHs.add("a@gmail.com");
        emailsHs.add("t@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("x@gmail.com");
        emailsHs.add("e@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("c@gmail.com");

        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);//[a@gmail.com, b@gmail.com, c@gmail.com, e@gmail.com, g@gmail.com, t@gmail.com, x@gmail.com]

        long t3 = System.nanoTime();

        System.out.println(t2-t1);//treeSet
        System.out.println(t2-t3);//hashSet





















    }

}
