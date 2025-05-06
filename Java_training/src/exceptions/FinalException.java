package exceptions;

public class FinalException {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			int a = 10 / 0; // Arithmetic exception
		} catch (ArithmeticException e) {
			System.out.println("Caught: " + e);
			throw new NullPointerException("Error in catch");
		} finally {
			try {
				String str = null;
				str.length();
			} catch (NullPointerException e2) {
				System.out.println("Caught in finally: " + e2);
			}
		}
	}

}
