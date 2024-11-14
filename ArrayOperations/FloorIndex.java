public class FloorIndex {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 8, 9};
        int target = 10;

        System.out.println(ceilIndex(arr, target));

    }

    public static int ceilIndex(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        int res = -1;

        while (s <= e) {
            
            int mid = s + (e - s)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(target > arr[mid]){
                res = mid;
                s = mid+1;
            }else{
                // res = mid;
                e = mid-1;
            }
        }
        return arr[res];
    }
}

