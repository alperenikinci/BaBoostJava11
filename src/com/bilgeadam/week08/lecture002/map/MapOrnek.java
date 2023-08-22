package com.bilgeadam.week08.lecture002.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bilgeadam.week08.lecture002.set.Ogrenci;

public class MapOrnek {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		Map<Integer, Integer> map3 = new HashMap<>();
		Map<String, String> map4 = new HashMap<>();
		Map<Integer, Boolean> map5 = new HashMap<>();
		Map<String, List<String>> map6 = new HashMap<>();
		Map<String, Map<Integer, List<Integer>>> map7 = new HashMap<>();
		Map<Integer, Ogrenci> ogrenciMap = new HashMap<>();

		Ogrenci ogrenci = new Ogrenci(50, "Ugur");
		ogrenciMap.put(1, ogrenci);
		ogrenciMap.put(2, new Ogrenci(25, "Alperen"));
		ogrenciMap.put(15, new Ogrenci(10, "Zeynep"));
		ogrenciMap.put(4, new Ogrenci(70, "Sedat"));

		System.out.println(ogrenciMap.get(2));
		System.out.println(ogrenciMap.containsKey(15));
		// System.out.println(ogrenciMap.containsValue(new Ogrenci(50, "Ugur")));
		System.out.println(ogrenciMap.containsValue(ogrenci));
	}

}
