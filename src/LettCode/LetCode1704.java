package LettCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LetCode1704 {

    public static void main(String[] args) {
        String s = "Uu";

        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {

        int mid = s.length() / 2;

        Set<Character> c = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'));

        int one =0;
        int two =0;

        for (int i = 0; i < mid; i++) {
            if (c.contains(s.charAt(i))) {
                one++;
            }
        }
        for (int i = mid; i < s.length(); i++) {
            if (c.contains(s.charAt(i))) {
                two++;
            }
        }

        return one == two;
    }
}
