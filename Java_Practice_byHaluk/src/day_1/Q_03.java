package day_1;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		// kullan�c�n�n ad soyad yas boy kilo altalta yazd�r�n�z
 Scanner scan =new Scanner(System.in);
 System.out.print("l�tfen ad�n�z� giriniz:");
 String name= scan.nextLine();
 System.out.print("l�tfen soyad�n�z� giriniz:");
 String surName= scan.next();
 System.out.print("l�tfen ya��n�z� giriniz:");
 int age = scan.nextInt();
 System.out.println("l�tfen son olarak da bi boy:");
 int legth = scan.nextInt();
 System.out.println("l�tfen son olarak da bi kilo:");
 int kilo = scan.nextInt();
  System.out.println("benim ad�m:"+name+ "\nsoyad�m:"+surName+"\nyas�m:"+age+"\nboyum:"+legth+"\nkilom:"+kilo);

	scan.close();}

}
