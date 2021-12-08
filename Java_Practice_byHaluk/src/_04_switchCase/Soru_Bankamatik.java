package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {

    public static void main(String[] args) {

        System.out.println("*****************************");
        System.out.println("ATM'ye Hoþgeldiniz...");

        String islemler = "1.Ýþlem : Bakiye öðrenme\n2.Ýþlem : Para Yatýrma\n"
                + "3.Ýþlem : Para Çekme\n"
                + "4.Ýþlem : Çýkýþ";

        System.out.println(islemler);
        System.out.println("*****************************");

        int bakiye = 1000000000;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yapmak istediðiniz iþlemi seçiniz: ");
        String islem = scanner.nextLine();

        switch (islem) {
            case "1":
                System.out.println("Bakiyeniz: " + bakiye);
                break;

            case "2":
                System.out.print("Yatýrmak istediðiniz tutarý girin: ");

                int tutar = scanner.nextInt();

                bakiye += tutar;

                System.out.println("Yeni bakiyeniz: " + bakiye);
                break;


            case "3":
                System.out.print("çekmek istediðiniz tutarý girin: ");
                int tutar2 = scanner.nextInt();


                if (tutar2 <= bakiye) {
                    bakiye -= tutar2;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                } else {
                    System.out.println("Yeterli bakiyeniz yok...");
                }
                break;

            case "4":
                System.out.println("Çýkýþ yapýlýyor...");
                break;
            default:
                System.out.println("Geçersiz iþlem...");
                break;
       }

 scanner.close();  }
}

