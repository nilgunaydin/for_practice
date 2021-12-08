package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*Kullanicidan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf oldugunu,
    degilse sessiz harf oldugunu ekrana yazdirsin. Girdigi deger harf degilse yada
    1 karakterden fazla ise hata mesaji gostersin. (Test girilen harfi buyuk yada
     kucuklugune duyarlidir.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen cikti:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen cikti:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen cikti:
    Yanlis karakter girdiniz!

     */
    @SuppressWarnings("unused")
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.print("lutfen bir harf giriniz:");
String str=scan.nextLine();
String sesliler="aeiuo";
String sessizler="qwrtypsdfghjklzxcvbnm";
if (str.length()==1) {for (int i = 0; i < sesliler.length() ; i++) {
	if (str.charAt(0)==sesliler.charAt(i)) {
		System.out.println("sesli harf");
		break;
	} else if(str.charAt(0)==sessizler.charAt(i)) {
		System.out.println("sessiz harf");
		break;
	}else {System.out.println("yanlis giris");
	break;}

	}
	
	
}else{System.out.println("yanlis giris");}
	
scan.close();} 
       
    }


