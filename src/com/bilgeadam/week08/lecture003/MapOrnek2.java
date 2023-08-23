package com.bilgeadam.week08.lecture003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek2 {

	/*
	 * 
	 * ogrenci ve notlardan olusan bir map olusturalim.
	 * 
	 * ogrenciyi cagirdigimda bana notlari donsun. mapi yazdiralim
	 * 
	 */

	Map<String, Integer> sinif = new HashMap<>();
	Map<String, List<Integer>> ogrencilerVeNotlari = new HashMap<>();
	String[] ogrenci = { "Ayse", "Ece", "Mahmut" };
	int[] notlar = { 60, 70, 80 };
	int[][] notlar2 = { { 50, 60, 60 }, { 60, 40, 80 }, { 80, 90, 100 } }; // mapOlustur2 metodu. ve yine mapi
																			// yazdiralim.

	public static void main(String[] args) {

//		Map<String, Integer> map = new HashMap<>();
//
//		}
		MapOrnek2 mapOrnek2 = new MapOrnek2();
		mapOrnek2.mapOlustur1();
		mapOrnek2.mapYazdir1();
		System.out.println();
		mapOrnek2.mapOlustur2();
		mapOrnek2.mapYazdir2();

	}

	public void mapOlustur1() {
		for (int i = 0; i < ogrenci.length; i++) {
			sinif.put(ogrenci[i], notlar[i]);
		}
	}

	public void mapOlustur2() {
		for (int i = 0; i < ogrenci.length; i++) {
			List<Integer> liste = new ArrayList<>();
			for (int j = 0; j < notlar2[i].length; j++) {
				liste.add(notlar2[i][j]);
			}
			ogrencilerVeNotlari.put(ogrenci[i], liste);
		}
	}

	public void mapYazdir1() {
		for (Entry<String, Integer> ogrencilerVeNotlari : sinif.entrySet()) {
			System.out.println(ogrencilerVeNotlari.getKey() + " =>> " + ogrencilerVeNotlari.getValue());
		}
	}

	public void mapYazdir2() {
		for (Entry<String, List<Integer>> ogrencilerVeNotlar : ogrencilerVeNotlari.entrySet()) {
			System.out.println(ogrencilerVeNotlar.getKey() + " =>> " + ogrencilerVeNotlar.getValue());
		}
	}

	// TODO Parametreli cozumunu yapin.

}
