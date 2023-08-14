package com.bilgeadam.week06.lecture004.polymorphism;

public class Kedi extends Hayvan implements IMiyavlayabilir {

	@Override
	public void sesCikar() {

		System.out.println("Miyavvv");

	}

	@Override
	public void miyavla() {
		System.out.println("Miyavvv");
	}

	@Override
	public void temizlen() {
		System.out.println("Temizleniyor");
	}

}
