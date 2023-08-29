package com.bilgeadam.week09.lecture002.sepet;

public enum EUrun {

	CIPS(20.0), KOLA(25D), SEKER(30.0), YAG(35.0), UN(40.0), EKMEK(45.0), CAY(50.0), YUMURTA(55.0), YOGURT(60.0),
	SUT(65.0);

	private Double fiyat;

	private EUrun(Double fiyat) {
		this.fiyat = fiyat;
	}

	public Double getFiyat() {
		return fiyat;
	}

	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}

}
