package com.bilgeadam.week07.lecture003.footballapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mac {

	List<Takim> takimlar;
	int[] macSkoru;
	long sure; // mac 90.000 milisaniye surse, bu 90 saniye yapar.

	public Mac() {
		this.takimlar = new ArrayList<>();
		this.macSkoru = new int[2];
		this.sure = 90000;
		this.takimlar.add(new Takim("Ev Sahibi"));
		this.takimlar.add(new Takim("Deplasman"));
	}

	public Mac(List<Takim> takimlar) {
		this.takimlar = takimlar;
		this.macSkoru = new int[2];
		this.sure = setSure(90000);
	}

	public void mac() throws InterruptedException {
		System.out.println("Yazi tura atiliyor ve maca ... ");
		Thread.sleep(1000);
		Takim takim = yaziTura();
		System.out.println(takim.getAd() + " maca basliyor...");

		while (sure > System.currentTimeMillis()) {

			// oyna(takim);
//			takim = takimDegistir(takim);
			AktifFutbolcu futbolcu = oyna(takim);
			takim = golVurusu(futbolcu);

			System.out.println((sure - System.currentTimeMillis()) / 1000 + " saniye kaldi...");
		}
		System.out.println("-----------------");
		System.out.println("Mac sona erdi");
		skorGoster();
	}

	public AktifFutbolcu oyna(Takim takim) throws InterruptedException {

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
				Thread.sleep(1500);
			} else {
				System.out.println(
						takim.getAd() + " adli takimdan " + futbolcular.get(pasiVerecekOyuncu).getFormaNumarasi()
								+ " nolu oyuncunun pasi basarisiz oldu.");

				takim = takimDegistir2(takim);
				System.out.println("Top diğer takıma gecti");
				System.out.println();
				pasiVerecekOyuncu = pasKontrol(12);
				i = -1;
				Thread.sleep(1500);
			}

		}
//		golVurusu(takim.getFutbolcular().get(pasiVerecekOyuncu), takim);
		return takim.getFutbolcular().get(pasiVerecekOyuncu);
	}

	public Takim takimDegistir(Takim takim) throws InterruptedException {

		if (takimlar.get(0).equals(takim)) {
//			Thread.sleep(500);

//			System.out.println("Topa sahip olmasi gereken Takim : " + takimlar.get(1).getAd());
			System.out.println();
			// TODO Sysout ciktisi oldugu zaman hata ortadan kalkiyor.
			return takimlar.get(1);
		} else {
			System.out.println();
//			Thread.sleep(500);
//			System.out.println("Topa sahip olmasi gereken Takim : " + takimlar.get(0).getAd());
			return takimlar.get(0);
		}
	}

	public Takim takimDegistir2(Takim takim) {
		int takimIndex = takimlar.indexOf(takim);
		if (takimIndex == 1) {
			takimIndex = 0;
		} else {
			takimIndex = 1;
		}
		return takimlar.get(takimIndex);
	}

	public int pasKontrol(int index) {
		Random random = new Random();
		int oyuncuIndex = random.nextInt(10);
		while (index == oyuncuIndex) {
			oyuncuIndex = random.nextInt(10);
		}
		return oyuncuIndex;
	}

	public Takim golVurusu(AktifFutbolcu futbolcu) throws InterruptedException {
//		Kaleci kaleci = takimDegistir(takim).getKaleci();
		Takim takim = futbolcuTakiminiBul(futbolcu);
		Kaleci kaleci = takimDegistir(takim).getKaleci();
		System.out.println("SUUUUUT..!!!");
		System.out.println("Kaleci topa uzaniyor...");
		Thread.sleep(1500);
		if (futbolcu.sutCek(kaleci.kurtarisSkoru())) {
			System.out.println("Gol gol gol!!!!!");
			int takimIndex = takimlar.indexOf(takim);
			macSkoru[takimIndex] += 1;
			System.out.println(takim.getAd() + " adli takimdan " + futbolcu.getFormaNumarasi()
					+ " nolu futbolcu golu atiyor...!!! ");
			skorGoster();
		} else {
			System.out.println(takim.getAd() + " adli takimdan " + futbolcu.getFormaNumarasi()
					+ " nolu futbolcu golu kacirdi...!!! ");
		}
		return takimDegistir(takim);
	}

	public Takim futbolcuTakiminiBul(AktifFutbolcu futbolcu) {
		for (int i = 0; i < takimlar.get(0).getFutbolcular().size(); i++) {
			if (futbolcu.equals(takimlar.get(0).getFutbolcular().get(i))) {
				return takimlar.get(0);
			}
		}
		return takimlar.get(1);
	}

	public void skorGoster() {
		System.out.println("## MAC SKORU ##");
		System.out.println("==================");
		System.out.println(
				takimlar.get(0).getAd() + " : " + macSkoru[0] + " - " + macSkoru[1] + " : " + takimlar.get(1).getAd());

		System.out.println("==================");

	}

	public Takim yaziTura() {
		Random random = new Random();
		int index = random.nextInt(2);
		return takimlar.get(index);
	}

	public List<Takim> getTakimlar() {
		return takimlar;
	}

	public void setTakimlar(List<Takim> takimlar) {
		this.takimlar = takimlar;
	}

	public int[] getMacSkoru() {
		return macSkoru;
	}

	public void setMacSkoru(int[] macSkoru) {
		this.macSkoru = macSkoru;
	}

	public long getSure() {
		return sure;
	}

	public long setSure(long sure) {
		return this.sure = sure + System.currentTimeMillis();
	}
}
