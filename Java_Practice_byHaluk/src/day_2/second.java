package day_2;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		// 
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lütfen iki sayý giriniz...");
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
		System.out.println("lütfen bir iþlem seçiniz ve adýný yazýnýz...");
		
		String islem= scan.next();
		 if(islem.equals("toplama")) {System.out.println(sayi1+sayi2);
		 } else if (islem.equals("cikarma")) {System.out.println(sayi1-sayi2);
		 } else if (islem.equals("bolme")) {System.out.println(sayi1/sayi2);
		 } else if (islem.equals("carpma")) {System.out.println(sayi1*sayi2);
		 }else {System.out.println("yanlis girdiniz,yeniden deneyiniz");
		 }
		 
		 scan.close();
		 

	}

}
