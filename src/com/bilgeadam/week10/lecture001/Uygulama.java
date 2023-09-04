package com.bilgeadam.week10.lecture001;

public class Uygulama {

	/*
	 * 
	 * 1- bir yukYeriSec() metodumuz olsun. Bu metot limandaki yukler array'inden
	 * bir yer belirlesin. Eger array sinirlarinin disinda kalirsam hata versin.
	 * 
	 * 
	 */

	Liman liman;

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		uygulama.yukYeriSec();

	}

	private void yukYeriSec() {
		int deger = Utility.intDegerAlma("Lutfen bir yuk yeri seciniz : ");
		try {
			Yuk yuk = liman.getYukler()[deger];

		} catch (NullPointerException e) {
			System.out.println("Su an herhangi bir yuk yeri bulunamamaktadir.");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Lutfen gecerli bir yuk yeri giriniz.");
		}
	}

}
