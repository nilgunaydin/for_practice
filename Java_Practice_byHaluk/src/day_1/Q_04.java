package day_1;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		// kullan�c�dan 2 tamsay� al�p 4 i�lem sonucunu yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.print("l�tfen ilk say�y� giriniz:");
		int num1= scan.nextInt();
		System.out.print("l�tfen ikinci say�y� giriniz:");
		int num2= scan.nextInt();
		System.out.println("say�lar�n toplam�: "+(num1+num2));
		System.out.println("say�lar�n fark�: "+(num1-num2));
		System.out.println("say�lar�n b�l�m�: "+(num1/num2));
		System.out.println("say�lar�n �arp�m�: "+(num1*num2));
	
	scan.close();
	}

}
