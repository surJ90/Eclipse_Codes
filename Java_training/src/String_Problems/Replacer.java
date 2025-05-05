package String_Problems;

import java.util.Scanner;

public class Replacer {
	
	static String usingFunctions(String s, int idx, char c) {
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(idx, c);
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = in.nextLine();
		System.out.println("Enter the character to add: ");
		char c = in.next().charAt(0);
		System.out.println("Enter index: ");
		int idx = in.nextInt();
		String op = usingFunctions(s, idx, c);
		System.out.println(op);
		in.close();
	}
}
