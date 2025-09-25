package Recursion;

public class Base {
    public static void main(String[] args) {
        baseRecursion();
    }
    static int count = 0;
    public static void baseRecursion() {
        if(count == 3){
            return;
        }
        System.out.println(count);
        count++;
        baseRecursion();
    }
}
