package Array;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
    }

    private static void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;

        for (int i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(nums, 0, n-1);
            System.out.println(Arrays.toString(nums));
        }

        for (int i = n-1; i > idx; i--) {
            if(nums[i] > nums[idx]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
        }

        reverse(nums, idx + 1, n-1);
        System.out.println(Arrays.toString(nums));
    }

    private static int[] reverse(int[] nums, int i, int j) {
        while(i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
}
