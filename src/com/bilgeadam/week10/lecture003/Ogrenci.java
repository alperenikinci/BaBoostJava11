package com.bilgeadam.week10.lecture003;

public class Ogrenci {

	private String name;
	private double ort;

	public Ogrenci(String name) {
		super();
		this.name = name;
	}

	public Ogrenci(String name, double ort) {
		super();
		this.name = name;
		this.ort = ort;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getOrt() {
		return ort;
	}

	public void setOrt(double ort) {
		this.ort = ort;
	}

	@Override
	public String toString() {
		return "Ogrenci [name=" + name + ", ort=" + ort + "]";
	}

}
