package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanýcýdan alacaðýn bir stringde boþluk karakterinin olup olmadýðýný kontrol ediniz.
        Scanner scan= new Scanner(System.in);
        System.out.print("string gir babo:");
        String str= scan.nextLine();
        System.out.println("girilen stringte boþluk var mý? : "+str.contains(" "));
        

        //Kullanýcýdan alacaðýn bir stringde boþ olup olmadýðýný kontrol ediniz.
       System.out.println("girilen string boþ mu? : "+str.isEmpty());
 scan.close();   }
}

