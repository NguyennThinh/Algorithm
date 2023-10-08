package LettCode;

public class LetCode1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] a ={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, a));;


    }
    public static String restoreString(String s, int[] indices) {
        char[] c = s.toCharArray();
        for (int i =0; i < indices.length-1; i++){

            for (int j =0; j < indices.length-i-1; j++){
                if (indices[j]> indices[j+ 1]){

                    int temp = indices[j];
                    indices[j] = indices[j+ 1];
                    indices[j+ 1] = temp;


                    char temp1 = c[j];
                   c[j] = c[j+1];
                   c[j+1] = temp1;
                }
            }
        }
  return String.valueOf(c);
    }
}
