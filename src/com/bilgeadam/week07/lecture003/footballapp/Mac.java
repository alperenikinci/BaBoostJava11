package com.bilgeadam.week07.lecture003.footballapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mac {

	List<Takim> takimlar;
	int[] macSkoru;

	public Mac() {
		this.takimlar = new ArrayList<>();
		this.macSkoru = new int[2];
		this.takimlar.add(new Takim("Ev Sahibi"));
		this.takimlar.add(new Takim("Deplasman"));
	}

	public void oyna(Takim takim) {

		int pasiVerecekOyuncu = pasKontrol(12);

		for (int i = 0; i < 3; i++) {
			List<AktifFutbolcu> futbolcular = takim.getFutbolcular();
			if (futbolcular.get(pasiVerecekOyuncu).pasVer()) {
				int pasAlacakOyuncuIndex = pasKontrol(pasiVerecekOyuncu);
				System.out.println(takim.getAd() + " adli takimdan "
						+ futbolcular.get(pasiVerecekOyuncu).getFormaNumarasi() + " nolu oyuncu "
						+ futbolcular.get(pasAlacakOyuncuIndex).getFormaNumarasi() + " nolu oyuncuya pas atiyor.");
				System.out.println();
				pasiVerecekOyuncu = pasAlacakOyuncuIndex;

			} else {
				System.out.println(
						takim.getAd() + " adli takimdan " + futbolcular.get(pasiVerecekOyuncu).getFormaNumarasi()
								+ " nolu oyuncunun pasi basarisiz oldu.");

				takim = takimDegistir(takim);
				System.out.println("Top diğer takıma gecti");
				System.out.println();
				pasiVerecekOyuncu = pasKontrol(12);
				i = -1;
			}
		}
		System.out.println("Gol Vuruşu Yapılıyor.");

	}

	public Takim takimDegistir(Takim takim) {

		if (takimlar.get(0).equals(takim)) {
			return takimlar.get(1);
		} else {
			return takimlar.get(0);
		}
	}

	public int pasKontrol(int index) {
		Random random = new Random();
		int oyuncuIndex = random.nextInt(10);
		while (index == oyuncuIndex) {
			oyuncuIndex = random.nextInt(10);
		}
		return oyuncuIndex;
	}
}
