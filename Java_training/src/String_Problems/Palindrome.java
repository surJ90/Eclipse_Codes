package String_Problems;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here: ");
		String input = sc.nextLine().toLowerCase();
		boolean flag = true;
		for (int i=0,j=input.length()-1;i<=input.length()/2;i++,j--) {
			if (input.charAt(i) != input.charAt(j)) {
				flag = false;
			}
		}
		String output = flag ? "Palindrome" : "Not a palindrome";
		System.out.println(output);
		sc.close();
	}
}
