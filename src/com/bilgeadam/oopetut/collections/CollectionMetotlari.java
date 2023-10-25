package com.bilgeadam.oopetut.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionMetotlari {

	public static void main(String[] args) {

		// ArrayList
		List<String> arrayList = new ArrayList<>();
		// ArrayList Baslangici
		System.out.println("ArrayList Baslangici : " + arrayList);

		// Metot 1: Ekleme ve Toplu Ekleme
		arrayList.add("Elma");
		System.out.println("Metot 1 : ArrayList'e 'Elma' eklendi : " + arrayList);
		List<String> eklenecekList = new ArrayList<String>();
		eklenecekList.add("kivi");
		eklenecekList.add("muz");
		arrayList.addAll(Arrays.asList("armut", "uzum")); // List.of
		arrayList.addAll(eklenecekList);
		arrayList.addAll(List.of("karpuz", "seftali"));
		System.out.println(arrayList);

		// Method 2: İceriyor mu? Eleman alma.
		System.out.println(arrayList.contains("ki"));
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.indexOf("uzum"));

		// Method 3: Silme işlemleri;
		System.out.println(arrayList.remove(2));
		System.out.println(arrayList);
		System.out.println(arrayList.add("uzum"));
		System.out.println(arrayList);
		System.out.println(arrayList.removeAll(Arrays.asList("armut", "uzum")));
//		arrayList.clear();
		System.out.println(arrayList);

		// Method 4: Boyut ve Boşluk kontrolü;
		System.out.println(arrayList.size());
		System.out.println(arrayList.isEmpty());

		// Method 5: Alt liste alma ve Eleman degistirme;
		System.out.println(arrayList.subList(0, 2)); // 0 dahil, 2 dahil değil.
		System.out.println(arrayList);
		System.out.println(arrayList.set(1, "armut"));
		System.out.println(arrayList);

		// Method 6: Sıralama ve Diziye Dönüştürme
		Collections.sort(arrayList);
		System.out.println(arrayList);
		String[] array = arrayList.toArray(new String[0]);
		System.out.println(Arrays.toString(array));

		// Method 7: Listeyi String'e cevirme;

		String string = arrayList.toString();
		System.out.println(string);
		System.out.println(arrayList.containsAll(Arrays.asList("Elma", "armut")));
		arrayList.add("Elma");
		System.out.println(arrayList);
		System.out.println(arrayList.lastIndexOf("Elma"));
		System.out.println(arrayList.indexOf("Elma")); // o -> s.get....

		// Method 8: Elemanları buyuk harfe donusturme:
		arrayList.replaceAll(s -> s.replace("a", "A"));
		System.out.println(arrayList);

		// Method 9: Her elaman icin bir islem yapma;
//		arrayList.forEach((s) -> {
//			System.out.print(s.charAt(0));
//			System.out.print(s.charAt(1));
//			System.out.print(s.charAt(2) + " ");
//		});

		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, List<String>> hashMapWithList = new HashMap<Integer, List<String>>();
		// Deger ekleme
		System.out.println(hashMap);
		System.out.println(hashMap.put(1, "domates")); // null
		System.out.println(hashMap);
		System.out.println(hashMap.put(2, "salatalık")); // Bir
//		System.out.println(hashMap.put(2, ""));
		System.out.println(hashMap);
		System.out.println(hashMap.put(3, "patates"));

		// Deger alma deger silme
		System.out.println(hashMap.get(2));
		hashMapWithList.put(1, arrayList);
		System.out.println(hashMapWithList.get(1).get(3));
		System.out.println("Removed : " + hashMap.remove(2));
		System.out.println(hashMap);

		// Boyut ve boşluk kontrolü;
		System.out.println(hashMap.size());
		System.out.println(hashMap.isEmpty());

		// Anahtar kümesi, Degerler ve Entry kümesi alma;

		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		System.out.println(hashMap.entrySet());

	}

}
