package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        /* 7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.

        todo  :  Koşul kısmı
 			eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak 
 			AA, 80(80dahil)   ile 90 arasında ise  
 			BA, 70(70 dahil)   ile 80 arasında ise 
 			BB, 60(60dahil) ile 70 arasında ise 
 			CB, 50(50 dahil) ile 60 arasında ise 
 			CC, 40(40 dahil) ile 50 arasında ise 
 			DC, 30(30 dahil) ile 40 arasında ise 
 			DD, 30 'dan düşük ise FF  gelmeli.
 			
         */
    	
    	Scanner scan= new Scanner(System.in);
    	System.out.print("Vize s�nav sonucunuzu giriniz :");
		double vs =scan.nextDouble();
		System.out.print("Vize s�nav y�zdesini giriniz :");
		double vy=scan.nextDouble();
		System.out.print("Final s�nav sonucunuzu giriniz :");
		double fs =scan.nextDouble();
		System.out.print("Final s�nav y�zdesini giriniz :");
		double fy = scan.nextDouble();
		double ort= vs*vy/100 + fs*fy/100;
		
		if (ort>=90) {System.out.println("Ge�me Notunuz: AA");
			
		} else if(ort>=80){System.out.println("Ge�me Notunuz: BA");

		} else if(ort>=70) {System.out.println("Ge�me Notunuz: BB");
		
		} else if (ort>=60) {System.out.println("Ge�me Notunuz: CB");
		
		} else if (ort>=50) {System.out.println("Ge�me Notunuz: CC");
		
		} else if (ort>=40) {System.out.println("Ge�me Notunuz: DC");
		
		} else if (ort>=30) {System.out.println("Ge�me Notunuz: DD");
			
		}else {System.out.println("Ge�me Notunuz: FF");
		
    
    }
    
    scan.close();
    }
}
