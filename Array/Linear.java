public class Linear {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        System.out.println(search(arr, 6));;
    }
    public static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
