package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullan�c�dan alaca��n bir stringde bo�luk karakterinin olup olmad���n� kontrol ediniz.
        Scanner scan= new Scanner(System.in);
        System.out.print("string gir babo:");
        String str= scan.nextLine();
        System.out.println("girilen stringte bo�luk var m�? : "+str.contains(" "));
        

        //Kullan�c�dan alaca��n bir stringde bo� olup olmad���n� kontrol ediniz.
       System.out.println("girilen string bo� mu? : "+str.isEmpty());
 scan.close();   }
}

