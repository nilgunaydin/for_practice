package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanýcýdan alacaðýnýz, 3 kelimeden oluþan ismi
        // örn. Ahmet Emin Yýlmaz -> A.E.Y.  formatýyla yazdýrýnýz.
Scanner scan=new Scanner(System.in);
System.out.print("isim soyisim gir:");
   String str=scan.nextLine();
   System.out.println(str.toUpperCase().charAt(0)+"."+str.toUpperCase().charAt(str.indexOf(" ")+1)+"."+str.toUpperCase().charAt(str.lastIndexOf(" ")+1));
   scan.close(); }       
}
