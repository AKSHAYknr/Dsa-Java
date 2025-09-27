package Queue;

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(12);
        queue.add(13);
        queue.add(14);
        //System.out.println(queue.peek());
        queue.remove();
        //System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}
class Queue{
    int front = -1;
    int rear = -1;
    int[] queue = new int[10];
    int size = 0;

    void add(int num){
        if(front == -1 && rear == -1){
            front = front+1;
            rear = rear+1;
            queue[rear] = num;
            size++;
        }else{
            rear = rear+1;
            queue[rear] = num;
            size++;
        }
    }
    void remove(){
        if(front == -1){
            return;
        }
        front = front+1;
        size--;
    }
    int peek(){
        if(front == -1){
            return -1;
        }
        return queue[front];
    }
    int size(){
        if(rear == -1){
            return -1;
        }
        return size;
    }
}
