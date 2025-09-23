public class Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        if(arr.length == 1){
            return arr[0];
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
