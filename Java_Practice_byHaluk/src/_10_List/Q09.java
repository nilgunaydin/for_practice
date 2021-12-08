package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String str = scan.nextLine();//hayat cooook bayat
        String arr[] = str.split("");//str yi "" hiclige gore parcalayip her bir parcayi arr yin bir elemani yapti

        String enCokTekrarEden = "";
        int maxsayac = 0;
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {//karsilastirilan karakter kontrolu--> h
            for (int j = i + 1; j < arr.length; j++) {//karsilastiran karakter kontrolu--> a, y , a.....
                if (arr[i].equalsIgnoreCase(arr[j])) {//esit karakterlerin kontrolu ve asit olan karakterlerin saydirildi
                    sayac++;
                }
            }
            if (sayac > maxsayac) {
                maxsayac = sayac;
                enCokTekrarEden = arr[i];
            } else if (sayac == maxsayac) {

                enCokTekrarEden += ", " + arr[i];
            }

            sayac = 0;
        }
        System.out.println(enCokTekrarEden);
    }
}

