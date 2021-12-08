package day_1;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		// kullanýcýnýn ad soyad yas boy kilo altalta yazdýrýnýz
 Scanner scan =new Scanner(System.in);
 System.out.print("lütfen adýnýzý giriniz:");
 String name= scan.nextLine();
 System.out.print("lütfen soyadýnýzý giriniz:");
 String surName= scan.next();
 System.out.print("lütfen yaþýnýzý giriniz:");
 int age = scan.nextInt();
 System.out.println("lütfen son olarak da bi boy:");
 int legth = scan.nextInt();
 System.out.println("lütfen son olarak da bi kilo:");
 int kilo = scan.nextInt();
  System.out.println("benim adým:"+name+ "\nsoyadým:"+surName+"\nyasým:"+age+"\nboyum:"+legth+"\nkilom:"+kilo);

	scan.close();}

}
