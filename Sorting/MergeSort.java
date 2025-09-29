package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,8,1,7,9,6};
        mergerSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergerSort(int[] arr, int start, int end) {
        if(start >= end) return;
        int mid = start + (end - start)/2;
        mergerSort(arr, start, mid);
        mergerSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid+1;
        int x = 0;

        while(i <= mid && j <= end){ // sort 
            if(arr[i] <= arr[j]){
                temp[x++] = arr[i++];
            }else{
                temp[x++] = arr[j++];
            }
        }

        while(i <= mid){ // add remaining elemets in left part
            temp[x++] = arr[i++];
        }

        while(j <= end){ // add remaining elemets in right part
            temp[x++] = arr[j++];
        }

        for(int k = 0, l = start; k < temp.length; k++, l++){
            arr[l] = temp[k];
        }
    }
}
