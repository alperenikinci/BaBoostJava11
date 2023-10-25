package com.bilgeadam.week10.lecture005.interfacesegregation;

public abstract class SosyalMedya {

	private double kucultmeKatsayisi;

//	public void emailGonder(Kullanici kullanici) {
//		if (kullanici.getEmail() != null) {
//			Bildirim.emailGonder(kullanici.getEmail());
//		}
//	}
//
//	public void smsGonder(Kullanici kullanici) {
//		if (kullanici.getPhone() != null) {
//			Bildirim.smsGonder(kullanici.getPhone());
//		}
//	}

	public double getKucultmeKatsayisi() {
		return kucultmeKatsayisi;
	}

	public void setKucultmeKatsayisi(double kucultmeKatsayisi) {
		this.kucultmeKatsayisi = kucultmeKatsayisi;
	}

	public abstract void boyutlandirma(String type);

//	public abstract void postGonder();

//	public abstract void hikayePaylas();
//
//	public abstract void sohbetEt();
//
//	public abstract void resimPaylas();

//	public abstract void videoKonferansYap();
}
