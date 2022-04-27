package com.demo.basics.xtra;

public class ShortestWord {
	public static void main(String[] args) {
		String words[] = { "Atrocity", "Pensive", "Imperceptible", "Discordant" };
		String shortestString = words[0];
		for (int i = 0; i< words.length; i++) {
			// convert this to if else
			shortestString = shortestString.length() < words[i].length() ? shortestString: words[i];
		}
		System.out.println(shortestString);
	}
}
