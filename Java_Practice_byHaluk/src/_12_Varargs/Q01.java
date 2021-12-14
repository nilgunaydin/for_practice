package _12_Varargs;

public class Q01 {
	public static void main(String[] args) {
		//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : "m", "e", "r", "v", "e";
		// output : merve
concat("t","e","l","l","i"," ","t","u","r","n","a","m");

	}

	private static void concat(String... str) {
		String newStr="";
		for (String s:str) {
		newStr=	newStr.concat(s);
			
		}
	System.out.println(newStr);	
	}

}
