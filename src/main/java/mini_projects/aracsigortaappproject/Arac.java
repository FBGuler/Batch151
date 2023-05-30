package mini_projects.aracsigortaappproject;

import java.util.Scanner;

public class Arac {
    //tipi,prim
    public String type; // field/ feature/ ozellik
    public int prim;

    public void countPrim(int term){
        switch (this.type){
            case "otomobil":
                this.prim = term==1 ? 2000 :2500;
                break;
            case "kamyon":
                this.prim = term==1 ? 3000 : 3500;
                break;
            case "motosiklet":
                this.prim = term==1 ? 1500 : 1750;
                break;
            case "otobus":
                countPrimBus(term);
                break;
            default:
                System.out.println("Hatali Giris!!!");
                this.prim=0;
                break;
        }
    }

    private void countPrimBus(int term){
        Scanner input = new Scanner(System.in);
        System.out.println("Otobus tipini giriniz : ");
        System.out.println("1.18-30 koltuk");
        System.out.println("2.30 koltuk veya ustu");
        int busType= input.nextInt();
        switch (busType){
            case 1:
                this.prim= term== 1 ? 4000 : 4500;
                break;
            case 2:
                this.prim= term==2 ? 5000 : 5500;
                break;
            default:
                System.out.println("Hatali giris!!!");
                break;
        }
    }










}