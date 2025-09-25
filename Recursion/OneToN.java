package Recursion;

public class OneToN {
    public static void main(String[] args) {
        print(20);
    }
    static int num = 1;
    public static void print(int n){
        if(num > n){
            return;
        }
        System.out.println(num);
        num++;
        print(n);
    }
}
