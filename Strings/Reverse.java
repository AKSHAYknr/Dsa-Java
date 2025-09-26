package Strings;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        reverse("Akshay");
    }
    public static void reverse(String str){
        char[] arr = str.toCharArray();
        int l = 0, r = arr.length-1;
        while(l < r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
