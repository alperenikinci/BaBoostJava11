package com.bilgeadam.week07.lecture002.arraylistornekler;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOrnek1 {

	/*
	 * String bir arraylist
	 * 
	 * Ankara Antalya Bolu Artvin Ankara Antalya Erzurum Karaman Ankara
	 * 
	 * "an" ile baslayan sehirleri listeden cikaralim.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		List<String> sehirler = new ArrayList<>();
		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("Bolu");
		sehirler.add("Artvin");
		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("Erzurum");
		sehirler.add("Karaman");
		sehirler.add("Ankara");

//		for (int i = 0; i < sehirler.size(); i++) {
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.remove(i);
//				i--;
//			}
//		}

//		for (int i = sehirler.size() - 1; i >= 0; i--) {
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.remove(i);
//			}
//		}

//		for (int i = 0; i < sehirler.size(); i++) {
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.remove(i);
//				sehirler.add(i, "xxxx");
//			}
//		}

//		for (int i = 0; i < sehirler.size(); i++) {
//
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.set(i, "xxxx");
//			}
//		}

		for (String sehir : sehirler) {
			if (sehir.startsWith("An")) {
				sehirler.set(sehirler.indexOf(sehir), "xxxx");
			}
		}

		for (String sehir : sehirler) {
			System.out.println(sehir);
		}
	}

}