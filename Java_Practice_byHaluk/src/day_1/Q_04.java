package day_1;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		// kullanýcýdan 2 tamsayý alýp 4 iþlem sonucunu yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.print("lütfen ilk sayýyý giriniz:");
		int num1= scan.nextInt();
		System.out.print("lütfen ikinci sayýyý giriniz:");
		int num2= scan.nextInt();
		System.out.println("sayýlarýn toplamý: "+(num1+num2));
		System.out.println("sayýlarýn farký: "+(num1-num2));
		System.out.println("sayýlarýn bölümü: "+(num1/num2));
		System.out.println("sayýlarýn çarpýmý: "+(num1*num2));
	
	scan.close();
	}

}
