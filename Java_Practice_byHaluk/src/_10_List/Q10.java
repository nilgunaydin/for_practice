package _10_List;

import java.util.ArrayList;
import java.util.List;

public class Q10 {
    /*
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     */
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7,};
        //3, 5+1, 2+7+9, 2+3+5+7

        System.out.println(buNasilMethod(arr));
    }

    public static ArrayList<Integer> buNasilMethod(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int kullanilan = 1;
        while (arr.length - kullanilan >= count) {
            int toplam = 0;
            for (int i = 0; i <= count; i++) {
                toplam += arr[kullanilan - 1 + i];
            }
            count++;
            kullanilan += count;
            list.add(toplam);
        }
        return list;

    }

}

