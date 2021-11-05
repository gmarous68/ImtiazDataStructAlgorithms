package repetition.datastructures;

public class Queue {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new long[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public long peakFront() {
        return queueArray[front];
    }

    public void view() {
        if(!isEmpty()) {
            System.out.print("[ ");
            for (int i = front; i < queueArray.length; i++)
                System.out.print(queueArray[i] + " ");
            System.out.println("]");
        }
    }

    public void insert(long data) {
        if(rear == maxSize - 1)
            rear = -1;

        queueArray[++rear] = data;
        nItems++;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public long remove() {
        long item = queueArray[front++];
        nItems--;

        if(front == maxSize)
            front = 0;
        return item;
    }
}