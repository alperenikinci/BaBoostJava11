package com.bilgeadam.week6.lecture003.calisaninterface;

public class Muhendis extends Calisan implements ISahaCalismasiYapabilir {

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
			setUnvan("Stajyer Muhendis");
		}
	}

	@Override
	public double zamYap(double zamOrani) {
		setMaas(super.zamYap(zamOrani) + 250);
		setUnvan(getMaas());
		return getMaas();
	}

	@Override
	public void sahaCalismasiYap() {
		System.out.println("Saha calismasi yapiliyor. ");
	}

}
