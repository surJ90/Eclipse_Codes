package Collections_Framework;

public class StackLL {
	
	private Node top;
	int size;
	
	StackLL() {
		this.size = 0;
	}
	
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		size++;
	}
	
	public int pop() {
		if (top == null) {
			System.out.println("Stack underflow!");
			return Integer.MIN_VALUE;
		}
		int popItem = top.data;
		top = top.next;
		size--;
		return popItem;
	}
	
	public int getTop() {
		if (top == null) {
			System.out.println("Empty stack!");
			return Integer.MIN_VALUE;
		}
		return top.data;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void printStack() {
		if (top == null) {
			System.out.println("Empty stack!");
			return;
		} 
		for (Node temp = top; temp != null; temp = temp.next) {
			System.out.println(temp.data);
		}
	}

	public static void main(String[] args) {
		
		StackLL st = new StackLL();
		System.out.println(st.getSize());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st.getSize());
		System.out.println(st.getTop());
		st.printStack();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.printStack();

	}

}
