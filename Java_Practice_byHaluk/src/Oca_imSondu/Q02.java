package Oca_imSondu;

public class Q02 {

	public static void main(String[] args) {
		/* 
	      Check if the integer is an Armstrong numbers
	       Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
	​
	         153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
	         370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
	*/
		int sayi=370;
		armstrong(sayi);
		
	}

	private static void armstrong(int sayi) {
		int rakam=0;
		int toplam=0;//27+125+1
		int num=sayi;
		for (;num> 0; num=num/10) {
		rakam=num%10;
		toplam+=rakam*rakam*rakam;
		}
		if (toplam==sayi) {
			System.out.println("girdiginiz sayi armstrong sayidir.");
			
		} else {System.out.println("girdiginiz sayi armstrong sayi degildir.");

		}
	}

}
