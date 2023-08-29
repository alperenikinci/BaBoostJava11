package com.bilgeadam.week09.lecture002.sepet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sepet {
	/*
	 * 
	 * 1- Urun sinifini encapsulated bir sekilde olusturalim. isim, fiyat.
	 * 
	 * 2- Sepette EUrun'lerden olusan bir Array'imiz olsun. Urun listemiz olsun.
	 * urunOlustur() isimli bir metodumuz olsun. EUrun arrayimizdeki enumlarin
	 * degerleri ile urun olusturup listemizi dolduralim.
	 * 
	 * 3- Urunler ile fiyatlarını mapleyelim. urunler listesi uzerinden calisalim.
	 */

	EUrun[] enumUrunler = EUrun.values();
	List<Urun> urunler = new ArrayList<>();
	Map<String, Double> urunlerVeFiyatlari = new HashMap<>();

	public void urunOlustur() {
		// enumUrunler array'inde gezinmem gerekiyor.

		for (int i = 0; i < enumUrunler.length; i++) {
//			Urun urun = new Urun();
//			urun.setFiyat(enumUrunler[i].getFiyat());
//			urun.setIsim(enumUrunler[i].name());
//			urunler.add(urun);

			urunler.add(new Urun(enumUrunler[i].name(), enumUrunler[i].getFiyat()));
		}

		for (EUrun eUrun : enumUrunler) {
//			Urun urun = new Urun();
//			urun.setFiyat(eUrun.getFiyat());
//			urun.setIsim(eUrun.name());
//			urunler.add(urun);

			urunler.add(new Urun(eUrun.name(), eUrun.getFiyat()));
		}

		urunler.forEach(System.out::println);
	}

	public void urunOlustur2() {
		Arrays.asList(enumUrunler).stream().forEach(x -> urunler.add(new Urun(x.name(), x.getFiyat())));
		urunler.forEach(System.out::println);
	}

	public void urunFiyatMapOlustur() {
//		urunler.stream().forEach((urun) -> urunlerVeFiyatlari.put(urun.getIsim(), urun.getFiyat()));
//		urunlerVeFiyatlari.entrySet().forEach(System.out::println);

		urunlerVeFiyatlari = urunler.stream().collect(Collectors.toMap((k) -> k.getIsim(), (v) -> v.getFiyat()));
		urunlerVeFiyatlari.forEach((k, v) -> System.out.println(k + " urununun fiyati : " + v + " TL'dir."));

	}
}
