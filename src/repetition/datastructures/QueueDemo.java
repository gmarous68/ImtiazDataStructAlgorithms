package repetition.datastructures;

public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);

        q.view();
    }
}