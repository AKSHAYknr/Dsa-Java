package Array;

import java.util.Arrays;

public class SortDutch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 0, 0, 2, 1, 0 , 1, 1, 0};
        sort(arr);
    }

    private static void sort(int[] arr) {
        int left = 0; int mid = 0; int right = arr.length-1;
        while(mid < right){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
                mid++;
                left++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
