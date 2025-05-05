package String_Problems;
import java.util.Arrays;
import java.util.Scanner;
public class Angrams {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("First word-> ");
		String one = in.next().toLowerCase();
		System.out.println("Second word-> ");
		String two = in.next().toLowerCase();
		
		if (one.length() != two.length()) {
			System.out.println("Not an angram");
			System.exit(0);
		}
		char[] oneArray = one.toCharArray();
		Arrays.sort(oneArray);
		char[] twoArray = two.toCharArray();
		Arrays.sort(twoArray);
		
		String output = Arrays.equals(oneArray, twoArray) ? "Anagrams" : "Not an anagram";
		System.out.println(output);
		in.close();
	}
}
