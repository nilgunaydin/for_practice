package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
    	Scanner scan= new Scanner(System.in);
    	System.out.print("l�tfen �� harfli bir isim giriniz:");
    	String isim= scan.next();
    	
    	if(isim.length()==3) {if(isim.charAt(0)!=isim.charAt(1)&& isim.charAt(0)!=isim.charAt(2)&&isim.charAt(2)!=isim.charAt(1)) {
    	System.out.println("girdi�iniz isim unique'dir.");	
    		
    		
    	}else {System.out.println("girdi�iniz isim unique falan de�il.");}
    	
    	}else {System.out.println("l�tfen 3 harfli de�il");}     
    }
}