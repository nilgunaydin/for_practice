package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
       Scanner scan=new Scanner(System.in);
       System.out.println("l�tfen ilk yarisini yazd�rmak istedi�iniz bir cift uzunlukta degisken giriniz...");
       String str=scan.nextLine();
       if (str.length()%2==0) {
		System.out.println(str.substring(0,str.length()/2));

	} else {System.out.println("girdi�iniz de�isken 2ye tam b�l�nmez");
	}
    	scan.close();
    	
    }
}
