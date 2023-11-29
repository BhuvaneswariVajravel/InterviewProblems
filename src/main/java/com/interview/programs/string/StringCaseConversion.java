package com.interview.programs.string;

import org.apache.logging.log4j.util.StringBuilders;

/**
 * 
 * @author Bhuvaneswari.V
 * 
 *         convert the given input string "LULULEMON_PRIVATE_LIMITED" into
 *         lululemonPrivateLimited Company : Lululemon Level - L1
 *
 */
public class StringCaseConversion {

	public static void main(String[] args) {
		String str = "LULULEMON_PRIVATE_LIMITED";
		String[] words = str.split("_");
		StringBuilder camelCasewords = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			String word = words[i].toLowerCase();
			if (i > 0)
				camelCasewords.append(word.substring(0, 1).toUpperCase())
						.append(word.substring(1, word.length()).toLowerCase());
			else
				camelCasewords.append(word);

		}
		System.out.println(camelCasewords);
	}
}
