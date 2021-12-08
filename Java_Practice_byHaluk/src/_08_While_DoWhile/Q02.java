package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        // indexi tek sayi olan karakterleri yazdiran bir code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String  str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
			if (i%2==1) {System.out.print(str.charAt(i)+" ");
				
			} 
		}
 
  scan.close();  }

}
