package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("l�tfen iki say� yaz�n�z:");
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		System.out.print("l�tfen i�lem ad�n� yaz�n�z:");
		String islem= scan.next();
		
		
		if (islem.equals("arti")) {System.out.println(sayi1+sayi2);
			
		} else if(islem.equals("eksi")){System.out.println(sayi1-sayi2);

		} else if(islem.equals("carpma")){System.out.println(sayi1*sayi2);
		
		} else if(islem.equals("bolme")) {System.out.println(sayi1/sayi2);
		
		} else {System.out.println("i�lem ismini d�zg�n gir");
		}
scan.close();		
	}

}
