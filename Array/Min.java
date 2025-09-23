public class Min {
    public static void main(String[] args) {
        int[] arr = {3,7,2,9,1};
        System.out.println(min(arr));
    }
    public static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
