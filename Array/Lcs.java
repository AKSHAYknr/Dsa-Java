import java.util.Arrays;

public class Lcs {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 2 };
        lcs(nums);
    }

    private static void lcs(int[] nums) {
        Arrays.sort(nums);
        int longest = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                count++;
                longest = Math.max(count, longest);
            } else if(nums[i] != nums[i - 1] + 1 && nums[i] != nums[i - 1]){
                count = 1;
            }
        }
        System.out.println(longest);
    }
}
