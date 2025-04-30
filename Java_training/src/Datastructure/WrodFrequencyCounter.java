package Datastructure;

import java.util.Scanner;
import java.util.HashMap;

public class WrodFrequencyCounter {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		String sentence;
		
		System.out.println("Enter your sentence here: ");
		sentence = in.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", " ");
		
		String[] words = sentence.split(" ");
		
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		
		System.out.println(map);
		
		in.close();
	}

}
