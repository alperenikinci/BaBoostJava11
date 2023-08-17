package com.bilgeadam.week07.lecture003.footballapp;

import java.util.ArrayList;
import java.util.List;

public class Takim implements ITakim {

	private String ad;
	List<AktifFutbolcu> futbolcular;
	private Kaleci kaleci;

	public Takim(String ad) {
		this.futbolcular = new ArrayList<>();
		this.ad = ad;
		this.kaleci = new Kaleci("Kaleci", 1);
		defansOlustur();
		ortasahaOlustur();
		forvetOlustur();

	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public List<AktifFutbolcu> getFutbolcular() {
		return futbolcular;
	}

	public void setFutbolcular(List<AktifFutbolcu> futbolcular) {
		this.futbolcular = futbolcular;
	}

	public Kaleci getKaleci() {
		return kaleci;
	}

	public void setKaleci(Kaleci kaleci) {
		this.kaleci = kaleci;
	}

	@Override
	public String toString() {
		return "Takim [ad=" + ad + ", futbolcular=" + futbolcular + ", kaleci=" + kaleci + "]";
	}

	@Override
	public void defansOlustur() {
		for (int i = 0; i < 4; i++) {
			Defans defans = new Defans("Defans " + (i + 1), (i + 2));
			futbolcular.add(defans);
		}
	}

	@Override
	public void ortasahaOlustur() {
		for (int i = 0; i < 4; i++) {
			Ortasaha ortasaha = new Ortasaha("Ortasaha " + (i + 1), (i + 6));
			futbolcular.add(ortasaha);
		}
	}

	@Override
	public void forvetOlustur() {
		for (int i = 0; i < 2; i++) {
			Forvet forvet = new Forvet("Forvet " + (i + 1), (i + 10));
			futbolcular.add(forvet);
		}
	}

}
