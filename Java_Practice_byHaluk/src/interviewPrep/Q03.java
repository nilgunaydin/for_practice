package interviewPrep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q03 {
    public static void main(String[] args) {


/*
      Count the words in a String one by one
	  Girilen bir String'deki kelimeleri tek tek saydiran java code create ediniz.

	  For Example:
	  Input :  String is "Ali came to school and Ayse came to school"
	  Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
*/

String str = "Ali came to school and Ayse came to school";
        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        Map<String,Integer> numOfWords = new HashMap<>();

        for(String w: words) {
            if(numOfWords.containsKey(w)) {
                numOfWords.put(w, numOfWords.get(w)+1);
            }else {
                numOfWords.put(w, 1);
            }
//		System.out.println(numOfWords);
        }
        System.out.println(numOfWords);

    }
}

