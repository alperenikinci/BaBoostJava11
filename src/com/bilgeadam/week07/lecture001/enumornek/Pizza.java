package com.bilgeadam.week07.lecture001.enumornek;

public class Pizza {

	private EBoyut boyut;
	private EHamurTipi hamurTipi;
	private ETur pizzaTuru;
	private double fiyat;

	public Pizza(EBoyut boyut, EHamurTipi hamurTipi, ETur pizzaTuru, double fiyat) {
		super();
		this.boyut = boyut;
		this.hamurTipi = hamurTipi;
		this.pizzaTuru = pizzaTuru;
		this.fiyat = fiyat;
	}

	public Pizza() {
		super();
	}

	public EBoyut getBoyut() {
		return boyut;
	}

	public void setBoyut(EBoyut boyut) {
		this.boyut = boyut;
	}

	public EHamurTipi getHamurTipi() {
		return hamurTipi;
	}

	public void setHamurTipi(EHamurTipi hamurTipi) {
		this.hamurTipi = hamurTipi;
	}

	public ETur getPizzaTuru() {
		return pizzaTuru;
	}

	public void setPizzaTuru(ETur pizzaTuru) {
		this.pizzaTuru = pizzaTuru;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "Pizza [boyut=" + boyut + ", hamurTipi=" + hamurTipi + ", pizzaTuru=" + pizzaTuru + ", fiyat=" + fiyat
				+ "]";
	}

}
