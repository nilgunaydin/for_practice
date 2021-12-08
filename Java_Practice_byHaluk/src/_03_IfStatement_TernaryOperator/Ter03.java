package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
     
        //  çift olup olmadigini kontrol edin. Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
        // Çift sayı degilse "3 basamaklı olmayan tek sayı" yazdırın.
    	Scanner scan= new Scanner(System.in);
		System.out.println("lutfen pozitif bir tamsayi giriniz");
      int sayi=scan.nextInt();
      System.out.println(sayi>99 && sayi<1000 ? "üç Basamaklı sayı":sayi%2==0 ? "3 basamaklı olmayan çift sayı":"3 basamaklı olmayan tek sayı");
   scan.close();
   }
}