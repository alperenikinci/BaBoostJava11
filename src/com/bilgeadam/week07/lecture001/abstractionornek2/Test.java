package com.bilgeadam.week07.lecture001.abstractionornek2;

/*
 * Bir Daire ve Kare sinifi olusturalim.
 * Bu siniflarin miras alabilecegi bir superclass olusturalim. 
 * (Encapsulation, Abstraction ve Polymorphism konseptlerinden faydalanalim)
 * 
 * Butun geometrik sekillerin birer rengi ve geometrik seklin alanini 
 * ve cevresini hesaplamak icin gerekekli parametreleri(Fieldlari) olacak.
 * 
 * Butun geometrik sekilleri ciz() isimli bir metot ile cizebilmek istiyorum.
 * 
 * Sekillerin alanlarini ve cevrelerini hesaplayabilmek istiyorum.
 * 
 * Ipucu: Daire icin yaricap, kare icin tek bir kenar olcusu yeterli olacaktir.
 * 
 * Pi'yi 3.14 alalim. (final kullanabiliriz).
 * 
 * 
 */

public class Test {

	public static void main(String[] args) {
		Daire daire = new Daire();
		daire.setRenk("Sari");
		daire.setYaricap(3);
		System.out.println(daire.alanHesapla());
		System.out.println(daire.cevreHesapla());
		daire.ciz();
		System.out.println();
		Kare kare = new Kare();
		kare.setRenk("Lacivert");
		kare.setKenarUzunlugu(5);
		System.out.println(kare.alanHesapla());
		System.out.println(kare.cevreHesapla());
		kare.ciz();
		System.out.println();

		Daire daire2 = new Daire("Mor", 13);

		System.out.println(daire2.alanHesapla());
		System.out.println(daire2.cevreHesapla());
		daire2.ciz();

	}

}
