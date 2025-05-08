package Collections_Framework;

public class ArrayStack {
	
	static class Stack {
		private int[] s;
		private int top;
		
		public Stack(int size) {
			this.s = new int[size];
			this.top = -1;
		}
		
		void push(int value) {
			if (top == s.length - 1) {
				System.out.println("Stack overflow!");
				return;
			}
			s[++top] = value;
		}
		
		int pop() {
			if (top < 0) {
				System.out.println("Stack undeflow!");
				return Integer.MIN_VALUE;
			}
			
			return s[top--];
		}
		
		int getTop() {
			if (top < 0) {
				System.out.println("Empty stack.");
				return Integer.MIN_VALUE;
			}
			return s[top];
		}
		
		void display() {
			if (top < 0) {
				System.out.println("Empty stack");
				return;
			}
			for (int i=top;i>=0;i--) {
				System.out.println(s[i]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Stack s = new Stack(4);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.getTop());

	}

}
