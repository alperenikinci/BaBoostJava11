package com.bilgeadam.oopetut.streams;

import java.util.List;

public class Ogrenci {

	private String ad;
	private int yas;
	private String bolum;
	private List<Integer> notlar;

	public Ogrenci(String ad, int yas, String bolum, List<Integer> notlar) {
		super();
		this.ad = ad;
		this.yas = yas;
		this.bolum = bolum;
		this.notlar = notlar;
	}

	public Ogrenci() {
		super();
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public List<Integer> getNotlar() {
		return notlar;
	}

	public void setNotlar(List<Integer> notlar) {
		this.notlar = notlar;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", yas=" + yas + ", bolum=" + bolum + ", notlar=" + notlar + "]";
	}

}
