package _04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasýna göre , ayýn kaç gün olduðunu sayý ile yazdýrýnýz.
Scanner scan= new Scanner(System.in);
System.out.println("lütfen istediðiniz ayýn numarasýný giriniz.");
      int numberOfMo=scan.nextInt();

switch (numberOfMo) {

case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
	System.out.println("girdiðiniz ay 31 gün çekiyor");
break;
case 2:
	System.out.println("yýlý giriniz");
	int yil=scan.nextInt();
	if(yil%4==0) {System.out.println("girdiðiniz ay 29 gün çekiyor");}else {
	System.out.println("girdiðiniz ay 28 gün çekiyor");}
break;
case 4:
case 6:
case 9:
case 11:
	System.out.println("girdiðiniz ay 30 gün çekiyor");;
default:
System.out.println("lütfen geçerli bir sayý giriniz...");
}
  scan.close();  }
}

