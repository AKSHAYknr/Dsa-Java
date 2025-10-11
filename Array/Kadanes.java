package Array;

public class Kadanes {
    public static void main(String[] args) {
        int[] arr = {2, 8, -2, 5, -1, 9, -4};
        kadanes(arr);
    }

    private static void kadanes(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int num : arr){
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
