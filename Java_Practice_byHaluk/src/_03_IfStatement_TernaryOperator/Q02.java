package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tane pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz degilse
	     ikiz kenar olma ihtimalini de kontrol ediniz
	     
	     ucgen olma sarti :herhangi iki kenar toplami diger kenardan buyuk, 
	     herhangi iki kenar farki diger kenardan buyuk olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
	
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen 3 sayi giriniz");
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
		if (a==b && b==c) {System.out.println("girdiginiz kenarlar bir eskenar ucgendir.");
			
		} else if((a+b>c && c>a-b)&&(a+c>b && b>a-c)&&(b+c>a && a>b-c)) {if(a==b || b==c || c==a){
			System.out.println("girdiginiz kenarlar bir ikizkenar ucgendir");
			
		}else {System.out.println("girdiginiz kenarlar bir ucgendir");}		

	}else {System.out.println("girdiginiz kenarlar bir ucgen degildir");}

scan.close();}}
