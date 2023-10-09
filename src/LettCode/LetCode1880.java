package LettCode;

public class LetCode1880 {

    public static void main(String[] args) {
        System.out.println(isSumEqual("acb", "cba", "cdb"));
    }
    public  static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int sum1 = 0;
        int sum2 = 0;
        int target =0;
        for(char c : firstWord.toCharArray()){
            sum1 = sum1 * 10 + (c - 'a');
        }
        for(char c : secondWord.toCharArray()){
            sum2 = sum2 * 10 + (c - 'a');
        }
        for(char c : targetWord.toCharArray()){
            target = target * 10 + (c - 'a');
        }

        return sum1+ sum2 == target;
    }
}
