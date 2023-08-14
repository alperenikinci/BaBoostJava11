package com.bilgeadam.week07.lecture001.abstractionornek;

public class Motosiklet extends Tasit {

	@Override
	public void akrobatikHareketYap() {
		System.out.println("Motor on kaldiriyor...");
	}

	public Motosiklet(String marka, String model, int hiz, String vites) {
		super(marka, model, hiz, vites);
	}

	public Motosiklet() {
		super();
	}

}
