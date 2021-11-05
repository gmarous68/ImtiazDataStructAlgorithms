package repetition.linkedlist;

public class CircularLinkedListDemo {
    public static void main(String[] args) {
        CircularLinkedList sll = new CircularLinkedList();
        sll.insertFirst(100);
        sll.insertFirst(200);
        sll.displayList();

        sll.insertLast(50);
        sll.insertLast(40);
        sll.displayList();

        sll.deleteFirst();
        sll.displayList();
    }
}