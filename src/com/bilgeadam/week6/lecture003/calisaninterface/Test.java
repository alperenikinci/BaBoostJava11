package com.bilgeadam.week6.lecture003.calisaninterface;

public class Test {

	public static void main(String[] args) {
		OfisCalisani ofisCalisani = new OfisCalisani("Alperen", "Ikinci");
		System.out.println(ofisCalisani.getMaas());
		System.out.println(ofisCalisani.getUnvan());
		// 2 parametreli constructor setUnvan metodunu calistirmadigi icin null
		// donduruyor.

		OfisCalisani ofisCalisani2 = new OfisCalisani("Muhammet", "Kaya", 10000);
		System.out.println(ofisCalisani2.getMaas());
		System.out.println(ofisCalisani2.getUnvan());
		// 3 parametreli constructor setUnvan metodunu calistirdigi icin maas araligina
		// gore bir unvan donduruyor.

		Muhendis muhendis = new Muhendis("Alperen", "Ikinci");
		System.out.println(muhendis.getUnvan());
		System.out.println(muhendis.getMaas());

		Muhendis muhendis2 = new Muhendis("Muhammet", "Kaya", 15000);
		System.out.println(muhendis2.getUnvan());
		System.out.println(muhendis2.getMaas());
		// calisan.getClass().getSimpleName()
		System.out.println(muhendis2.getClass().getSimpleName());

		InsanKaynaklari insanKaynaklari = new InsanKaynaklari("Serli", "Cakir");

		insanKaynaklari.zamYap(muhendis2, 20);
		System.out.println(muhendis2.getMaas());
		insanKaynaklari.zamYap(ofisCalisani2, 10);
		System.out.println(ofisCalisani2.getMaas());
	}

}
