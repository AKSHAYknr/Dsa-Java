package Math;

public class Reverse {
    public static void main(String[] args) {
        reverseDigits(10400);
    }
    public static void reverseDigits(int num){
        int reverse = 0;
        while(num > 0){
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }
        System.out.println(reverse);
    }
}
