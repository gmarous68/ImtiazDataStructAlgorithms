package repetition.linkedlist;

public class SinglyLinkedList {
    public static void main(String[] args) {
        SinglyListNode n1 = new SinglyListNode(4);
        SinglyListNode n2 = new SinglyListNode(6);
        SinglyListNode n3 = new SinglyListNode(8);
        SinglyListNode n4 = new SinglyListNode(10);

        n1.setNextNode(n2);
        n2.setNextNode(n3);
        n3.setNextNode(n4);

        SinglyListNode temp = n2;
        System.out.println("Number of nodes after: " + listLength(temp));
    }

    public static int listLength(SinglyListNode n) {
        int total = 0;
        while(n.getNextNode() != null) {
            n = n.getNextNode();
            total += 1;
        }
        return total;
    }
}