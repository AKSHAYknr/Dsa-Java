package Recursion;

public class Sum {
    public static void main(String[] args) {
        sum(3, 0);
    }
    public static void sum(int i , int sum){
        if(i < 0){
            System.out.println(sum);
            return;
        }
        sum(i-1, sum+i);
    }
}
