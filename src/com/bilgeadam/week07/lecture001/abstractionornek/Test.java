package com.bilgeadam.week07.lecture001.abstractionornek;

/*
 * 
 * Tasit superclass'im olacak. Bu class abstract bir sinif olacak.
 * 
 * marka
 * model
 * maksHiz
 * vites
 * hizlan();
 * frenYap();
 * vitesDegistir();
 * ozellikleriGoster();
 * akrobatikHareketYap();
 * 
 * Bu tasit sinifindan miras alan araba ve motosiklet isimli iki sınıf olusturalim.
 */

public class Test {

	public static void main(String[] args) {

		Araba araba = new Araba();
		Araba araba2 = new Araba("BMW", "5.20", 0, "N");
		Motosiklet motosiklet = new Motosiklet();
		Motosiklet motosiklet2 = new Motosiklet("Ducati", "848", 50, "1");

		motosiklet.setMarka("Ducati");
		motosiklet.setModel("848");
		motosiklet.setHiz(50);
		motosiklet.setVites("1");

		araba2.ozellikleriGoster();
		araba2.vitesDegistir("1");
		araba2.hizlan();
		araba2.hizlan();
		araba2.frenYap();

		System.out.println();
		araba2.ozellikleriGoster();
		araba2.akrobatikHareketYap();

		System.out.println();
		motosiklet.ozellikleriGoster();
		motosiklet.vitesDegistir("2");
		motosiklet.hizlan();
		motosiklet.hizlan();
		motosiklet.hizlan();
		motosiklet.hizlan();

		System.out.println();
		motosiklet.ozellikleriGoster();
		motosiklet.akrobatikHareketYap();

	}

}
