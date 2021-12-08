package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */


		Scanner scan= new Scanner(System.in);

		System.out.println("lütfen boyunuzu cm olarak giriniz...");
		
		double boy=scan.nextDouble();
		
		System.out.println("lutfen kilonuzu giriniz...");
		
		double kilo= scan.nextDouble();
		
		double vke = kilo/((boy/100)*(boy/100));
		
		if (vke<=20) {System.out.println("oldukca zayifsiniz");
			
		} else if(vke<=25){System.out.println("normalsiniz");
		} else if(vke<=30) {System.out.println("sisman kategorisindesiniz");
		} else {System.out.println("obez grubundasýnýz" );
		
		scan.close();
		
		}
		}

	}
