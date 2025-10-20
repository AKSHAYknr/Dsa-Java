package Binary_Search;

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 4;
        isPerfectSquare(num);
    }

    private static void isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(mid * mid == num){
                System.out.println(true);
                break;
            }else if(mid * mid > num){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
    }
}
