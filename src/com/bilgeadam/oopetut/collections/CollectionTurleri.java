package com.bilgeadam.oopetut.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTurleri {

	public static void main(String[] args) {

		// ArrayList: Diziyi temsil ederler ve verilere sıralı erişim sağlarlar.
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Elma");
		arrayList.add("Muz");
		arrayList.add("Portakal");
		arrayList.add("Kiraz");
		arrayList.add("Uzüm");

		// LinkedList: Bağlı liste yapısını kullanır, ortadan veya baştan veri eklemek
		// için uygundur.
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Elma");
		linkedList.add("Muz");
		linkedList.add("Portakal");
		linkedList.add("Kiraz");
		linkedList.add("Uzüm");

		// HashSet: Benzersiz elemanlari içerir ve rastgele sıralama yapar.
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Elma");
		hashSet.add("Muz");
		hashSet.add("Uzüm");
		hashSet.add("Portakal");
		hashSet.add("Kiraz");

		// LinkedHashSet: Elemanları eklenme sırasına göre sıralayacak.
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Kiraz");
		linkedHashSet.add("Uzüm");
		linkedHashSet.add("Elma");
		linkedHashSet.add("Muz");
		linkedHashSet.add("Portakal");

		// TreeSet: Benzersiz elemanları sıralar (String icin ASCII numarasına göre
		// sıralar)
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("Kiraz");
		treeSet.add("Uzüm");
		treeSet.add("Elma");
		treeSet.add("Muz");
		treeSet.add("Portakal");

		// HashMap: Anahtar-deger ciftleri icin kullanılır.
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(3, "Üç");
		hashMap.put(33, "Otuz üç");
		hashMap.put(13, "On üç");
		hashMap.put(2, "İki");
		hashMap.put(4, "Dört");

		// LinkedHashMap: Anahtarları eklenme sırasına göre sıralıyor.
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(2, "İki");
		linkedHashMap.put(33, "Otuz üç");
		linkedHashMap.put(13, "On üç");
		linkedHashMap.put(4, "Dört");
		linkedHashMap.put(3, "Üç");

		// TreeMap: Anahtarları sıralar.
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(2, "İki");
		treeMap.put(33, "Otuz üç");
		treeMap.put(13, "On üç");
		treeMap.put(4, "Dört");
		treeMap.put(3, "Üç");

		// Elemanları yazdırma;
//		System.out.println("ArrayList Elemanları:");
//		for (String element : arrayList) {
//			System.out.println(element);
//		}
//
//		System.out.println("\nLinkedList Elemanları:");
//		for (String element : linkedList) {
//			System.out.println(element);
//		}

//		System.out.println("\nHashSet Elemanları:");
//		for (String element : hashSet) {
//			System.out.println(element);
//		}
//
//		System.out.println("\nLinkedHashSet Elemanları:");
//		for (String element : linkedHashSet) {
//			System.out.println(element);
//		}
//
//		System.out.println("\nTreeSet Elemanları:");
//		for (String element : treeSet) {
//			System.out.println(element);
//		}

		System.out.println("\nHashMap Elemanları:");// [1=domates, 3=patates]
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println("\nLinkedHashMap Elemanları:");
		for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println("\nTreeMap Elemanları:");
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
