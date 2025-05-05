package String_Problems;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sentence here: ");
		String input = sc.nextLine().replaceAll("[^A-Za-z]", " ");
		String[] inputArray = input.split(" ");
		for (String word : inputArray) {
			if (word.length() % 2 == 0) {
				System.out.print(word + ", ");
			}
		}
		sc.close();
	}
}
