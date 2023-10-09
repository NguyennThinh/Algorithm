package LettCode;

public class LetCode1678 {
    public static void main(String[] args) {
        String s = "G()()()()(al)";
        System.out.println(interpret(s));
    }
    public static String interpret(String command) {
        StringBuilder builder = new StringBuilder();

        for (int i =0; i < command.length(); i++){

            char c = command.charAt(i);

            if ( c == '(' && command.charAt(i+1) == ')'){
                builder.append("o");
            }

            if ( c != ')' &&   c != '(' ){
                builder.append(c);
            }


        }
        return builder.toString();
    }
}
