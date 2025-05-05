package String_Problems;

import java.util.Scanner;

public class String_Modifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String originalString = sc.nextLine();
		System.out.println("Enter the string to insert: ");
		String newString = sc.nextLine();
		System.out.println("Enter the position to be inserted: ");
		int idx = sc.nextInt();
		System.out.println(originalString.subSequence(0, idx + 1) 
				+ newString 
				+ originalString.subSequence(idx, originalString.length()));
		sc.close();
	}
}
