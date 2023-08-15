package com.bilgeadam.week07.lecture001.enumornek;

/*
 * 
 * boyutSec()
 * hamurTipiSec()
 * turSec()
 * 
 */
public class PizzaSiparis {

	public void menu() {
		System.out.println("Pizza Siparis Menusu");
		Pizza pizza = pizzaSec();
		siparisHazirla(pizza);
	}

	private void siparisHazirla(Pizza pizza) {
		System.out.println(pizza.toString());
		System.out.println("Siparisiniz hazirlaniyor...");
	}

	public Pizza pizzaSec() {
		EBoyut boyut = boyutSec();
		EHamurTipi hamurTipi = hamurTipiSec();
		ETur tur = turSec();
		double fiyat = 0;

		Pizza pizza = new Pizza(boyut, hamurTipi, tur, fiyat);
		return pizza;

	}

	public EBoyut boyutSec() {
		for (EBoyut boyut : EBoyut.values()) {
			System.out.println(boyut.ordinal() + 1 + " - " + boyut);
		}
		int secim = Utility.intDegerAlma("Lutfen pizza boyutunu seciniz : ");

		switch (secim) {
		case 1:
//			System.out.println("kücük");
			return EBoyut.KUCUK;
		case 2:
//			System.out.println("orta");
			return EBoyut.ORTA;
		case 3:
//			System.out.println("büyük");
			return EBoyut.BUYUK;
		default:
			System.err.println("yanlis secim yaptiniz");
			return null;
		}
	}

	public EHamurTipi hamurTipiSec() {
		for (EHamurTipi hamurTipi : EHamurTipi.values()) {
			System.out.println(hamurTipi.ordinal() + 1 + " - " + hamurTipi);
		}
		int secim = Utility.intDegerAlma("Lutfen hamur tipi seciniz : ");

		switch (secim) {
		case 1:
//			System.out.println("ince");
			return EHamurTipi.INCE;
		case 2:
//			System.out.println("normal");
			return EHamurTipi.NORMAL;
		case 3:
//			System.out.println("kalin");
			return EHamurTipi.KALIN;
		default:
			System.err.println("Yanlis secim yaptiniz");
			return null;
		}
	}

	public ETur turSec() {
		for (ETur tur : ETur.values()) {
			System.out.println(tur.ordinal() + 1 + " - " + tur);
		}
		int secim = Utility.intDegerAlma("Lutfen pizza turu seciniz : ");

		return ETur.values()[secim - 1];
	}

}
