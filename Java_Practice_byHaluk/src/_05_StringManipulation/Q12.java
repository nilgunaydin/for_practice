package _05_StringManipulation;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
		
//        Kullanicidan email girmesini isteyin
//       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
//       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
//       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
//       ORNEK:
//       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
//       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
//       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       Scanner scan= new Scanner(System.in);
       System.out.print("l�tfen e mail girin:");
        String mail=scan.next();
        if (!mail.contains("@")) 
        {System.out.println("l�tfen ge�erli bir mail giriniz.");}else if(mail.substring(mail.indexOf("@")).equals("@gmail.com")) {System.out.println("email ba�ar� ile kaydedildi.");}else {System.out.println("l�tfen gmail hesab�n�z� giriniz.");}scan.close();}}


