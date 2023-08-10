package com.bilgeadam.week6.lecture003.calisaninterface;

public class OfisCalisani extends Calisan {

	public OfisCalisani(String isim, String soyisim) {
		super(isim, soyisim);
		setMaas(8000);
	}

	public OfisCalisani(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
		setUnvan(maas);
	}

	@Override
	public void setUnvan(double maas) {
		if (maas >= 12000) {
			setUnvan("Kidemli Calisan");
		} else if (maas >= 8000) {
			setUnvan("Calisan");
		} else {
			setUnvan("Stajyer");
		}
	}

}
