package _08_While_DoWhile;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /*
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kac adet urun aldiginizi giriniz: ");
        int alinanUrunSayisi = scan.nextInt();
        int toplam = 0;
        int urunFiyati = 0;
        int i = 1;
        while (i <= alinanUrunSayisi) {
            System.out.println("Lutfen aldiginiz " + i + ". urunun fiyatini giriniz: ");
            urunFiyati = scan.nextInt();
            i++;
            toplam += urunFiyati;
        }
        System.out.println("Musteri kartiniz var mi \n\n 'EVET' ya da 'HAYIR'");
        char musteriKarti = scan.next().toUpperCase().charAt(0);
        if (musteriKarti == 'E') {
            if (alinanUrunSayisi >= 10) {
                System.out.println(
                        "\nMusteri kartiniz oldugu icin alisverisinize %15 indirim uygulanmistir. Ek olarak 10'dan fazla urun aldiginiz icin bu indirim %20'ye yukseltilmistir. "
                                + "\n%20 indirim sonrasi odemeniz gereken tutar: " + (toplam - toplam * 20 / 100)
                                + " TL");
            } else {
                System.out.println(
                        "\nMusteri kartiniz oldugu icin alisverisinize %15 indirim uygulanmistir. \n%15 indirim sonrası ödemeniz gereken tutar: "
                                + (toplam - toplam * 15 / 100) + " TL");
            }
        } else if (musteriKarti == 'H') {
            if (alinanUrunSayisi >= 10) {
                System.out.println("\\n10'dan fazla urun aldiginiz icin alisverisinize %15 indirim uygulanmistir. "
                        + "\n%15 indirim sonrasi odemeniz gereken tutar: " + (toplam - toplam * 15 / 100) + " TL");
            } else {
                System.out
                        .println("\\nBugune ozel %10 indirim kazandiniz. \n%10 indirim sonrasi odemeniz gereken tutar: "
                                + (toplam - toplam * 10 / 100) + " TL");
            }
        }
    }
}
