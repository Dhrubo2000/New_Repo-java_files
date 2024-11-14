import java.util.Scanner;

public class PrefixSum {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSum(int[] arr) {
        //int n = arr.length;
        // int[] prefixSum = new int[n];

        // prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(arr);

        int[] newArr = prefixSum(arr);
        printArray(newArr);
    }
}