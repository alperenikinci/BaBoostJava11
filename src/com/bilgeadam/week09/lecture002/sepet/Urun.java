package com.bilgeadam.week09.lecture002.sepet;

public class Urun {

	private String isim;
	private Double fiyat;

	public Urun() {
		super();
	}

	public Urun(String isim, Double fiyat) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Double getFiyat() {
		return fiyat;
	}

	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "Urun [isim=" + isim + ", fiyat=" + fiyat + "]";
	}

}
