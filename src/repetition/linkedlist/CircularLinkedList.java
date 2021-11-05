package repetition.linkedlist;

public class CircularLinkedList {
    private CircularListNode first;
    private CircularListNode last;

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        CircularListNode n = new CircularListNode();
        n.setData(data);
        n.setNext(first);
        if(isEmpty())
            last = n;
        first = n;
    }

    public CircularListNode deleteFirst() {
        if(isEmpty())
            return null;

        CircularListNode temp = first;
        first = temp.getNext();
        return temp;
    }

    public void displayList() {
        System.out.println("List (first ---> last) ");
        CircularListNode current = first;
        while(current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void insertLast(int data) {
        CircularListNode n = new CircularListNode();
        n.setData(data);
        if(isEmpty()) {
            first = n;
            last = n;
        }
        else {
            last.setNext(n);
            last = n;
        }
    }
}