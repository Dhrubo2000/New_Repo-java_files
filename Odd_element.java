public class Odd_element {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 6, 5, 7};

        System.out.println(helper(arr));

    }

    public static int helper(int[] arr){

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1){
                count++;
            }
            if (count == 3) {
                
                break;
                
            }
        }

        return count;
    }
}
