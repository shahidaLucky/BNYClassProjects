package stackDS;

public class Stack {

	private int maxSize;
	private char[] stackArray;
	private int top;
	// int j;

	public Stack(int size) { // Constructor
		this.maxSize = maxSize;
		this.stackArray = stackArray;
		this.top = -1;
	}// end of constructor

	public void push(char j) {
		if (isFull()) {
			System.out.println("This stack is already full ! ");
		} else {
			top++;
			stackArray[top] = j;
		}
	}// end of push method

	public char pop() {
		if (isEmpty()) {
			System.out.println("The stack is already empty ! ");
			return '0';
		} else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}

	}// end of pop method

	public char peak() {
		return stackArray[top];
	}// end of peak method

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top);
	}
}// end of class
