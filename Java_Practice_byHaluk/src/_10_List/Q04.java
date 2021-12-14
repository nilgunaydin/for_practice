package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Bir ogretmenden girmek istedigi kadar notu aliniz, ve
        // ortalamayi gecen ogrenci sayisini bulunuz.

        List<Integer> listNotlar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String dewamkee;
        //ortalamasi alinacak int elemanlari kullanicidan alindi
        do {
            System.out.print("not giriniz : ");
            int ogrNot = scan.nextInt();
             listNotlar.add(ogrNot);
             System.out.println("dewamkeee : E/H");
            dewamkee = scan.next();
        } while (dewamkee.equalsIgnoreCase("E"));

        //ortlama hesaplanmasi..
        int toplam = 0;
        for (int i = 0; i < listNotlar.size(); i++) {

            toplam += listNotlar.get(i);
        }
        double ortalama = toplam / listNotlar.size();

        //ortlamayi gecen ogr sayisi

        int ortalamaGecenSayisi = 0;
        for (int i = 0; i < listNotlar.size(); i++) {
            if (listNotlar.get(i) > ortalama) {
                ortalamaGecenSayisi++;
            }

        }
        System.out.println("girilen notlarin ortalamasi  :" + ortalama);
        System.out.println("ortalama gecen ogrenci sayisi : " + ortalamaGecenSayisi);
    scan.close();}
}
