package Recursion;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = {3,8,1,4,7, 8};
        sort(nums, nums.length);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums, int length){
        if(length <= 0) return;

        sort(nums, length-1);

        insert(nums, length-1);
    }
    private static void insert(int[] nums, int index) {
        if(index == 0) return;

        if(nums[index] < nums[index - 1]){
            int temp = nums[index];
            nums[index] = nums[index - 1];
            nums[index - 1] = temp;
            insert(nums, index - 1);
        }
    }
}
