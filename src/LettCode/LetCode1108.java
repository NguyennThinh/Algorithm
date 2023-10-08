package LettCode;

public class LetCode1108 {

    public static void main(String[] args) {
        String s = "1.1.1.1";
        System.out.println(defangIPaddr(s));;
    }
    public static String defangIPaddr(String address) {

        StringBuilder builder = new StringBuilder();
        String[] s = address.split("\\.");

        int index = 0;
        for (String str : s){
            builder.append(str);
            if (index < s.length-1){

                builder.append("[.]");
                index++;
            }
        }

        return builder.toString();
    }

    public static String defangIPaddr2(String address) {

        StringBuilder builder = new StringBuilder();
        for (int i =0; i <address.length(); i++){
            if (address.charAt(i) =='.'){
                builder.append("[");
                builder.append(address.charAt(i));
                builder.append("]");

            }else {
                builder.append(address.charAt(i));

            }
        }

        return builder.toString();
    }
}
