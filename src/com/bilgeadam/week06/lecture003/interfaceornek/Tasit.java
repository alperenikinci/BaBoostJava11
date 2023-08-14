package com.bilgeadam.week06.lecture003.interfaceornek;

public class Tasit implements IHareket {

	@Override
	public void ilerle() {
		System.out.println("Tekerler donmeye basladi");

	}

	@Override
	public void dur() {
		System.out.println("Tasit durdu.");
	}

}
