package Array;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {2,1,4,7,3,2,5};
        int length = longestMountain(arr);
        System.out.println(length);   
    }

    public static int longestMountain(int[] arr) {
        int maxLength = Integer.MIN_VALUE;
        for (int j = 1; j < arr.length; j++) {
            int left = j - 1;
            int right = j + 1;
            while (left >= 0 && right < arr.length) {
                if (arr[left] < arr[left + 1] && arr[right] < arr[right - 1]) {
                    maxLength = Math.max(maxLength, right - left + 1);
                    left--;
                    right++;
                }
                else {
                    break;
                }
            }
        }
        return (maxLength == Integer.MIN_VALUE) ? 0 : maxLength;
    }
}
