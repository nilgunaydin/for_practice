package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
   
	public static void main(String[] args) {
        // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String'in palindrome olup olmadigini kontrol eden bir program yazin.

    	Scanner scan= new Scanner(System.in);
    	   System.out.print("lutfen string giriniz:");
    	   String str= scan.nextLine();
    	  StringBuilder sb = new StringBuilder(str) ;
    	  sb.reverse();
    	  String sbstr= sb.toString();
    	  if (str.equals(sbstr)) {
			System.out.println("palindromedur");
		} else {System.out.println("degil");

		}
   scan.close(); }

}

