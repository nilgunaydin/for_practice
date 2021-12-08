package Oca_imSondu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {

		/*
		 * Count the words in a String one by one Girilen bir String'deki kelimeleri tek
		 * tek saydiran java code create ediniz.
		 * 
		 * For Example: Input : String is "Ali came to school and Ayse came to school"
		 * Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence ");
		String str = scan.nextLine();
		
		String arr[] = str.split(" ");
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			int sayac = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					sayac++;
				}
			}

			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		for (int k = 0; k < list.size() - 1; k++) {
			System.out.print(list.get(k) + ", ");
		}
		System.out.print(list.get(list.size() - 1));
		scan.close();
	}
}