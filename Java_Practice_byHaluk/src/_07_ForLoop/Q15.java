package _07_ForLoop;

public class Q15 {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        seklini yazdiriniz.  65=A'nin ascii degeri
        */
    public static void main(String[] args) {
     int i=6;
     for (int j = 1; j <= i ; j++) {
		for (int k = 1; k <= j; k++) {
			System.out.print((char)('A'+k-1)+" ");
		}
		System.out.println();
	}
        
    }
}
