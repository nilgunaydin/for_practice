package _07_ForLoop;

public class Q02 {
    public static void main(String[] args) {


// 0-255 e kadar olan harflerin , say� ve harf de�erini konsola yazd�r�n�z.

        for (int i = 0; i <= 255; i++) {
			char harf=(char) i;
			System.out.println(i+"= "+harf);
		}

    }
}


