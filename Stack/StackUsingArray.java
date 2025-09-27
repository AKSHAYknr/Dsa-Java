package Stack;

import java.util.Arrays;

public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(25);
        stack.push(34);
        stack.push(47);
        System.out.println(stack.peek());
    }
}
class Stack{
    int top = -1;
    int[] stack = new int[10];

    void push(int num){
        top = top+1;
        stack[top] = num;
    }
    void pop(){
        if(top == -1){
            return;
        }
        top = top-1;
    }

    int peek(){
        if(top == -1){
            return -1;
        }
        return stack[top];
    }

    int size(){
        return top;
    }
}

