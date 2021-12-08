package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        // Kullanicidan 5 sayi isteyiniz, bu sayilardan en buyugunu bularak yazdiriniz.
        Scanner scan = new Scanner(System.in);

        int enbSayi = 0;
        int count = 0;
        while (count < 5) {
            System.out.print("sayi giriniz : ");
            int sayi = scan.nextInt();
            if (sayi > enbSayi) {
                enbSayi = sayi;

            }
            count++;
        }
        System.out.println("enbuyuk sayi :"+enbSayi);
    }
}


