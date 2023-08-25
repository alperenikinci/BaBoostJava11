package com.bilgeadam.week08.lecture005;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UrunManager {

	List<Urun> urunler = new ArrayList<>();

	static Scanner scanner = new Scanner(System.in);

	public Urun urunOlustur() {
		System.out.print("Urun adini giriniz : ");
		String urunAdi = scanner.nextLine();
		System.out.print("Urun fiyatini giriniz : ");
		int fiyat = Integer.parseInt(scanner.nextLine());
		System.out.print("Urun sktsini giriniz : ");
		int skt = Integer.parseInt(scanner.nextLine());

		if (urunAdi.isBlank() || fiyat <= 0) {
			return null;
		} else {
			return new Urun(urunAdi, fiyat, skt);
		}
	}

	public Optional<Urun> urunOlustur2() {
		System.out.print("Urun adini giriniz : ");
		String urunAdi = scanner.nextLine();
		System.out.print("Urun fiyatini giriniz : ");
		int fiyat = Integer.parseInt(scanner.nextLine());
		System.out.print("Urun sktsini giriniz : ");
		int skt = Integer.parseInt(scanner.nextLine());

		if (urunAdi.isBlank() || fiyat <= 0) {
			return Optional.empty();
		} else {

			return Optional.of(new Urun(urunAdi, fiyat, skt));
		}

	}

	public void urunEkle(Optional<Urun> urun) {

		if (urun.isPresent()) {
			urunler.add(urun.get());
		}
	}

	public void sonKulllanmaTarihiGecmisUrunleriListele(List<Urun> urunler) {
		urunler.stream().filter((x) -> x.getSkt() < 2023).forEach(System.out::println);

	}

//	for (Optional<Urun> urun : yeniUrunler) {
//	urun.map((x) -> {
//		x.setFiyat(x.getFiyat() * 2);
//		return x;
//	}).ifPresent(System.out::println);
//}

	public void zamYap(List<Urun> urunler) {
//		urunler.stream().filter((x) -> x.getSkt() > 2023).map((y)-> { y.setFiyat(y.getFiyat()*2);});

		urunler.stream().filter((x) -> x.getSkt() > 2023).map((y) -> {
			y.setFiyat(y.getFiyat() * 2);
			return y;
		}).forEach(System.out::println);
		;
	}

}
