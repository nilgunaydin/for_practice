package _07_ForLoop;

import java.util.Scanner;

public class Q06 {

    /*  Problem Tanimi
       2 boyutlu bir tablo olarak, ekrana carpim tablosunu hesaplayip yazan kodu yaziniz.

      ornek Ekran ciktisi
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran ciktisi 5 x 5 boyutlari icin ornek olarak verilmistir,
       isterseniz boyutlari klavyeden okuyup istenen boyutlara gore
       ekrana basan bir kod yazabilirsiniz.
    */
    public static void main(String[] args) {
   Scanner scan= new Scanner(System.in);
   System.out.print("lutfen boyut giriniz:");
   int boyut= scan.nextInt();
   
   for (int i = 1; i <= boyut; i++) {
	for (int j = 1; j <= boyut; j++) {
		System.out.print(i*j+" ");
	}
System.out.println("");}
   scan.close(); }
}
