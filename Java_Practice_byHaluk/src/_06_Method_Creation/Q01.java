package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* StringMethods
           String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */  
    Scanner scan=new Scanner(System.in);
    
    System.out.print("bir string giriniz : ");
    
    
    String str=scan.nextLine();
    
   System.out.println(ilkIkisiz(str)); ;
    scan.close();
    
}
public static String ilkIkisiz(String str) {
  String kalanHarfler="";
  if (str.startsWith("gh")) {
      kalanHarfler=str;
      
  }else if (str.startsWith("g")) {
      kalanHarfler=str.charAt(0)+str.substring(2);
      
      
  } else if (str.charAt(1)=='h') {
      kalanHarfler=str.substring(1);
      
  }else {
      kalanHarfler=str.substring(2);
  }
  return kalanHarfler;
    }
}
