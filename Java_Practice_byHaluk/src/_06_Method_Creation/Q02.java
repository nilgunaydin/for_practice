package _06_Method_Creation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet */
     Scanner scan=new Scanner(System.in);
     System.out.println("name1 giriniz : ");
     String name1=scan.next();
     
     System.out.println("name2 giriniz : ");
     String name2=scan.next();
    ortasinaEkle(name1,name2);
    scan.close(); 
}

	private static void ortasinaEkle(String name1, String name2) {
		 
	     if (name1.length()%2==0) {
			String str1 =name1.substring(0,name1.length()/2);
	    	 String str2=name1.substring(name1.length()/2);
	    	 
	    	 System.out.println(str1+name2+str2);
		} else {System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik.");

		}
		
	}}
