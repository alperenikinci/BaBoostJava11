package com.bilgeadam.oopetut.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformansOrnek {
	public static void main(String[] args) {
		int n = 100000;

		// ArrayList performansı
		List<Integer> arrayList = new ArrayList<>();

		long startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			arrayList.add(i);
		}
		long endTime = System.nanoTime();
		System.out.println("ArrayList veri ekleme süresi: " + (endTime - startTime) / 1e6 + " ms");

		startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			arrayList.remove(arrayList.size() - 1);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList veri silme süresi: " + (endTime - startTime) / 1e6 + " ms");

		// LinkedList performansı
		List<Integer> linkedList = new LinkedList<>();

		startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList veri ekleme süresi: " + (endTime - startTime) / 1e6 + " ms");

		startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			linkedList.remove(linkedList.size() - 1);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList veri silme süresi: " + (endTime - startTime) / 1e6 + " ms");

		// ArrayList yazdırma süresi
		startTime = System.nanoTime();
		printList(arrayList);
		endTime = System.nanoTime();
		System.out.println("ArrayList veri gezme süresi: " + (endTime - startTime) / 1e6 + " ms");

		// LinkedList yazdırma süresi
		startTime = System.nanoTime();
		printList(linkedList);
		endTime = System.nanoTime();
		System.out.println("LinkedList veri gezme süresi: " + (endTime - startTime) / 1e6 + " ms");
	}

	public static void printList(List<Integer> list) {
		for (Integer num : list) {
		}
	}
}
