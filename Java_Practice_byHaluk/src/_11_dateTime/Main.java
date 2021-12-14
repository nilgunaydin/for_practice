package _11_dateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	/*
        Bu uygulama kulanýcýlarýn bir ArrayListe kayýt zamanýný da alarak
        ekleyen ve sonrasýnda her dakikanýn ilk 10 saniyesinde kaydolanlarý
        þanslý kullanýcý olarak ekrana yazdýran bir uygulamadýr.
        Bunun için;
        1- Bir user class oluþturun fields: name , registerDate (LocalDateTime cinsinden)
        2- Registration isminde bir class oluþturun ve register isminde bir metod
        ekleyerek Kullanýcýdan user ismini alarak ArrayList e ekleyin ve bu list i
        return edin.
        3- Registration classý na ayný zamanda kendine verilen
        ArrayListteki userlardan her dakikanýn ilk  saniyesinde kaydolanlarý
        yazdýran printHappyUsers isminde bir metod daha ekleyiniz.

        Ýpucu Çalýþacak main metodu aþaðýdaki gibi olmalýdýr.

        public static void main(String[] args) {
        Registration userReg = new Registration();
        ArrayList<User> register = userReg.register();
         userReg.printHappyUsers(register);
        }  */
       Scanner scan = new Scanner(System.in);
        String islem;

        Kayit yeniKayit = new Kayit();
        List<Kullanici> kisi = new ArrayList<>();

        boolean cikilsinMi = false;
        while (!cikilsinMi) {
            System.out.println("lutfen \n " +
                    "Kisi eklemek icin-->1" +
                    "\n Kisi listelemek icin--2\n " +
                    "sansli kisi bulmak icin-->3\n " +
                    "cikis icin-->4");
            islem = scan.next();
            switch (islem) {
                case "1":
                    kisi = yeniKayit.kayitAl();
                    break;
                case "2":
                    yeniKayit.listele(kisi);
                    break;
                case "3":
                    yeniKayit.sansliKull(kisi);
                    break;
                case "4":
                    cikilsinMi = true;
                    break;
                default:
                    System.out.println("hatali veri girdiniz");
                    break;

            }
        }
  scan.close();  }
}