public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while(s < e){
            int mid = s + (e - s)/2;

            if(nums[mid] > nums[mid+1]){
                e = mid;
            }else if(nums[mid] < nums[mid+1]){
                s = mid + 1;
            }
        }

        return e;
    }
}
