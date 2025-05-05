package String_Problems;

import java.util.Scanner;

public class Swapper {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input: ");
		String ip = in.next();
		StringBuilder sb = new StringBuilder(ip);
		int limit = sb.length() % 2 == 0 ? sb.length() : sb.length() - 1;
		for (int i=0;i<limit;i=i+2) {
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(i+1));
			sb.setCharAt(i+1, temp);
		}
		System.out.println(sb);
		in.close();
	}
}
