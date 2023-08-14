package com.bilgeadam.week06.lecture003.interfaceornek;

public class Bisiklet extends Tasit implements IBinilebilir {

	@Override
	public void ilerle() {
		System.out.println("Bisiklet ilerliyor.");
		super.ilerle();
	}

	@Override
	public void dur() {
		System.out.println("Bisiklet durdu.");
		super.dur();
	}

	@Override
	public void bin() {
		System.out.println("Bisiklete binildi.");
	}

}
