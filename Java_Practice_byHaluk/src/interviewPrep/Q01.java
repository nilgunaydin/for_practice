package interviewPrep;

public class Q01 {
    public static void main(String[] args) {
        /*
        Girilen bir String'i tersten yazdiran bir pr create ediniz
         */
        String str = "Basari GAYRETE asiktir";

        String reString = "";

        for (int i = 0; i < str.length(); i++) {
            reString += str.charAt(str.length() - i - 1);
        }

        System.out.println(reString);

        // Reverse String with string builder

        StringBuilder stringBuilder = new StringBuilder("Basari GAYRETE asiktir");
        System.out.println(stringBuilder.reverse());
    }
}
