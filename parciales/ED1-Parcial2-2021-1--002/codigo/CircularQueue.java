public class CircularQueue {
    int[] queue; 
    int front;
    int rear; 
    int currentSize;
    int size;

    public CircularQueue(int size) { 
        this.queue = new int[size];
        this.front = 0;
        this.rear = 0;
        this.size = size;
        this.currentSize = 0;
    }
    public boolean add(int x) {
        if (currentSize == size) 
            throw new IllegalStateException("The queue is full: front size: " + rear); 
        queue[rear++] = x;
        rear = (rear + 1) % size;
        currentSize++;
        return true;
    }
    public int peek() {
        if (front == rear) 
            throw new IllegalStateException("The queue is empty");
        return queue[front];
    }
    public int poll() {
        if (front > rear) 
            throw new IllegalStateException("The queue is empty");
        currentSize--;
        return queue[front++];
    }
    public static void main(String[] args){
      CircularQueue c = new CircularQueue(10);
    }   
}
