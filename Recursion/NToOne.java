package Recursion;

public class NToOne {
    public static void main(String[] args) {
        print(10);
    }
    public static void print(int n){
        if(n < 1){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
