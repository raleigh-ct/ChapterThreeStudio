package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	String movieQuote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
	char[] charactersInString = movieQuote.toCharArray();
	HashMap<Character, Integer> lettersIncluded = new HashMap<>();


		for (char a : charactersInString) {
		if (lettersIncluded.containsKey(a)) {
			lettersIncluded.put(a, lettersIncluded.get(a) + 1);
		} else {
			lettersIncluded.put(a, 1);
		}
	}
		for (Map.Entry entry : lettersIncluded.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
    }

