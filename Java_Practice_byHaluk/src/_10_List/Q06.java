package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        /*
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        List<Integer> tekrarsiz = new ArrayList<>();


        for (Integer s : arr) {
            if (!tekrarsiz.contains(s)) {
                tekrarsiz.add(s);
            }
        }
        Collections.sort(tekrarsiz);
        int arrTekrarsiz[] = new int[tekrarsiz.size()];//listein elemnı kadar arr olusturuldu

        for (int i = 0; i < arrTekrarsiz.length; i++) {//bu dongude istein elemnarı array eklendi
            arrTekrarsiz[i] = tekrarsiz.get(i);//iindex deki her bir list  elemani arrye atandi

        }
        System.out.println(Arrays.toString(arrTekrarsiz));
    }

}
