package repetition.linkedlist;

public class DoublyLinkedNode {
    private int data;
    private DoublyLinkedNode next;
    private DoublyLinkedNode previous;

    public DoublyLinkedNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public DoublyLinkedNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedNode next) {
        this.next = next;
    }

    public DoublyLinkedNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLinkedNode previous) {
        this.previous = previous;
    }

    public void displayNode() {
        System.out.println("{ " + data + " }");
    }
}