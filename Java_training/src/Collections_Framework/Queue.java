package Collections_Framework;

public class Queue {
	
	private int[] queue;
	private int front;
	private int rear;
	private int size;
	
	public Queue(int size) {
		this.queue = new int[size];
		this.front = this.rear = -1;
		this.size = 0;
	}
	
	void enqueu(int data) {
		if ((rear + 1) % queue.length == front % queue.length) {
			System.out.println("Queue is full, cannot insert.");
			return;
		}
		if (front == -1 && rear == -1) {
			front = rear = 0;
		} else {
			rear = (rear + 1) % queue.length;
		}
		queue[rear] = data;
		size++;
	}
	
	int dequeu() {
		if (front == -1 && rear == -1) {
			System.out.println("Empty queue, cannot delete.");
			return -1;
		}
		int delItem = queue[front];
		if (front == rear) {
			front = rear = -1;
		} else {
			front = (front + 1) % queue.length;
		}
		size--;
		return delItem;
	}
	
	int getFront() {
		if (front == -1 && rear == -1) {
			System.out.println("Empthy queue");
			return -1;
		}
		return queue[front];
	}
	
	int getRear() {
		if (front == -1 && rear == -1) {
			System.out.println("Empthy queue");
			return -1;
		}
		return queue[front];
	}
	
	int getSize() { return this.size; }
	
	void printQueue() {
		if (front == -1 && rear == -1) {
			System.out.println("Empthy queue");
			return;
		}
		int i = front;
		while(i != rear) {
			System.out.print(queue[i] + ", ");
			i = (i + 1) % queue.length;
		}
		System.out.println(queue[rear]);
	}
	
	public static void main(String[] args) {
		
		Queue q = new Queue(4);
		q.enqueu(10);
		q.enqueu(20);
		q.enqueu(30);
		q.enqueu(40);
		q.dequeu();
		q.enqueu(50);
		q.dequeu();
		q.dequeu();
		q.enqueu(60);
		System.out.println(q.getSize());
		q.printQueue();
		
	}

}
