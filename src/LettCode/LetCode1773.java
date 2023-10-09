package LettCode;

import java.util.Arrays;
import java.util.List;

public class LetCode1773 {

    public static void main(String[] args) {
        List<String>  item = Arrays.asList("phone","blue","pixel");
        List<String> item2 = Arrays.asList("computer","silver","lenovo");
        List<String> item3 = Arrays.asList("phone","gold","iphone");

        List<List<String>> items = Arrays.asList(item, item2, item3);

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items,ruleKey, ruleValue ));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int res = 0;

        for(int i = 0 ;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
        }

        return res;
    }
}
