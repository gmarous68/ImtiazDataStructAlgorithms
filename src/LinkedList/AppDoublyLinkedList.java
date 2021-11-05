package LinkedList;

public class AppDoublyLinkedList {
	
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insertFirst(10);
		dll.insertFirst(20);
		dll.insertFirst(30);				
		dll.displayList();
		
		dll.insertAfter(20, 25);
		dll.displayList();		
		
		dll.insertFirst(100);
		dll.displayList();
		
		dll.deleteKey(30);
		dll.displayList();
		
		dll.deleteKey(10);
		dll.displayList();
		
		
		

	}

}
