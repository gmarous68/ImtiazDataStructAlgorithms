package repetition.linkedlist;

public class SinglyListNode {
    private int data;
    private SinglyListNode nextNode;

    public SinglyListNode(int data) {
        this.data = data;
        this.nextNode = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SinglyListNode getNextNode() {
        if(nextNode != null)
            return nextNode;
        return null;
    }

    public void setNextNode(SinglyListNode nextNode) {
        this.nextNode = nextNode;
    }
}