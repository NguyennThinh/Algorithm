package LettCode;

public class LetCode942 {

    public static void main(String[] args) {
        String  s ="IDID";
        for (int i : diStringMatch(s)){
            System.out.println(i);
        }
    }
    public static int[] diStringMatch(String s) {
        int low=0;
        int high=s.length();
        int[] ans=new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                ans[i]=low;
                low++;
            }
            else{
                ans[i]=high;
                high--;
            }
        }
        ans[s.length()]=high;
        return ans;
    }
}
