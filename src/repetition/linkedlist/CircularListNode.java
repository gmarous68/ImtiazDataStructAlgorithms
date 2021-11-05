package repetition.linkedlist;

public class CircularListNode {
    private int data;
    private CircularListNode next = null;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CircularListNode getNext() {
        return next;
    }

    public void setNext(CircularListNode next) {
        this.next = next;
    }
}