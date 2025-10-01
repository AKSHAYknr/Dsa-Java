package Recursion;

import java.util.Stack;

public class StackSort {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        sortStack(stack);
        System.out.println(stack);
    }

    private static void sortStack(Stack<Integer> stack) {
        if(stack.isEmpty()) return;

        int top = stack.pop();

        sortStack(stack);

        insertStack(stack, top);
    }

    private static void insertStack(Stack<Integer> stack, int element) {
        if(stack.isEmpty() || element > stack.peek()){
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertStack(stack, element);

        stack.push(top);
    }
}
