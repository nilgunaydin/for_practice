package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.print("pin code  giriniz : ");
        int userPin = scan.nextInt();
        int girisHakki=2;
        int systemPin=1453;
       
        while (userPin!=systemPin){
        	 if(girisHakki>0) {
        	System.out.println("kalan giris hakki"+girisHakki);
        	girisHakki--;
            System.out.println("*****   hatali giris yapildi *****");
            System.out.println("*****   agam bidaha dene *****");
            userPin=scan.nextInt();}else {System.out.println("Sistem kilitlendi.");
            break;
        }}
        
   if(userPin==systemPin) {System.out.println("gayet basarili....");} 
   scan.close();
}}

