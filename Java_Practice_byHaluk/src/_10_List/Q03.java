package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list olusturunuz ve bu list'deki tum sayilarin karesinin
   toplamini bulunuz. Sonucu ekrana yazdiriniz.
    */
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("liste atamak icin sayi giriniz: ");
        System.out.println("yeterli sayiya ulastiginizda 'q' giriniz ");
        int toplam = 0;
        String islem = "";
     do {System.out.println("sayi giriniz : ");
     	 islem = scan.next();
         list.add(islem);}  while (!islem.equalsIgnoreCase("q"));

        list.remove(list.size() - 1);//icinde q bulunmayan sadece sayi bulun list haline geldi

        //lisr elemanlari icine girip kareleri toplami bulun
        for (String w : list) {
            int a = Integer.parseInt(w);
            toplam += a * a;
        }
        System.out.println("girilen sayilarin kareleri toplami :" + toplam);
   scan.close(); }
}
