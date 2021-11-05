package repetition.linkedlist;

public class DoublyLinkedList {
    private DoublyLinkedNode first;
    private DoublyLinkedNode last;

    public boolean isEmpty() {
        return (first == null);
    }

    public void displayList() {
        System.out.println("List (first ---> last) ");
        DoublyLinkedNode current = first;
        while(current != null) {
            current.displayNode();
            current = current.getNext();
        }
        System.out.println();
    }

    public void insertFirst(int data) {
        DoublyLinkedNode n = new DoublyLinkedNode(data);
        if(isEmpty()) {
            first = n;
            last = n;
        }
        else {
            first.setPrevious(n);
            n.setNext(first);
            first = n;
        }
    }

    public void insertLast(int data) {
        DoublyLinkedNode n = new DoublyLinkedNode(data);
        if(isEmpty()) {
            last = n;
            first = n;
        }
        else {
            last.setNext(n);
            n.setPrevious(last);
            last = n;
        }
    }

    public DoublyLinkedNode deleteFirst() {
        if(isEmpty())
            return null;

        if(first.getNext() == null) {
            first = null;
            last = null;
            return null;
        }
        first = first.getNext();
        first.setPrevious(null);
        return first;
    }

    public DoublyLinkedNode deleteLast() {
        if(isEmpty())
            return null;

           if(first.getNext() == null) {
            first = null;
            last = null;
            return null;
        }
        last = last.getPrevious();
        last.getNext().setPrevious(null);
        last.setNext(null);
        return last;
    }

    public boolean insertAfter(int key, int data) {
        if(isEmpty())
            return false;

        DoublyLinkedNode current = first;
        while(current != null) {
            if(current.getData() == key) {
                DoublyLinkedNode n = new DoublyLinkedNode(data);
                if(current.getNext() != null) {
                    current.getNext().setPrevious(n);
                    n.setNext(current.getNext());
                }
                current.setNext(n);
                n.setPrevious(current);
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public DoublyLinkedNode deleteKey(int key) {
        if (isEmpty())
            return null;

        DoublyLinkedNode current = first;

        if(current != null && current.getNext() == null && current.getData() == key) {
            first = null;
            last = null;
            return null;
        }

        while (current != null) {
            if (current.getData() == key) {
                if(current.getNext() != null && current.getPrevious() != null) {
                    current.getNext().setPrevious(current.getPrevious());
                    current.getPrevious().setNext(current.getNext());
                }
                else if(current.getNext() != null) {
                    first = current.getNext();
                    first.setPrevious(null);
                    current.setNext(null);
                    return first;
                }
                else if(current.getNext() == null) {
                    last = current.getPrevious();
                    last.setNext(null);
                    return last;
                }
            }
            current = current.getNext();
        }
        return null;
    }

    public DoublyLinkedNode getFirst() {
        return first;
    }

    public void setFirst(DoublyLinkedNode first) {
        this.first = first;
    }

    public DoublyLinkedNode getLast() {
        return last;
    }

    public void setLast(DoublyLinkedNode last) {
        this.last = last;
    }
}