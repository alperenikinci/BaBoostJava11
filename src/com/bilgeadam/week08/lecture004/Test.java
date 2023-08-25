package com.bilgeadam.week08.lecture004;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		SansliNumaralar sansliNumaralar = new SansliNumaralar();
		sansliNumaralar.mapOlustur();
		sansliNumaralar.listeOlustur();

		sansliNumaralar.sayilarMap.forEach((k, v) -> System.out.println(k + " = " + v));
//		sansliNumaralar.sayilarListesi.forEach(System.out::println);
		System.out.println(sansliNumaralar.listeKontrol());
		sansliNumaralar.sansliNumaralariBul();
		int i = 1;
		for (Integer sansliNumara : sansliNumaralar.sansliNumaralar) {
			System.out.println(i + ". Sansli numaramiz : " + sansliNumara);
			i++;
		}

		System.out.println("50'den buyuk olan sansli numaralar : "); // Stream ile getirin.
		sansliNumaralar.sansliNumaralar.stream().filter((number) -> number > 50).forEach(System.out::println);
		System.out.println("50'den buyuk olan sayilarin yeni bir listeye yazalım.");
		List<Integer> list = sansliNumaralar.sansliNumaralar.stream().filter((number) -> number > 50)
				.collect(Collectors.toList());
		System.out.println(list);
		System.out.println("Sansli sayilarin toplami : "); // Stream ile getirin.
		System.out.println(sansliNumaralar.sansliNumaralar.stream().reduce((x, y) -> x + y));

		Optional<Integer> toplam = sansliNumaralar.sansliNumaralar.stream().reduce((x, y) -> x + y);

		System.out.println("50'den buyuk sayilarin toplamini bir toplam2 degiskenine esitleyip yazdiralim.");

		Optional<Integer> toplam2 = sansliNumaralar.sansliNumaralar.stream().filter((x) -> x > 50)
				.reduce((x, y) -> x + y);

//		Integer toplam2 = sansliNumaralar.sansliNumaralar.stream().filter((x) -> x > 50).reduce((x, y) -> x + y).get();

//		toplam2.ifPresent(System.out::println);
		System.out.println(toplam2); // toplam2.get() diyerek optional'dan kurtulmak mümkün.
		sansliNumaralar.sansliNumaralar.stream().filter((x) -> x > 50).reduce((x, y) -> x + y)
				.ifPresent(System.out::println);
//		Integer[] sayilar = new Integer[sansliNumaralar.sansliNumaralar.size()];
//		int j = 0;
//		for (Integer sayi : sansliNumaralar.sansliNumaralar) {
//			sayilar[j] = sayi;
//			j++;
//		}
//		int toplam = 0;
//		for (int k = 0; k < sayilar.length; k++) {
//			int sayi = sayilar[k];
//			toplam = toplam + sayi;
//		}
//		System.out.println("Toplam " + toplam);

		// Optional metotlari

		Integer toplam3 = toplam2.get();
		Optional<String> kelime = Optional.empty();
//		String kelime2 = kelime.get(); //NoSuchElementException
		Optional<String> kelime3 = kelime;
		System.out.println(kelime3);
		System.out.println(toplam3);

		Optional<String> kelime4 = Optional.ofNullable(null); // Cok kullanilir
		System.out.println(kelime4);

		Optional<String> kelime5 = Optional.of("Merhaba Dunya");
		System.out.println(kelime5.get());

		System.out.println(kelime4.isEmpty());// isEmpty isPresent
		System.out.println(kelime4.isPresent());// Cok kullanilir.
	}

}
