package com.bilgeadam.week09.lecture002.sepet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
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
	 * 
	 * 4- urunEkle() metodumuz olsun. Sepetime bir urun ekleyecek, urun hali hazirda
	 * sepette var ise adetini artiracak.
	 * 
	 * 5-2 tane mapim var. urunlerVeFiyatlari, sepet. Sepetimin toplam fiyatini
	 * hesaplamak istiyorum. Bunun için; sepetimden urun adini almam, bu urun adina
	 * denk gelen fiyat degerini urunlerVeFiyatlari map'inde aramam gerekiyor. sonra
	 * bu fiyat degerini alip, sepetimdeki urun adedi sayisiyla carpip toplama
	 * eklemem gerekiyor. Bunu sepetteki her bir urun icin yaparsam ve toplami her
	 * zaman guncelleyerek ilerler isem sepetimin toplam fiyatini bulabilirim.
	 * 
	 * List<Double> fiyatlar;
	 */

	EUrun[] enumUrunler = EUrun.values();
	List<Urun> urunler = new ArrayList<>();
	Map<String, Double> urunlerVeFiyatlari = new HashMap<>();
	Map<String, Integer> sepet = new HashMap<>();
	Double toplam = 0.0;

	public Sepet() {
		urunOlustur2();
		urunFiyatMapOlustur();
	}

	public void sepetToplami() {
		List<Double> fiyatlar = new ArrayList<Double>();
		sepet.forEach((isim, adet) -> {

			double fiyat = urunlerVeFiyatlari.get(isim) * adet;
			fiyatlar.add(fiyat);
		});
		toplam = 0.0;
		for (Double fiyat : fiyatlar) {
			toplam += fiyat;
		}
		System.out.println("Sepet toplam tutari : " + toplam);
	}

	public void sepetToplami2() {
		List<Double> fiyatlar = new ArrayList<Double>();
		DoubleSummaryStatistics toplam;

		for (Entry<String, Integer> urun : sepet.entrySet()) {
			fiyatlar.add(urun.getValue() * urunlerVeFiyatlari.get(urun.getKey()));
		}
		toplam = fiyatlar.stream().collect(Collectors.summarizingDouble(Double::doubleValue));

		System.out.println("Sepet toplam tutari : " + toplam.getSum());
	}

	public void sepetToplami3() {
		toplam = 0.0;
		sepet.forEach((isim, adet) -> toplam += (urunlerVeFiyatlari.get(isim) * adet));
		System.out.println("Sepetin toplam tutari : " + toplam);
	}

	public void sepetToplami4() {

//		sepet.entrySet().stream().map(urun -> urunlerVeFiyatlari.get(urun.getKey()) * urun.getValue())
//				.collect(Collectors.toList()).forEach(System.out::println); ->> Direkt sepet tutarini doner.

		List<Double> fiyatlar = sepet.entrySet().stream()
				.map(urun -> urunlerVeFiyatlari.get(urun.getKey()) * urun.getValue()).collect(Collectors.toList());

//		toplam = 0.0;
//		for(Double fiyat : fiyatlar) {
//			toplam += fiyat;
//		}
//		 ->> fiyatlari teker teker gezip, stream'de toplar. collect yaptigimda liste
//		 haline getirip doner.

		toplam = sepet.entrySet().stream().mapToDouble(urun -> urunlerVeFiyatlari.get(urun.getKey()) * urun.getValue())
				.sum();

		Double toplam2 = fiyatlar.stream().reduce((f1, f2) -> f1 + f2).get();
		Optional<Double> toplam3 = fiyatlar.stream().reduce((f1, f2) -> f1 + f2);

		System.out.println("Sepetin toplam tutari : " + toplam);
	}

	public void urunEkle() {
		String urunIsmi = Utility.stringDegerAlma("Lutfen sepete eklemek istediginiz urunun adini giriniz : ");
		Optional<Urun> urun = urunler.stream().filter(u -> u.getIsim().equals(urunIsmi)).findFirst();
//		Urun urun = null;
//		for (Urun u : urunler) {
//			if (u.getIsim().equals(urunIsmi)) {
//				urun = u;
//				break;
//			}
//		}
//		//if (urun != null) 
		if (urun.isPresent()) {
			if (sepet.containsKey(urunIsmi)) {
				sepet.put(urunIsmi, sepet.get(urunIsmi) + 1);
			} else {
				sepet.put(urunIsmi, 1);
			}
		} else {
			System.out.println("Urunler listesinde boyle bir urun bulunmamaktadir!!! ");
		}
	}

	public void sepetiGoster() {
		sepet.forEach((k, v) -> System.out.println(k + " Urunu " + v + " adet."));
		sepetToplami4();
	}

	public void menu() {
		int kontrol = 0;
		do {
			System.out.println("---------------");
			System.out.println("---Sepet App---");
			System.out.println("---------------");
			System.out.println("1 - Urunleri Goster");
			System.out.println("2 - Urun Ekle");
			System.out.println("3 - Sepeti Goster");
			System.out.println("0 - Cikis");
			System.out.println("---------------");
			kontrol = Utility.intDegerAlma("Lutfen bir secim yapiniz : ");

			switch (kontrol) {
			case 1: {
				urunleriListele();
				break;
			}
			case 2: {
				urunEkle();
				break;
			}
			case 3: {
				sepetiGoster();
				break;
			}
			case 0: {
				System.out.println("Uygulamadan cikis yapiliyor...");
				break;
			}
			default:
				System.out.println("Lutfen gecerli bir deger giriniz!!!");
				break;
			}

		} while (kontrol != 0);
	}

	private void urunleriListele() {
		urunlerVeFiyatlari.forEach((k, v) -> System.out.println(k + " urununun fiyati : " + v + " TL'dir."));
	}

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
//		urunler.forEach(System.out::println);
	}

	public void urunFiyatMapOlustur() {
//		urunler.stream().forEach((urun) -> urunlerVeFiyatlari.put(urun.getIsim(), urun.getFiyat()));
//		urunlerVeFiyatlari.entrySet().forEach(System.out::println);

		urunlerVeFiyatlari = urunler.stream().collect(Collectors.toMap((k) -> k.getIsim(), (v) -> v.getFiyat()));
//		urunlerVeFiyatlari.forEach((k, v) -> System.out.println(k + " urununun fiyati : " + v + " TL'dir."));

	}
}
