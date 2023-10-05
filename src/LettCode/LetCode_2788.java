package LettCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetCode_2788 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("$easy$","$problem$");
        char separator = '$';

        splitWordsBySeparator(words, separator).forEach(System.out::println);
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String s : words){

            String[] strings = s.split("\\Q"+ separator +"\\E");

            for (String str : strings){
                if (!str.isEmpty()){
                    result.add(str);
                }
            }

        }
        return result;
    }
/*    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String s : words){

            String[] strings = s.split("\\Q"+ separator +"\\E");

            for (String str : strings){
                if (!str.isEmpty()){
                    result.add(str);
                }
            }

        }
        return result;
    }*/



}
