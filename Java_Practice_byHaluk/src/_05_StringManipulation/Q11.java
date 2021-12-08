package _05_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
    	String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
char a=pickName.charAt(pickName.indexOf("A"));
char b=pickName.charAt(pickName.indexOf("L"));
char c=pickName.charAt(pickName.indexOf("I"));

System.out.println("ALI: "+a+b+c);
       
    }

}
