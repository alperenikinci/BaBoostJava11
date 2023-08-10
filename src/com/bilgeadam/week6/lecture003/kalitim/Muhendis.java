package com.bilgeadam.week6.lecture003.kalitim;

public class Muhendis extends Calisan {

	public Muhendis(String isim, String soyisim) {
		super(isim, soyisim);
		setUnvan("Muhendis");
	}

	public Muhendis(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
		setUnvan(maas);
	}

	@Override
	public void setUnvan(double maas) {
		if (maas >= 17000) {
			setUnvan("Uzman Muhendis");
		} else if (maas >= 12000) {
			setUnvan("Kidemli Muhendis");
		} else if (maas >= 10000) {
			setUnvan("Muhendis");
		} else {
			setUnvan("Stajyer");
		}
	}

	@Override
	public double zamYap(double zamOrani) {
		setMaas(super.zamYap(zamOrani) + 250);
		setUnvan(getMaas());
		return getMaas();
	}

}
