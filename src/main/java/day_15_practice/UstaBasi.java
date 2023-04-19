package day_15_practice;

public class UstaBasi extends Isci{
    @Override
    public String toString() {
        return "UstaBasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", \npersNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {

        UstaBasi ustabasi1 = new UstaBasi();

        ustabasi1.isim= "Murat";

        ustabasi1.soyIsim= "Gokcek";

        ustabasi1.saatUcreti= 15;

        ustabasi1.maas= ustabasi1.maasHesapla();

        ustabasi1.statu ="Isci";

        ustabasi1.isciStatu="Ustabasi";

        ustabasi1.mesai();
        System.out.println(ustabasi1.toString()); //UstaBasi{isciStatu='Ustabasi', saatUcreti=15, statu='Isci', maas=3600,
                                                  //persNo=0, isim='Murat', soyIsim='Gokcek', adres='Adress girilmedi', tel='Tel girilmedi'}

















    }
}
