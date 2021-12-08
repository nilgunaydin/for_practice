package interviewPrep;

public class Q02 {

    public static void main(String[] args) {

       /* Check if the integer is an Armstrong numbers
       Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir

         153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
         370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

        */
        int sayi = 370;
        int rakamn;
        int toplam = 0;
        int number = sayi;
        for (; number > 0; number = number / 10) {
            rakamn = number % 10;
            toplam = toplam + rakamn * rakamn * rakamn;
        }

        if (toplam == sayi) {
            System.out.println("This is armstrong number");
        }
    }

}
