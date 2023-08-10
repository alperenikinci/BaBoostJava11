package com.bilgeadam.week6.lecture003.calisaninterface;

//extends Calisan ->> is-a ilişkisi barındırır.
//implements IInsanKaynaklari ->> has-a ilişkisi barındırır.

public class InsanKaynaklari extends Calisan implements IInsanKaynaklari {

	public InsanKaynaklari(String isim, String soyisim) {
		super(isim, soyisim);
	}

	public InsanKaynaklari(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
	}

	@Override
	public void zamYap(Calisan calisan, double zamOrani) {
		double zamliUcret = calisan.getMaas() + (calisan.getMaas() * zamOrani / 100);

		if (calisan.getClass().getSimpleName().equals("Muhendis")) {
			zamliUcret += 250;
		}

//		if(calisan.getUnvan().contains("Muhendis")) {
//			zamliUcret+= 250;
//		}
		calisan.setMaas(zamliUcret);
		calisan.setUnvan(getMaas());
	}

	@Override
	public void unvanBelirle() {
		System.out.println("Unvan belirlendi.");
	}

}
