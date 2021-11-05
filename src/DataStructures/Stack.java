package DataStructures;

public class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top;

	public Stack(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}

	public void push(char s) {
		if(!isFull())
			this.stackArray[++top] = s;
		else
			throw new ArrayIndexOutOfBoundsException("Max size of Array is reached");
	}

	public char pop() {
		if(!isEmpty())
			return this.stackArray[top--];
		else
			throw new ArrayIndexOutOfBoundsException("Array is empty");
			
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public char[] getStackArray() {
		return stackArray;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top);
	}

	public char peak() {
		return stackArray[top];
	}

	public void setStackArray(char[] stackArray) {
		this.stackArray = stackArray;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

}
