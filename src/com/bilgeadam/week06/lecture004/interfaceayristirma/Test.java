package com.bilgeadam.week06.lecture004.interfaceayristirma;

public class Test {

	public static void main(String[] args) {
		Kopek kopek = new Kopek();
		kopek.yemekYe();
		kopek.suIc();
		kopek.kos();
		kopek.uyu();

		Kedi kedi = new Kedi();
		kedi.agacaTirman();
		kedi.yemekYe();
		kedi.suIc();
		kedi.kos();
		kedi.uyu();

		Kus kus = new Kus();
		kus.yemekYe();
		kus.suIc();
		kus.kos();
		kus.uyu();
		kus.uc();

	}
}
