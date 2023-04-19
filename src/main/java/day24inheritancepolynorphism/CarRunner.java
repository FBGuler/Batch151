package day24inheritancepolynorphism;

public class CarRunner {
    public static void main(String[] args) {

           /*
            Java diyor ki once parent'i sonra child'i olustur. Burada once Car sonra Toyota'yi olusturduk.
        Java once Car'i calistirir. Yani once onu yazdirir, sonra asagidaki constructorlari calistirir.
        Biz Java'ya Toyota(); constructor'ini calistir, icinde parametre olmayani calistir dedik.
        Bu constructor Toyota uretecek, ama once parent'i olan Car'in uretilmesi gerekir.
        Her constructor'in ilk satirinda gorunmez kodu vardir. O da super() seklindedir.
        Super parent demektir. O yuzden once parent'e gidilir.
        Car'in da parent'i varsa oradaki constructor da super parantez nedeniyle kendi parent'ina gider.
        En tepeden Object Class'tan calismaya basladi asagilara kadar geldi.
        Bizi yukariya tasiyan kod su super keyword'udur. Bu sizi parent'daki constructor'a tasir.
     */

        Honda h1 = new Honda();

        String s = "Ali";

        Volvo v1 = new Volvo();
        v1.move();



















    }
}
