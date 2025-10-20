package Binary_Search;

public class Peak {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7, 1, 2};
        findPeakIndex(nums);
    }

    private static void findPeakIndex(int[] nums) {
        int left = 1;
        int right = nums.length-2;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(nums[mid] > nums[mid -1] && nums[mid] > nums[mid + 1]){
                System.out.println(nums[mid]);
                break;
            }else if(nums[mid + 1] > nums[mid]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
    }
}
