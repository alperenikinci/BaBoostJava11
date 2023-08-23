package com.bilgeadam.week08.lecture003;

import java.util.LinkedHashMap;
import java.util.Map;

public class HarfFrekansiBulma {

	/*
	 * 
	 * Utility sinifini kullanarak disaridan bir string deger alalim.
	 * 
	 * bu kelimeyi bir map icerisine isleyecegiz. (Sirali bir sekilde)
	 * 
	 * String kelime = "merhaba";
	 * 
	 * m = 1; e = 1; r = 1; h = 1; a = 2; b = 1;
	 * 
	 * Ciktimiz yukaridaki gibi olmali...
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String kelime = Utility.stringDegerAlma("Lutfen bir kelime giriniz : ");

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : kelime.toCharArray()) {
			if (map.containsKey(c)) {
				map.replace(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		// Entry =>> Girdi, <Character, Integer> key value pair'i. map.entrySet();

//		for (Entry<Character, Integer> karakter : map.entrySet()) {
//			System.out.println(karakter.getKey() + " = " + karakter.getValue());
//		}

		map.forEach((x, y) -> System.out.println(x + " " + y));

	}

}
