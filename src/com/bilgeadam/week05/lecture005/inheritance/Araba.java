package com.bilgeadam.week05.lecture005.inheritance;

public class Araba extends MotorluTasit {
	private int kapiSayisi;

	public void vitesDegistir() {
		System.out.println("Arabanin vitesi degistirildi. ");
	}

	public void farlariAc() {
		System.out.println("Arabanin farlari acildi. ");
	}

	public int getKapiSayisi() {
		return kapiSayisi;
	}

	public void setKapiSayisi(int kapiSayisi) {
		this.kapiSayisi = kapiSayisi;
	}

	public Araba() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Araba(int kapiSayisi) {
		super();
		this.kapiSayisi = kapiSayisi;
	}

	public Araba(String marka, String color, int km) {
		super(marka, color, km);

		// TODO Auto-generated constructor stub
	}

	public Araba(String marka, String color, int km, int kapiSayisi) {
		super(marka, color, km);
		this.kapiSayisi = kapiSayisi;
	}

	@Override
	public String toString() {
		return "Araba [kapiSayisi=" + kapiSayisi + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void calistir() {
		System.out.println("Arac calistirildi");

	}

	@Override
	public void durdur() {
		System.out.println("Arac durduruldu.");
	}

	@Override
	public void hizlan() {
		System.out.println("Arac hizlaniyor.");
	}

}
