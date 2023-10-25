package com.bilgeadam.oopetut.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Ogrenci> ogrenciler = new ArrayList<>();

		ogrenciler.add(new Ogrenci("Ahmet", 25, "Bilgisayar Muhendisligi", List.of(90, 85, 100)));
		ogrenciler.add(new Ogrenci("Ayse", 20, "Elektrik Muhendisligi", List.of(60, 70, 95)));
		ogrenciler.add(new Ogrenci("Ali", 18, "Bilgisayar Muhendisligi", List.of(83, 71, 97)));
		ogrenciler.add(new Ogrenci("Fatma", 23, "Makine Muhendisligi", List.of(71, 77, 91)));

		// Stream işlemleri

		// Map ile ogrenci nesnelerini sadece isimlerine donusturme.

		List<String> ogrenciIsimleri = ogrenciler.stream().map(Ogrenci::getAd).collect(Collectors.toList());
//		List<String> ogrenciIsimleri = ogrenciler.stream().map((ogrenci) -> ogrenci.getAd())
//				.collect(Collectors.toList());
//		Stream<String> ogrenciStream = ogrenciler.stream().map((ogrenci) -> ogrenci.getAd());

		System.out.println("Ogrenci Isimleri : ");
//		ogrenciIsimleri.forEach((isim) -> System.out.println(isim));
		ogrenciIsimleri.forEach(System.out::println);

		// Filter ile yaslari 21'den buyuk, 25'den kucuk olan ogrencileri sec
		List<Ogrenci> yasiBuyukOgrenciler = ogrenciler.stream()
				.filter((ogrenci) -> ogrenci.getYas() > 21 && ogrenci.getYas() < 25).collect(Collectors.toList());

		System.out.println("\n21 Yasindan buyuk, 25 yasindan kucuk ogrenciler : ");
		yasiBuyukOgrenciler.forEach(System.out::println);

		// Sorted ile ogrencileri yaslarina gore azalan sirada siralama
//		List<Ogrenci> siraliOgrenciler = ogrenciler.stream().sorted(Comparator.comparingInt(Ogrenci::getYas).reversed())
//				.collect(Collectors.toList());
		List<Ogrenci> siraliOgrenciler = ogrenciler.stream()
				.sorted((ogrenci1, ogrenci2) -> Integer.compare(ogrenci2.getYas(), ogrenci1.getYas()))
				.collect(Collectors.toList());

		System.out.println("\nYaslarina gore siralanmis ogrenciler(Azalan)");
		siraliOgrenciler.forEach(System.out::println);

		// Collect ile ogrenciler bolumlerine gore gruplama
		Map<String, List<Ogrenci>> bolumGruplari = ogrenciler.stream()
				.collect(Collectors.groupingBy(Ogrenci::getBolum));

		bolumGruplari.forEach((bolum, bolumdekiOgrenciler) -> {
			System.out.println("\nBolum : " + bolum);
			System.out.println("Ogrenciler : ");
			bolumdekiOgrenciler.forEach(System.out::println);
		});

		// Reduce ile en yasli ogrenciyi bul
		Optional<Ogrenci> enYasliOgrenci = ogrenciler.stream()
				.reduce((ogrenci1, ogrenci2) -> ogrenci1.getYas() > ogrenci2.getYas() ? ogrenci1 : ogrenci2);
		System.out.println("\n" + enYasliOgrenci);

		// Ogrencilerin ortalama yasini bulalim
		double ortalamaYas = ogrenciler.stream().collect(Collectors.averagingDouble(Ogrenci::getYas));
		System.out.println("\n" + ortalamaYas);

		// Ogrencileri not ortalamalarıyla eşleştirme
//		Map<Ogrenci, Double> ogrencilerVeNotOrtalamalari = ogrenciler.stream().collect(Collectors.toMap(
//				ogrenci -> ogrenci,
//				ogrenci -> ogrenci.getNotlar().stream().collect(Collectors.averagingDouble(Integer::doubleValue))));

//		Map<Ogrenci, Double> ogrencilerVeNotOrtalamalari = ogrenciler.stream().collect(Collectors.toMap(
//				ogrenci -> ogrenci,
//				ogrenci -> ogrenci.getNotlar().stream().mapToDouble(Integer::doubleValue).average().orElse(0.0)));

		// TODO return kısmına bak.
		Map<Ogrenci, Double> ogrencilerVeNotOrtalamalari = ogrenciler.stream()
				.collect(Collectors.toMap(ogrenci -> ogrenci, ogrenci -> {
					double notOrtalamasi = ogrenci.getNotlar().stream().mapToDouble(Integer::doubleValue).average()
							.orElse(0.0);
					return notOrtalamasi;
				}));
		ogrencilerVeNotOrtalamalari.forEach((k, v) -> {
			System.out.println("Ogrenci : " + k.getAd() + " Not Ortalamasi " + v);
		});
	}

}
