import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RangeSum {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSum(int[] arr){
        // int n = arr.length;
        // int[] prefixSum = new int[n+1];

        // prefixSum[0] = arr[0];
        // for (int i = 1; i <= prefixSum.length; i++) {
        //     prefixSum[i] = prefixSum[i-1] + arr[i];
        // }

        // return prefixSum;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(arr);

        int[] pref = prefixSum(arr);
        

        List<Integer> list = new ArrayList<>();
        int[][] q = {{2,3}, {4,6}, {1,5}, {3,6}};
        for (int i = 0; i <= q.length; i++) {
            int l = q[i][0];
            int r = q[i][1];
            if(r <= n){
                int sum = pref[r] - pref[l-1];
                list.add(sum);
            }else{
                System.out.println("range out of bound");
            }
        }
        System.out.println(list);
    }
}
