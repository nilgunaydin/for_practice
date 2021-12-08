package _07_ForLoop;

public class Q16 {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
       sekli yazdiriniz
        */
    	   int i=6;
    	     for (int j = 1; j <= i ; j++) {
    			for (int k = 1; k <= j; k++) {
    				System.out.print((char)('A'+j-1)+" ");
    			}
    			System.out.println();
    		}
    	        
    	    }
    }


