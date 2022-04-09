package Zor_Market;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Zor_Market.Market_Depo.*;
import static Zor_Market.Miktar.miktarGir;


public class Urun_Sec {
    public static void urunSec() {
        System.out.println("*****Hosgeldiniz*****");
        System.out.println("Lutfen urun seciniz : ");
        List<String> urunListesi=new ArrayList<>(Arrays.asList("Domates","Patates","Biber","Sogan","Havuc","Elma","Muz",
                "Cılek","Kavun","Uzum","Limon"));
        String fiyat[]={"2.10","3.20","1.50","2.30","3.10","1.20","1.90","6.10","4.30","2.7","0.50"};
        String siraNo[]={"0","1","2","3","4","5","6","7","8","9","10"};
        System.out.println("No      Ürün       Fiyat");
        System.out.println("====   =======     =========");

        for (int i = 0; i < urunListesi.size() ; i++) {
            System.out.printf("%-5s %-10s     %-5sTL\n",siraNo[i],urunListesi.get(i),fiyat[i]);

        }

        String secim= scan.next();
        switch (secim){
            case "0":
                sepet.add(urunListesi.get(0));
                sepetFiyati.add(fiyat[0]);
                miktarGir();
                break;
            case "1":
               sepet.add(urunListesi.get(1));
               sepetFiyati.add(fiyat[1]);
               miktarGir();
               break;
           case "2":
               sepet.add(urunListesi.get(2));
               sepetFiyati.add(fiyat[2]);
               miktarGir();
               break;
           case "3":
               sepet.add(urunListesi.get(3));
               sepetFiyati.add(fiyat[3]);
               miktarGir();
               break;
           case "4":
               sepet.add(urunListesi.get(4));
               sepetFiyati.add(fiyat[4]);
               miktarGir();
               break;
           case "5":
               sepet.add(urunListesi.get(5));
               sepetFiyati.add(fiyat[5]);
               miktarGir();
               break;
           case "6":
               sepet.add(urunListesi.get(6));
               sepetFiyati.add(fiyat[6]);
               miktarGir();
               break;
           case "7":
               sepet.add(urunListesi.get(7));
               sepetFiyati.add(fiyat[7]);
               miktarGir();
               break;
           case "8":
               sepet.add(urunListesi.get(8));
               sepetFiyati.add(fiyat[8]);
               miktarGir();
               break;
           case "9":
               sepet.add(urunListesi.get(9));
               sepetFiyati.add(fiyat[9]);
               miktarGir();
               break;
           case "10":
               sepet.add(urunListesi.get(10));
               sepetFiyati.add(fiyat[10]);
               miktarGir();
               break;
            default:
                System.out.println("Hatali giris");
                urunSec();


        }





    }



}
