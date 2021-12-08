package Oca_imSondu;

public class Q01 {

	public static void main(String[] args) {
		/*
		Girilen bir String'i tersten yazdiran bir pr create ediniz
		 */
	String str= "bu ulkeden kurtulcaz ins";
	String strters="";
	
	
	for (int i =0; i <str.length() ; i++) {
		strters+=str.charAt(str.length()-1-i);
	}
	System.out.println(strters);
	}

}
