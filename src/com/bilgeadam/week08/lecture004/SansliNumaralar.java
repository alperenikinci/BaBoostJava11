package com.bilgeadam.week08.lecture004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SansliNumaralar {

	/*
	 * 
	 * 1 ile 100 arasinda rastgele, 10.000 adet sayi uretecegiz.
	 * 
	 * 1- sayiOlustur metodu ile rastgele olusturdugumuz sayilari bir map'e
	 * atacagiz. Sayinin kac kere tekrar ettigini tutacagiz. key = sayi , value =
	 * tekrar sayisi.
	 * 
	 * 2- mapde gezinirken listeye ekleme yapacagiz. Her eleman ne kadar tekrar
	 * ediyor ise, o kadar kez listeye eklenecek.
	 * 
	 * 
	 * 3- En son olusturdugumuz listeden rastgele 10 adet deger alacagiz ve bu
	 * aldigimiz degerleri bir sete ekleyecegiz. Bu isleme gecmeden once listemizi
	 * karistiralim. Collections.shuffle(); sansliNumaralariBul();
	 * 
	 * 
	 */

	static final int maxSayi = 100;
	static final int uretilenSayiMiktari = 10000;
	Map<Integer, Integer> sayilarMap = new HashMap<>();
	List<Integer> sayilarListesi = new ArrayList<>();
	Set<Integer> sansliNumaralar = new TreeSet<>();

	private int sayiOlustur() {
		return Utility.randomSayiUret(1, maxSayi + 1);
	}

	public void mapOlustur() {
		for (int i = 0; i < uretilenSayiMiktari; i++) {
			int sayi = sayiOlustur();
			if (sayilarMap.containsKey(sayi)) {
				sayilarMap.put(sayi, sayilarMap.get(sayi) + 1);
//				sayilarMap.replace(sayi, sayilarMap.get(sayi) + 1);
			} else {
				sayilarMap.put(sayi, 1);
			}
		}
	}

	// TODO Ugurcan burada entryset kullanimini tam olarak anlamadigini, kullanirken
	// sikinti yasadigini belirtti.

	public void listeOlustur() {
//		for (Entry<Integer, Integer> sayi : sayilarMap.entrySet()) {
//			for (int i = 0; i < sayi.getValue(); i++) {
//				sayilarListesi.add(sayi.getKey());
//			}
//		}
		// Banu onayli calisan kod.
		sayilarMap.forEach((k, v) -> {
			for (int i = 0; i < v; i++) {
				sayilarListesi.add(k);
			}
		});
	}

	public boolean listeKontrol() {
		int toplamCikti = 0;

		for (Integer value : sayilarMap.values()) {
			toplamCikti += value;
		}
		return sayilarListesi.size() == toplamCikti;
	}

	public void sansliNumaralariBul() {
		Collections.shuffle(sayilarListesi);

		while (sansliNumaralar.size() < 10) {
			int index = Utility.randomSayiUret(0, sayilarListesi.size());
			sansliNumaralar.add(sayilarListesi.get(index));
			sayilarListesi.remove(index);
		}
	}
}
