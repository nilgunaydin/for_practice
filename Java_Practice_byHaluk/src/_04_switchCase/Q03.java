package _04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numaras�na g�re , ay�n ka� g�n oldu�unu say� ile yazd�r�n�z.
Scanner scan= new Scanner(System.in);
System.out.println("l�tfen istedi�iniz ay�n numaras�n� giriniz.");
      int numberOfMo=scan.nextInt();

switch (numberOfMo) {

case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
	System.out.println("girdi�iniz ay 31 g�n �ekiyor");
break;
case 2:
	System.out.println("y�l� giriniz");
	int yil=scan.nextInt();
	if(yil%4==0) {System.out.println("girdi�iniz ay 29 g�n �ekiyor");}else {
	System.out.println("girdi�iniz ay 28 g�n �ekiyor");}
break;
case 4:
case 6:
case 9:
case 11:
	System.out.println("girdi�iniz ay 30 g�n �ekiyor");;
default:
System.out.println("l�tfen ge�erli bir say� giriniz...");
}
  scan.close();  }
}

