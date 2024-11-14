import java.util.Stack;

public class ReverseSentence {
    
    public static void main(String[] args) {
        
        String str = "i am a good boy";

        System.out.println(helper(str));
    }

    public static String helper(String str){

        String[] word = str.split(" ");

        Stack<String> s = new Stack<>();

        for(String words : word){
            s.push(words);
        }

        StringBuilder reverse = new StringBuilder();

        while(!s.isEmpty()){
            reverse.append(s.pop());
            if (!s.isEmpty()) {
                reverse.append(" ");
            }
        }

        return reverse.toString();
    }
}
