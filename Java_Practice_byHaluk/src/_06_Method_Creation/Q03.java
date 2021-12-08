package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {


// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
    	Scanner scan = new Scanner(System.in);
        System.out.print("cevirilecek birimi giriniz : ");
        String birim = scan.next();
        System.out.print("cevirilecek birimin degerini giriniz : ");
        double miktar = scan.nextDouble();
        cevirCan(birim, miktar);
    }
    private static void cevirCan(String brm, double mktr) {
        switch (brm) {
        case "saat":
            System.out.println("girilen saatin saniye degeri :" + mktr * 60 * 60+" saniye");
            break;
        case "mil":
            System.out.println("girilen milin kilometre degeri :" + mktr * 1.6+" km");
            break;
        case "kg":
            System.out.println("girilen kg'nin gram degeri :" + mktr * 1000+" gram");
            break;
        default:
            System.out.println("bu satte kafalar 1500 anca bu deger girilir");
      
    }
}}

