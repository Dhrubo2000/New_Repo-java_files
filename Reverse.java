import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        reverse_array(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }


        String input = "hello";
        System.out.println(reverse_string(input));
    }

    public static void reverse_array(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        
    }

    public static String reverse_string(String input){
        if(input == null){
            return null;
        }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            st.push(input.charAt(i));
        }

        String reversed = "";
        while (!st.isEmpty()) {
            reversed += st.pop();
        }

        return reversed;
    }
}
