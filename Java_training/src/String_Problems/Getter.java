package String_Problems;

import java.util.Scanner;

public class Getter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String ip = sc.next();
		System.out.println("Enter a index: ");
		int idx = sc.nextInt();
		System.out.println("Character at index " + idx + " is: " + ip.charAt(idx));
		sc.close();
	}
}
