package LettCode;

public class LetCode1859 {
    public String sortSentence(String s) {
        int n=s.split(" ").length;
        String[]  arr=new String[n];
        String[] st=s.split(" ");
        for(String val:st){
            arr[val.charAt(val.length()-1)-'0'-1]=
                    val.substring(0,val.length()-1);
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n-1;i++) {
            str.append(arr[i]);
            str.append(" ");
        }
        str.append(arr[n-1]);
        return str.toString();
    }
}
