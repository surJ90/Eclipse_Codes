package Datastructure;

class Queue {
	private int[] queue;
	private int head;
	private int tail;
	private int size;
	
	public Queue(int size) {
		this.queue = new int[size];
		this.head = this.tail = -1;
		this.size = 0;
	}
	
	void enqueue(int elem) {
		if ((tail + 1) % queue.length == head) {
			System.out.println("Queue is full!");
			return;
		}
		if (head == -1 && tail == -1) {
			head = tail = 0;
		} else {
			tail = (tail + 1) % queue.length;
		}
		size++;
		queue[tail] = elem; 
	}
	
	int dequeue() {
		if (head == -1 && tail == -1) {
			return -1;
		}
		int delElem;
		size--;
		if (head == tail) {
			delElem = queue[head];
			head = tail = -1;
			return delElem;
		}
		delElem = queue[head];
		head = (head + 1) % queue.length;
		return delElem;
	}
	
	int getHead() {
		if (head == -1 && tail == -1) {
			return -1;
		} 
		
		return queue[head];
	}
	
	int getTail() {
		if (head == -1 && tail == -1) {
			return -1;
		}
		
		return queue[tail];
	}
	
	int size() {return size;}
	
	void printQueue() {
		if (head == -1 && tail == -1) {
			System.out.println("Empty Queue");
			return;
		}
		
		for (int i=head;i<=tail;i++) {
			System.out.print(queue[i] + " | ");
		}
		System.out.println();
	}
}

public class ArrayQueue {

	public static void main(String[] args) {
		
		Queue q = new Queue(3);
		q.enqueue(1);
		q.enqueue(2);
		q.printQueue();
		q.enqueue(3);
		q.enqueue(4);
		q.printQueue();
		System.out.println(q.dequeue());
		q.printQueue();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.printQueue();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.printQueue();
	}
}
