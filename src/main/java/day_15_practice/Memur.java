package day_15_practice;

public class Memur extends Muhasebe{

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
    //to String methodu objelerin tum ozelliklerini yazdiran bir ozelliktir.

    public static void main(String[] args) {


        Memur memur1 = new Memur();

        //Memur1 objesi, memur class inin objesi olmasina ragmen inherit ettigi
        // muhasebe ve onunda parentsi olan personel class lardaki tum datalari alabilir


        //personal class indan
        memur1.persNo= 1001;
        memur1.isim="Ahmet";
        memur1.soyIsim="Tepe";
        memur1.adres ="Ankara";
        memur1.tel="312456789";


        //Muhasebe class indan
        memur1.saatUcreti= 10;
        memur1.statu="Memur";
        memur1.maas= memur1.maasHesapla();

        System.out.println(memur1.persNo);//1001
        System.out.println(memur1.maas);//2400
        System.out.println(memur1.toString());//Memur{saatUcreti=10, statu='Memur', maas=2400, persNo=1001, isim='Ahmet', soyIsim='Tepe', adres='Ankara', tel='312456789'}



        Memur memur2 = new Memur();
        memur2.persNo= 1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();

        System.out.println(memur2.toString());//Memur{saatUcreti=10, statu='null', maas=2400, persNo=1002, isim='null', soyIsim='null', adres='null', tel='null'}

        //srtik bu fabrika istedigimiz kadar memur uretebiliriz, urettigimiz her
        // memur muhasebe ve personel classsin daki tum ozellikleri inherit etmis olur.












    }
}
