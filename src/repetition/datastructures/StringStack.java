package repetition.datastructures;

public class StringStack {
    private long maxSize;
    private String[] stackArray;
    private int top;

    public StringStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }

    public void push(String str) {
        while(!isFull()) {
            top++;
            stackArray[top] = String.valueOf(str.charAt(top));
        }
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public String pop() {
        String item = "";
        while(!isEmpty()) {
            item += stackArray[top--];
        }
        return item;
    }
}