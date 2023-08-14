package com.bilgeadam.week04.metotlaretut;

public class Question1 {
	/*
	 * Ali =>> {15,20,8,50,30} Veli =>> {5,15} Ayşe =>> {100,50,10,15,20,30,50}
	 * 
	 * 
	 */
	public static void main(String[] args) {

//		int total = 0;
//		for (int i = 0; i < ali.length; i++) {
//
//			total += ali[i];
//		}
//		System.out.println(total);
//		total = 0;
//
//		for (int i = 0; i < veli.length; i++) {
//
//			total += veli[i];
//		}
//		System.out.println(total);
//		total = 0;
//
//		for (int i = 0; i < ayse.length; i++) {
//
//			total += ayse[i];
//		}
//		System.out.println(total);
//		int aliAdisyon = adisyon(ali);
//		adisyon(veli);
//		adisyon(ayse);
//
//		double taxRate = 0.18;
//
//		double AliNetAdisyon = (aliAdisyon * taxRate) + aliAdisyon;
//		System.out.println(AliNetAdisyon);
//		System.out.println(vergiMiktarıHesapla(aliAdisyon));
//		
//		System.out.println(ikiSayiTopla(aliAdisyon, vergiMiktarıHesapla(aliAdisyon)));

		int[] ali = { 15, 150, 8, 50, 30 };
		int[] veli = { 5, 15, 50, -60 };
		int[] ayse = { 100, 50, 10, 15, 20, 30, 50 };

		System.out.println(ikiSayiTopla(adisyon(ali), vergiMiktarıHesapla(adisyon(ali))));
		System.out.println(ikiSayiTopla(adisyon(veli), vergiMiktarıHesapla(adisyon(veli))));
		System.out.println(ikiSayiTopla(adisyon(ayse), vergiMiktarıHesapla(adisyon(ayse))));
	}

	public static int adisyon(int[] fis) {
		int total = 0;
		for (int i = 0; i < fis.length; i++) {
			total += fis[i];
		}
//		System.out.println(total);
		return total;
	}

	public static double vergiMiktarıHesapla(int fiyat) {
		double taxRate = 0.1;
		return taxRate * fiyat;
	}

	public static double ikiSayiTopla(int fiyat, double vergiliKisim) {
		return fiyat + vergiliKisim;

	}

}
