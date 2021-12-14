package _12_Varargs;

public class Q02 {
	public static void main(String[] args) {
		         // verilen int lerden ilki haric tum sayilari toplayan ve
				// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.
toplam(3,4,3,21,5,6,7,8,9,5,4);
	}

	private static void toplam(int carpilacak,int...toplanacak) {
	int toplam=0;
		for (int i : toplanacak) {
		toplam+=i;}	
		System.out.println(carpilacak*toplam);
	}

}
