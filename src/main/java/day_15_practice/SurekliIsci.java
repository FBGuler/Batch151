package day_15_practice;

public class SurekliIsci extends Isci{

    @Override
    public String toString() {
        return "SurekliIsci{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {

        SurekliIsci surIc1 = new SurekliIsci();

        surIc1.persNo=5001;
        surIc1.isim= "Cem";
        surIc1.soyIsim= "Oz";
        surIc1.statu="Isci";
        surIc1.saatUcreti=11;
        surIc1.maas= surIc1.maasHesapla();



        System.out.println(surIc1.toString());//SurekliIsci{isciStatu='Surekli Isci', saatUcreti=11, statu='Isci', maas=2640, persNo=5001, isim='Cem', soyIsim='Oz', adres='null', tel='null'}













    }









}
