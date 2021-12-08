package day_1;

public class Q_01 {
	
	public static void main (String[] args ) {

//12345 
//output 1
//		2
//		3
//		4
//		5
		
		int num = 12345;
		System.out.println((num/10000)%10);
		System.out.println((num/1000)%10);
		System.out.println((num/100)%10);
		System.out.println((num/10)%10);
		System.out.println(num%10);
	System.out.println(((num/10000)%10)+ "\n"+((num/1000)%10)+"\n"+((num/100)%10)+"\n"+((num/10)%10)+"\n"+(num%10));
	}

}
