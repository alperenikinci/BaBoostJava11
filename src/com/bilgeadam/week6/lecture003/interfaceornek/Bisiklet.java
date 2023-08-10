package com.bilgeadam.week6.lecture003.interfaceornek;

public class Bisiklet extends Tasit {

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

}
