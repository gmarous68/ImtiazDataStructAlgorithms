package repetition.linkedlist;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(100);
        dll.insertFirst(200);
        dll.insertFirst(300);

        dll.insertLast(1000);
        dll.insertLast(2000);
        dll.insertLast(3000);

        dll.insertAfter(3000, 199);
        dll.insertAfter(100, 99);

        dll.deleteKey(199);
        dll.deleteKey(99);
        dll.deleteKey(200);
        dll.deleteKey(300);
        dll.displayList();
    }
}