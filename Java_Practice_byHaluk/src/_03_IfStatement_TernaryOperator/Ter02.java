package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii değeri
    	 Scanner scan=new Scanner(System.in);
		 System.out.print("l�tfen bir karakter girin:");
		 char ch= scan.next().charAt(0);
		 
		 if (ch>=97 && ch<=122) {
			System.out.println("k���k harf");
		} else if(ch>=65 && ch<=90){
			System.out.println("b�y�k harf");
		} else {
			System.out.println("baba bu harf de�il...");
		}
		 
		 
		 
  scan.close();  }
}
