package repetition.datastructures;

public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long item) {
        if(isFull())
            System.out.println("Stack is full!");
        else
            stackArray[++top] = item;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public long peak() {
        if(!isEmpty())
            return this.stackArray[top];
        else
            return 0;
    }

    public boolean isFull() {
        return top == maxSize-1;
    }

    public long pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty..");
            return -1;
        }

        long item = stackArray[top--];
        return item;
    }
}