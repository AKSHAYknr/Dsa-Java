package Stack;

import java.util.Stack;

public class Basic {
    public static void main(String[] args) {
        // LIFO insertion order (Last in first out)
        Stack<Integer> stack = new Stack<>();
        stack.push(35);
        stack.push(67);
        stack.push(12);
        stack.pop(); // removes elements from top of stack (Last added element)
        System.out.println(stack.peek()); // returns elemets of top
        System.out.println(stack.toString());
    }
}
