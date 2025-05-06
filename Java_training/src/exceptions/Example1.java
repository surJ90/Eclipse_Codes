package exceptions;

public class Example1 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			int a = 10, b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String s = null;
			System.out.println(s.length()); 
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program continues to run!");
	}
}
