package Datastructure;

public class ArrayStack {
	
	static class Stack {
		private int[] st;
		private int top;
		
		public Stack(int size) {
			st = new int[size];
			top = -1;
		}
		
		void push(int value) {
			if (top == st.length - 1) {
				System.out.println("Stack overflow.");
				return;
			}
			
			st[++top] = value;
			System.out.println(top);
		}
		
		int pop() {
			if (top < 0) {
				return -1;
			}
			return st[top--];
		}
		
		int getTop() {
			if (top < 0) {
				return -1;
			}
			return st[top];
		}
		
		void printStack() {
			if (top < 0) { System.out.println("Empty stack."); return; }
			for (int i=top;i>=0;i--) {
				System.out.println(st[i]);
			}
		}
	}

	public static void main(String[] args) {
			Stack s = new Stack(10);
			s.printStack();
			s.getTop();
			s.push(10);
			s.push(20);
			s.push(30);
			s.printStack();
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
	}

}
