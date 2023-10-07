package LettCode;

import java.util.Arrays;

public class LetCode557 {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {

        char[] c = new char[s.length()];


        String[] ss = s.split(" ");
        int index = 0;
        for (String str : ss){

            for (int i =str.length()-1; i>=0; i--){
                c[index]  = str.charAt(i);
                index++;
            }

            if (index < c.length){
                c[index] = ' ';
                index++;
            }
        }

        return String.valueOf(c);
    }
}
