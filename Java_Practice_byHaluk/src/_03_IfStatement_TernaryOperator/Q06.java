package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //// Kullanicidan aldiginiz koordinat noktasinin hangi bogede oldugunu yazdiran bir kod yaziniz.
    	Scanner scan= new Scanner(System.in);
		System.out.println("lutfen x ve y koordinatlarini giriniz");
       int x= scan.nextInt();
       int y=scan.nextInt();
 System.out.println((x>0 ? y>0? "bu kordinatlar 1.bolgededir":"bu kordinatlar 4.bolgededir":
	 y>0?"bu kordinatlar 2.bolgededir":"bu kordinatlar 3.bolgededir"));
    
    }
}
