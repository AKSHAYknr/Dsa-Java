package Recursion;

public class Fact {
    public static void main(String[] args) {
        System.out.println(fact(3));
    }
    public static int fact(int n){
        if(n == 0) return 1;
        return n * fact(n-1);
    }
}
