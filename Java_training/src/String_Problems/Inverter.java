package String_Problems;

import java.util.Scanner;

public class Inverter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String ip = in.nextLine();
		StringBuilder sb = new StringBuilder(ip);
		for (int i=0,j=sb.length()-1; i<=sb.length()/2; i++,j--) {
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, temp);
		}
		System.out.println(sb);
		in.close();
	}
}
