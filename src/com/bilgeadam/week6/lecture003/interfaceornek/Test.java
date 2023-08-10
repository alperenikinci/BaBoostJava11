package com.bilgeadam.week6.lecture003.interfaceornek;

public class Test {

	public static void main(String[] args) {
		Araba araba = new Araba();

		araba.ilerle();
		System.out.println();

		Bisiklet bisiklet = new Bisiklet();
		bisiklet.bin();
		bisiklet.ilerle();

		System.out.println();
		Ucak ucak = new Ucak();
		ucak.ilerle();
		ucak.uc();

	}

}
