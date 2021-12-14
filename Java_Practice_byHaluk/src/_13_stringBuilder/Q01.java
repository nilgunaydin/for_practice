package _13_stringBuilder;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cumleyi parametre olarak kabul eden, StringBuilder 
		kullanarak cumleyi ters ceviren ve cumlenin palindrom
	        olup olmadigini kontrol eden (buyuk/kucuk harf duyarliligi olmadan) bir Java programi yazin.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Lutfen metin giriniz: ");
    	String str=scan.nextLine();
    	StringBuilder sb=new StringBuilder(str);
    	String tersMetin= sb.reverse().toString();
    	if(tersMetin.equalsIgnoreCase(str)) {
    		System.out.println("It is a palindrome");
    	}else {System.out.println("It is not a palindrome");}
    }

}
