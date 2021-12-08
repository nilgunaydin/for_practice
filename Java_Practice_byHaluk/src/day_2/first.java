package day_2;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		
    
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen vize sonucunuzu giriniz...");
        double vizenot = scan.nextDouble();
		System.out.println("lutfen vize yüzdesini giriniz(yüzde kac etkiledigini)");
		
		double vizeyuzde= scan.nextDouble();
		
		System.out.println("lutfen final notunuzu giriniz... ");
		double finalnot= scan.nextDouble();
		System.out.println("lutfen final yüzdesini giriniz(yüzde kac etkiledigini)");
		double finalyuzde= scan.nextDouble();
		
		double ortalama = (finalyuzde*finalnot/100)+(vizeyuzde*vizenot/100);
		
	
if (ortalama>100) {System.out.println("HATA");
	}else if (ortalama>=90.0) {System.out.println("AA");
	}else if (ortalama>=80.0) {System.out.println("BA");
	}else if(ortalama>=70.0) {System.out.println("BB");
	}else if(ortalama>=60.0) {System.out.println("CB");
	}else if(ortalama>=50.0) {System.out.println("CC");
	}else if(ortalama>=40.0) {System.out.println("DC");
	}else if(ortalama>=30.0) {System.out.println("DD");
	}else {System.out.println("FF");
	}
		
		scan.close();
	}

}
