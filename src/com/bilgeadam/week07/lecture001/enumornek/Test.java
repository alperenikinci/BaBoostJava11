package com.bilgeadam.week07.lecture001.enumornek;

public class Test {

	public static void main(String[] args) {

//		Pizza pizza = new Pizza();
//		pizza.setBoyut(EBoyut.KUCUK);
//		pizza.setHamurTipi(EHamurTipi.KALIN);
//		pizza.setPizzaTuru(ETur.TAVUKLU);
//		pizza.setFiyat(50);

//		Pizza pizza = new Pizza(EBoyut.KUCUK, EHamurTipi.KALIN, ETur.TAVUKLU, 50);
//
//		System.out.println(pizza.toString());
		/*
		 * 
		 * private EBoyut boyut; private EHamurTipi hamurTipi; private ETur pizzaTuru;
		 * private double fiyat;
		 * 
		 */

//		String isim = Utility.stringDegerAlma("Lutfen bir kelime giriniz : ");

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Lutfen bir kelime giriniz : ");
//		String isim = scanner.nextLine();

//		System.out.println(isim);

//		ETur.values(); // enum'un degerlerinin hepsine erisir.

//		Pizza pizza2 = new Pizza();

//		int secim = 2;
//		for (ETur tur : ETur.values()) {
//			System.out.println(tur.ordinal() + 1 + " - " + tur);
//
//		}
//
//		switch (secim) {
//		case 1:
//		case 2:
//		case 3:
//		}

		PizzaSiparis pizzaSiparis = new PizzaSiparis();
		pizzaSiparis.menu();
//		pizzaSiparis.boyutSec();
//		pizzaSiparis.hamurTipiSec();
//		pizzaSiparis.turSec();

	}

}
