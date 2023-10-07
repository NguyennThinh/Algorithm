package LettCode;

import java.util.HashSet;
import java.util.Set;

public class LetCode344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);

        for (char c: s){
            System.out.println(c);
        }
    }

    public static void reverseString(char[] s) {

        int left = 0;
        int right = s.length-1;

        for (int i = right; left <= i ; i--){

            char temp = s[i];

             s[i] = s[left];
             s[left] = temp;

             left++;
        }
    }




}
