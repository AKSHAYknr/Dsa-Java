package Recursion;

public class Infinite {
    public static void main(String[] args) {
        printOne();
    }

    //There is no stop condition for the function, so it will go infinite times and give exception (Stack Over Flow)

    public static void printOne(){
        System.out.println(1);
        printOne(); //Recursive function call
    }
}
