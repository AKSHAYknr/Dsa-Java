package Strings;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        palindrome("AKSHAY");
    }
    public static void palindrome(String str){
        char[] arr = str.toCharArray();
        int l = 0, r = arr.length-1;
        while(l < r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            reversed.append(arr[i]);
        }
        String ss = reversed.toString();
        System.out.println(ss.equals(str));
    }
}
