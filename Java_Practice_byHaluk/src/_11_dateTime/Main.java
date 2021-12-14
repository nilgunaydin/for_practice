package _11_dateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	/*
        Bu uygulama kulan�c�lar�n bir ArrayListe kay�t zaman�n� da alarak
        ekleyen ve sonras�nda her dakikan�n ilk 10 saniyesinde kaydolanlar�
        �ansl� kullan�c� olarak ekrana yazd�ran bir uygulamad�r.
        Bunun i�in;
        1- Bir user class olu�turun fields: name , registerDate (LocalDateTime cinsinden)
        2- Registration isminde bir class olu�turun ve register isminde bir metod
        ekleyerek Kullan�c�dan user ismini alarak ArrayList e ekleyin ve bu list i
        return edin.
        3- Registration class� na ayn� zamanda kendine verilen
        ArrayListteki userlardan her dakikan�n ilk  saniyesinde kaydolanlar�
        yazd�ran printHappyUsers isminde bir metod daha ekleyiniz.

        �pucu �al��acak main metodu a�a��daki gibi olmal�d�r.

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