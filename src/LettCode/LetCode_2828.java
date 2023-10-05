package LettCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetCode_2828 {
    public static void main(String[] args) {
/*        List<String> words = new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");

       String s = "abc";*/

     /*   List<String> words = Arrays.asList("an", "apple");
        String s = "a";*/

             List<String> words = Arrays.asList("a", "b", "c");
        String s = "a";


        System.out.println(isAcronym(words, s));
        ;
    }

    public static boolean isAcronym(List<String> words, String s) {

        char[] chars = s.toCharArray();

        if (chars.length < words.size() || chars.length > words.size()) {
            return false;
        }

        for (int i = 0; i < words.size(); i++) {

            String word = words.get(i);
            if (!word.startsWith(String.valueOf(chars[i]))) {

                return false;
            }
        }

        return true;

    }
}
