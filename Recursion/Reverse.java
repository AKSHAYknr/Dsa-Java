package Recursion;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(0, arr.length-1, arr)));
    }
    public static int[] reverse(int l, int r, int[] arr){
        if(l > r) return arr;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return reverse(l+1, r-1, arr);
    }
}
