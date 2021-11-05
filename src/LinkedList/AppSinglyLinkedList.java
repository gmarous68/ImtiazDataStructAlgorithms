package LinkedList;

public class AppSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		
		sll.insertFirst(100);
		sll.insertFirst(50);
		sll.insertFirst(99);
		sll.insertFirst(88);		
		sll.displayList();
		
		sll.deleteFirst();
		sll.deleteFirst();
		sll.deleteFirst();
		sll.deleteFirst();
		
		sll.displayList();

		
		
		
		sll.insertLast(500);
		sll.insertLast(501);
		sll.insertLast(502);
		sll.insertLast(503);
		sll.displayList();
		
		sll.insertFirst(50);
		sll.insertLast(1503);
		sll.displayList();
		
	}

}
