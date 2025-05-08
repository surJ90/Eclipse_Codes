package Collections_Framework;

public class LinkedList {
	
	private Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertFront(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void insertLast(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void insertAtPosition(int position, int value) {
		if (position < 0) {
			System.out.println("Invalid index.");
			return;
		}
		if (head == null) {
			insertFront(value);
			return;
		}
		Node temp = head;
		int idx = 0;
		while (temp != null && idx < position-1) {
			temp = temp.next;
			idx++;
		}
		if (temp == null) {
			System.out.println("Invalid index.");
			return;
		}
		Node newNode = new Node(value);
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public int deleteFront() {
		if (head == null) {
			System.out.println("No node to delete.");
			return Integer.MIN_VALUE;
		}
		int delData = head.data;
		head = head.next;
		return delData;
	}
	
	public int deleteLast() {
		if (head == null) {
			System.out.println("No node to delete.");
			return Integer.MIN_VALUE;
		}
		if (head.next == null) {
			int delData = head.data;
			head = null;
			return delData;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		int delData = temp.next.data;
		temp.next = null;
		return delData;
	}
	
	public int deleteAtPosition(int position) {
		if (position < 0 || head == null) {
			System.out.println("Invalid input");
			return Integer.MIN_VALUE;
		}
		if (position == 0) {
			return deleteFront();
		}
		Node temp = head;
		int idx = 0;
		while (temp != null && idx < position - 1) {
			temp = temp.next;
			idx++;
		}
		if (temp == null || temp.next == null) {
			System.out.println("Invalid input.");
			return Integer.MIN_VALUE;
		}
		int delData = temp.next.data;
		temp.next = temp.next.next;
		return delData;
	}
	
	public void display() {
		if (head == null) {
			System.out.println("Empty list.");
			return;
		}
		System.out.print("HEAD -> ");
		Node iter;
		for (iter = head; iter.next != null; iter = iter.next) {
			System.out.print(iter.data + " -> ");
		}
		System.out.println(iter.data);
	}
	
	public Node reverseList(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node prev = null, curr = head, nxt;
		while (curr != null) {
			nxt = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = nxt;
		}
		return prev;
	}

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.deleteFront();
		ll.deleteLast();
		ll.insertFront(10);
		ll.insertLast(20);
		ll.insertFront(5);
		ll.insertAtPosition(2, 15);
		ll.deleteAtPosition(-1);
		ll.display();
		ll.head = ll.reverseList(ll.head);
		ll.display();

	}
}
