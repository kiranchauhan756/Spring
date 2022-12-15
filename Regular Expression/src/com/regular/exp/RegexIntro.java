package com.regular.exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex {
	public int matchString(String string, String target) {
		int count = 0;
		Pattern p = Pattern.compile(target);// designing a pattern to check
		Matcher m = p.matcher(string);// it is used to create a matching value
		while (m.find()) {// if it find a pattern then the value execute from start to end of string
			count++;
			System.out.println(m.start() + "    " + m.end() + "    " + m.group());

			// start returns starting index of matched string
			// end returns ending+1 index of matched string
		}
		return count;
	}
}

public class RegexIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regex reg = new Regex();
		System.out.println("Number of times target occures in string=" + reg.matchString("abcabbbabcavab", "ab"));

	}

}
