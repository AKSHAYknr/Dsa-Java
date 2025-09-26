package Math;

public class CountDigits {
    public static void main(String[] args) {
        count(1234);
    }
    public static void count(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
