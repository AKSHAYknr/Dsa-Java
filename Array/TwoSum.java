import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    private static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] + arr[right] == target){
                return new int[]{left, right};
            }else if(arr[left] + arr[right] < target){
                left++;
            }else{
                right++;
            }
        }
        return new int[]{};
    }
}
