package Array;

import java.util.Arrays;

public class Arrange {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, 5, -1, -7};
        arrangeOddEven(nums);
    }

    private static void arrangeOddEven(int[] nums) {
        int[] ans = new int[nums.length];
        int positive = 0;
        int negetive = 1;

        for (int num : nums) {
            if(num > 0){
                ans[positive] = num;
                positive += 2;
            }else{
                ans[negetive] = num;
                negetive += 2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
