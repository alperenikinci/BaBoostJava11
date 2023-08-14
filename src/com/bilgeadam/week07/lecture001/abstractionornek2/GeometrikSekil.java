package com.bilgeadam.week07.lecture001.abstractionornek2;

public abstract class GeometrikSekil {

	private String renk;
	private final double PI = 3.14;

	public void ciz() {
		System.out.println("Cizilen sekil : " + renk + " renkli " + getClass().getSimpleName());
	}

	public GeometrikSekil(String renk) {
		super();
		this.renk = renk;
	}

	public GeometrikSekil() {
		super();
	}

	public abstract double alanHesapla();

	public abstract double cevreHesapla();

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public double getPI() {
		return PI;
	}

}
