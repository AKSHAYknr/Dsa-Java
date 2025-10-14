package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {
        int[] nums = {12, 10, 22, 16, 0, 5, 6};
        leadersInArray(nums);
    }

    private static void leadersInArray(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int max = nums[nums.length - 1];
        ans.add(max);
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] > max){
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        System.out.println(ans);
    }
}
