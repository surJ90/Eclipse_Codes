package Collections_Framework;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListStack<T> {
	
	private ArrayList<T> stack;
	
	public ArrayListStack () {
		stack = new ArrayList<>();
	}
	
	void push(T item) {
		stack.add(item);
	}
	
	T pop() {
		if (stack.isEmpty()) {
			throw new EmptyStackException();
		}
		return stack.remove(stack.size() - 1);
	}
	
	T peek() {
		if (stack.isEmpty()) {
			throw new EmptyStackException();
		}
		return stack.get(stack.size() - 1);
	}
	
	boolean isEmpty() {
		return stack.isEmpty();
	}
	
	int size() {
		return stack.size();
	}

	@Override
	public String toString() {
		return stack.toString();
	}
	
	public static void main(String[] args) {
		
		ArrayListStack<Integer> s = new ArrayListStack<Integer>();
		s.push(10);
		s.push(20);
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		s.pop();
		s.pop();
		s.pop();
		
	}

}
