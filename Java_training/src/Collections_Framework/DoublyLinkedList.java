package Collections_Framework;

public class DoublyLinkedList {
	
	private Node head, tail;
	int size = 0;
	
	class Node {
		int data;
		Node prev;
		Node next;
		Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
			size++;
		}
	}
	
	public void insertFirst(int data) {
		if (size == 0) {
			head = tail = new Node(data);
			return;
		}
		Node newNode = new Node(data);
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	public void insertLast(int data) {
		if (size == 0) {
			head = tail = new Node(data);
			return;
		}
		Node newNode = new Node(data);
		newNode.prev = tail;
		tail.next = newNode;
		tail = newNode;
	}
	
	public int deleteFirst() {
		if (size == 0) {
			System.out.println("Empty list, no node to delete!");
			return Integer.MIN_VALUE;
		}
		int delData = head.data;
		head = head.next;
		size--;
		return delData;
	}
	
	public int deleteLast() {
		if (size == 0) {
			System.out.println("Empty list, no node to delete!");
			return Integer.MIN_VALUE;
		}
		int delData = tail.data;
		tail = tail.prev;
		tail.next = null;
		size--;
		return delData;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void printList() {
		if (size == 0) {
			System.out.println("Empty list!");
			return;
		}
		System.out.print("Head -> ");
		for (Node itr = head; itr != tail; itr = itr.next) {
			System.out.print(itr.data + " <-> ");
		}
		System.out.println(tail.data + " <- tail");
	}

	public static void main(String[] args) {
		
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.insertFirst(10);
		dl.insertFirst(20);
		dl.deleteFirst();
		dl.insertFirst(30);
		dl.insertLast(500);
		dl.deleteLast();
		dl.printList();
		System.out.println(dl.getSize());

	}

}
