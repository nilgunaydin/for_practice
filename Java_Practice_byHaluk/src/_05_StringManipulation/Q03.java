package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullan�c�dan alaca��n�z, 3 kelimeden olu�an ismi
        // �rn. Ahmet Emin Y�lmaz -> A.E.Y.  format�yla yazd�r�n�z.
Scanner scan=new Scanner(System.in);
System.out.print("isim soyisim gir:");
   String str=scan.nextLine();
   System.out.println(str.toUpperCase().charAt(0)+"."+str.toUpperCase().charAt(str.indexOf(" ")+1)+"."+str.toUpperCase().charAt(str.lastIndexOf(" ")+1));
   scan.close(); }       
}
