package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Basic {
    public static void main(String[] args) {
        //FIFO (first in first out) insertion at tail and removal at head
        Queue<Integer> queue = new LinkedList<>(); // implementation using linkedlist
        queue.add(40);
        queue.add(67);
        queue.add(37);
        queue.remove(); // remove the first added element
        queue.peek(); // returns head of queue
        System.out.println(queue);

        //DeQueue - can insert and remove from both end of queue
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(23); // add at head
        deque.addFirst(45); // add at head
        deque.addLast(28); // add at tail
        deque.remove(); // remove head
        deque.removeFirst(); // remove head
        deque.removeLast(); // remove last element added;
    }
}
