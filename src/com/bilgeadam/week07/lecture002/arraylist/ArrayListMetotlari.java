package com.bilgeadam.week07.lecture002.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMetotlari {

	public static void main(String[] args) {

		List<String> sehirler = new ArrayList<>();
//		ArrayList<String> sehirler2 = new ArrayList<>();

		// Listeye eleman ekleme.
		sehirler.add("Ankara");
		sehirler.add("Adana");
		sehirler.add("Antalya");
		sehirler.add("Izmir");
		sehirler.add("Canakkale");
		sehirler.add("Balikesir");
		sehirler.add("Hatay");
		sehirler.add("Eskisehir");
		sehirler.add("Ankara");

		// Listeyi gezme.
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

		// Listeden eleman cikarma.
//		sehirler.remove(0); //index'e gore eleman cikarma
		sehirler.remove("Adana"); // index degerine gore eleman cikarma

		System.out.println();
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

		// Listenin belirli bir indeksine eleman ekleme.
		sehirler.add(5, "Adana");

		System.out.println();
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

		// Butun listeyi temizleme.
//		sehirler.clear();

//		for (String sehir : sehirler) {
//			System.out.println(sehir);
//		}

		// Listenin elemanlarina erisim.
		System.out.println();
		sehirler.get(0);
		System.out.println("Sectiginiz sehir : " + sehirler.get(7));

		sehirler.set(6, "Iskenderun");

		System.out.println();
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

		System.out.println();
		// Listenin boyutuna erisme
		System.out.println(sehirler.size());

		// Liste icerisinde kontrol ve arama yapma.
		sehirler.contains("Ankara");
		System.out.println(sehirler.contains("Ankara"));
		sehirler.indexOf("Ankara");
		System.out.println(sehirler.indexOf("Ankara")); // eger girilen eleman listede yok ise "-1" doner.

		sehirler.lastIndexOf("Ankara"); // "Ankara"nin bulundugu son indexi getirir.
		System.out.println(sehirler.lastIndexOf("Ankara"));

		// SubList
		sehirler.subList(3, 7);
		System.out.println(sehirler.subList(3, 7)); // listedeki belirli bir araligin getirilmesini
													// saglar.
		// baslangic index degerini getirir, bitis index degerini getirmez
		// 3,4,5 ve 6. index'in verilerini goruntuler.

		// Donusturmeler
		String[] arraySehirler = sehirler.toArray(new String[sehirler.size()]); // ArrayList to Array

		System.out.println();
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

		List<String> sehirler2 = new ArrayList<>();
		sehirler2.add("Trabzon");
		sehirler2.add("Rize");
		sehirler2.add("Artvin");

		sehirler.addAll(sehirler2); // Bir listeyi baska bir listenin icerisine aktarma.

		System.out.println();
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

//		ArrayList[][] table = new ArrayList[10][10];

	}

}
