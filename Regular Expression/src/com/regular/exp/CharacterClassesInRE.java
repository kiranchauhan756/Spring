package com.regular.exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Match {
	public void finaAllValues(String x) {
		// Pattern p = Pattern.compile("[abc]");
		// Pattern p=Pattern.compile("[a-z]");
		// Pattern p=Pattern.compile("[^a-z]");
		Pattern p = Pattern.compile("[A-Z]");
		// Pattern p=Pattern.compile("[^A-Z]");
		// Pattern p = Pattern.compile("[^0-9]");
		// Pattern p=Pattern.compile("[0-9]");
		// Pattern p=Pattern.compile("abc");
		// Pattern p = Pattern.compile("[^a-zA-Z0-9]");

		Matcher m = p.matcher(x);
		while (m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
	}
}

public class CharacterClassesInRE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Match s = new Match();
		s.finaAllValues("A#bc7h$m%90zMcam");

	}

}
