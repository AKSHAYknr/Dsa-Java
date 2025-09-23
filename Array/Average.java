public class Average {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(avg(arr));
    }
    public static int avg(int[] arr){
        if(arr.length == 0) return 0;
        if(arr.length == 1) return arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
