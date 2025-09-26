package Math;

public class Palindrome {
    public static void main(String[] args) {
        palindrome(1221);
    }
    public static void palindrome(int num){
        int number = num;
        int reverse = 0;
        while(number > 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        System.out.println(num == reverse);
    }
}
