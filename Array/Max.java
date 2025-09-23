public class Max {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 1};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
