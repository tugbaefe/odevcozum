package Zor_Market;

import static Zor_Market.Kasa.kasa;
import static Zor_Market.Market_Depo.*;
import static Zor_Market.Urun_Sec.urunSec;

public class Miktar {

    public static void miktarGir() {
        System.out.println("Istediginiz miktari giriniz : ");
        String miktar= scan.next();
        urunMiktari.add(miktar);
        System.out.println("Alisverise devam etmek istiyorsaniz 1'i kasaya gitmek icin 0'ı tuslayiniz");
        String tercih= scan.next();
        if (tercih.equals("1")){
            urunSec();
        }else if (tercih.equals("0")){
            kasa();
        }else {
            System.out.println("Yanlıs giris yaptiniz ");
            miktarGir();
        }
    }
}
