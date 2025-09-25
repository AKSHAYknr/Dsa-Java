package Recursion;

public class Name {
    public static void main(String[] args) {
        printName();
    }
    static int count = 0;
    public static void printName(){
        if(count == 5){
            return;
        }
        System.out.println("Akshay");
        count++;
        printName();
    }
}
