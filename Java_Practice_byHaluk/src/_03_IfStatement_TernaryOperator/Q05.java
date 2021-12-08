package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen yasinizi daha sonra da kilonuzu giriniz");
		int yas= scan.nextInt();
		int kilo=scan.nextInt();
		if (yas>=18) {if (kilo>=50) {
			System.out.println("kan bagisinda bulunabilirsiniz");		
			} else {System.out.println("kan bagisi yapmak icin cok zayifsin");
		}}else {System.out.println("yasiniz 18 den kucuk old icin kan bag yapamazsiniz");}

scan.close();	}

}
