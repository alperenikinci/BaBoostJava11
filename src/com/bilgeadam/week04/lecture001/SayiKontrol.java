package com.bilgeadam.week04.lecture001;

public class SayiKontrol {

	// 1239451235a
	public static boolean isNumeric(String str) {
		int length = str.length();
		if (length == 0) {
			return false;
		}
		int startIndex = 0;
		if (str.charAt(0) == '-') {
			startIndex = 1;
		}
		for (int i = startIndex; i < length; i++) {
			char c = str.charAt(i);
			if (!Character.isDigit(c)) {
				return false;
			}
		}

		return true;
	}

}
