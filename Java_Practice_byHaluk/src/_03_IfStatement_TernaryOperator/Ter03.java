package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
     
        //  �ift olup olmadigini kontrol edin. �ift ise "3 basamakl� olmayan �ift say�" yazd�r�n.
        // �ift say� degilse "3 basamakl� olmayan tek say�" yazd�r�n.
    	Scanner scan= new Scanner(System.in);
		System.out.println("lutfen pozitif bir tamsayi giriniz");
      int sayi=scan.nextInt();
      System.out.println(sayi>99 && sayi<1000 ? "�� Basamakl� say�":sayi%2==0 ? "3 basamakl� olmayan �ift say�":"3 basamakl� olmayan tek say�");
   scan.close();
   }
}