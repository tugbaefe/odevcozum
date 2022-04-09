package Zor_Market;

import static Zor_Market.Market_Depo.*;

public class Kasa {
    public static void kasa() {
        double toplam=0;
        System.out.println("Urun      Miktar      BirimFiyat      UrunToplamFiyat");
        System.out.println("====      =======     ==========      ========= ");

        for (int i = 0; i < sepet.size() ; i++) {
            System.out.printf("%-10s %-10s   %-5sTL  %-10sTL\n",sepet.get(i),urunMiktari.get(i),
                    sepetFiyati.get(i),Double.valueOf(sepetFiyati.get(i))*Double.valueOf(urunMiktari.get(i)));
            toplam+=Double.valueOf(sepetFiyati.get(i))*Double.valueOf(urunMiktari.get(i));

        }

        System.out.println("Odemenız gereken toplam tutariniz : "+ toplam);
        System.out.println("Tekrar bekleriz");


    }


}
