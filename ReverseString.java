import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String input = "dhrubo";
        String reverse = reversedString(input);
        System.out.println(input);
        System.out.println(reverse);
    }

    public static String reversedString(String input){
        if(input == null){
            return null;
        }

        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";

        while(!stack.isEmpty()){
            reversed += stack.pop();
        }

        return reversed;
    }
}
