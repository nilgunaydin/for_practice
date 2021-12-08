package Oca_imSondu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05 {

	public static void main(String[] args) {

/*
      Count the words in a String one by one
	  Girilen bir String'deki kelimeleri tek tek saydiran java code create ediniz.
	  
	  For Example:
	  Input :  String is "Ali came to school and Ayse came to school"
	  Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
 */
		
	String str="Ali came to school and Ayse came to school";
	String kelimeler[]=str.split(" ");
	System.out.println(Arrays.toString(kelimeler));
	List<String> kova=new ArrayList<>();
	int sayac=0;
	for (int i = 0; i < kelimeler.length; i++) {
	if (kova.contains(kelimeler[i])) {
			
		} else {

		}	
	}
		
	}
		
	}


