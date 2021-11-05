package DataStructures;

public class Queue {
	private int maxSize;
	private long[] qArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int size) {
		this.maxSize = size;
		this.qArray = new long[size];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}

	public void insert(long num) {
		qArray[++rear] = num;
		nItems++;
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < qArray.length; i++) {
			System.out.print(qArray[i] + " ");
		}
		System.out.println("]");
	}

	public long remove() {
		long temp = qArray[front];
		front++;
		if (front == maxSize)
			front = 0;
		nItems--;
		return temp;
	}

	public long peak() {
		return qArray[front];
	}

}
