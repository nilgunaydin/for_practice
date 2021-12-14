package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class QMarket {
    /*
  Bir bakkalin 7 gunluk tum kazanclarini gunluk olarak gosteren bir program yaziniz.
  Ayrica bakkalin bu hafta ortalama kazandigi miktari gosteren bir method yaziniz.
  Ayrica bakkalin hangi gunler ortalamanin ustune kazandigini gosteren bir method yaziniz.
  Ayrica bakkalin hangi gunler ortalamanin altinda kazandigini gosteren bir method yaziniz.
 
  1. Adim : Gunleri iceren bir tane ArrayList olusturun. (gunler)
  2. Adim : Gunluk kazanclari ekleyecegimiz bir tane ArrayList olusturun. (gunlukKazanclar)
  3. Adim : While dongusu ile kullanicidan 7 gunluk kazanclari tekek teker
   alip gunlukKazanclar ArrayList'e ekle.
  4. Adim : getOrtalamaKazanc() adli method ile ortalama kazanci alin.
  5. Adim : getOrtalamaninUstundeKazancGunleri() adli method olusturun.
  	 for dongusu ile tum gunleri ortalama kazanc ile karsilastir
 	 ortalama kazanctan yuksekse o gunleri return yap.
  6. Adim : getOrtalamaninAltindaKazancGunleri() adli method olusturun.
	 for dongusu ile tum gunleri ortalama kazanc ile karsilastir
     ortalama kazançtan asagiysa o gunleri return yap.  */


    static List<String> gunler = new ArrayList<>(Arrays.asList(" Pazartesi", " Sali", " Carsamba", " Persembe", " Cuma", " Cumartesi", " Pazar"));//1. adım
    static List<Double> gunlukKazanclar = new ArrayList<>();//2. adım
    static double ciro = 0;

    public static void main(String[] args) {

        int gun = 0;
        Scanner sc = new Scanner(System.in);
        while (gun < 7) {//3. adım
            System.out.print(gunler.get(gun) + " gününün kazancını giriniz : ");//gunler listinden aldığım gün için kullanııcdan o günün hasılatını istedim.
            double gunlukhasilat = sc.nextDouble();//istediğim hasılatı gunluk hasılata atadım
            gunlukKazanclar.add(gunlukhasilat);//aldığım günlük hasılatı gunlukKazanclar listine ekledim.
            ciro += gunlukhasilat;//aldığım günlük hasılatı kasaya ekledim.
            gun++;//0 1 2 3 4 5 6 .günleri çağırdım.
        }
        getOrtalamaKazanc();
        getOrtalamaninUstundeKazancGunleri();
        getOrtalamaninAltindaKazancGunleri();

        System.out.println("gunlukkazanclar : " + gunlukKazanclar);
        System.out.println("ciro  : " + ciro);
        System.out.println("ortalama kazanc : " + getOrtalamaKazanc());
        System.out.println("ortalamanin ustundeki gun : " + getOrtalamaninUstundeKazancGunleri());
        System.out.println("ortalamanin altindaki gun : " + getOrtalamaninAltindaKazancGunleri());
   sc.close(); }

    private static String getOrtalamaninAltindaKazancGunleri() {//6. adim
        String ortAltGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) {
                ortAltGun += gunler.get(i);
            }
        }
        return ortAltGun;
    }

    private static String getOrtalamaninUstundeKazancGunleri() {//5.adim
        String ortUstGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) {
                ortUstGun += gunler.get(i);
            }
        }
        return ortUstGun;
    }

    private static double getOrtalamaKazanc() {//4. adim
        double ortalama = ciro / 7;
        return ortalama;
    }
}