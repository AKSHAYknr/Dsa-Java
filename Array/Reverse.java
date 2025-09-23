import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static int[] reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
