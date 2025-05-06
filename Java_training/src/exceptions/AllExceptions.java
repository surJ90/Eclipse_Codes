package exceptions;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

public class AllExceptions {
	
	// Arithmetic exception
	public static void arithmeticExample() {
		try {
			int result = 10 / 0; // Divided by zero
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// Class not found exception
	public static void classNotFoundexample() {
		try {
			Class.forName("NonExistingClass");
		} catch (ClassNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// File not found exception
	public static void fileNotFoundexample() {
		try {
			FileReader reader = new FileReader("nonexistent.txt");
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// IO exception
	public static void ioExceptionExample() {
		try {
			FileReader reader = new FileReader("file.txt");
			reader.close();
			reader.read();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// Interrupted exception
	public static void interruptedExample() {
		try {
			Thread.sleep(1000);
			System.out.println("Slept for 1 second.");
		} catch (InterruptedException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// Number format exception
	public static void numberFormatExample() {
		try {
			int number = Integer.parseInt("abc");
			System.out.println("Number: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// String index out of bound exception
	public static void stringIndexexample() {
		try {
			String str = "Suraj";
			char c = str.charAt(18);
			System.out.println("Character: " + c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// Illegal argument exception
	public static void illeagalArgumentExample() {
		try {
			throw new IllegalArgumentException("Invalid input provided");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// Concurrent modification exception
	public static void concurrentModificationExample() {
		try {
			List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
			for (Integer num : list) {
				list.remove(num);
			}
		} catch (ConcurrentModificationException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	// No such field exception
	public static void noSuchFieldExample() {
		try {
			Class<?> cls = String.class;
			Field field = cls.getField("nonexistent");
			System.out.println("Field: " + field);
		} catch (NoSuchFieldException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		arithmeticExample();
		classNotFoundexample();
		fileNotFoundexample();
		ioExceptionExample();
		interruptedExample();
		numberFormatExample();
		stringIndexexample();
		illeagalArgumentExample();
		concurrentModificationExample();
		noSuchFieldExample();
	}

}
