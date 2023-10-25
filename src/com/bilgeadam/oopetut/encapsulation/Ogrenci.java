package com.bilgeadam.oopetut.encapsulation;

public class Ogrenci {
	private static int idCounter = 0;
	private String ad;
	private int yas;
	private String bolum;
	private String tcKimlikNo;
	private int id;

	public Ogrenci() {
		idCounter = idCounter + 1;
		this.id = idCounter;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		if (yas < 0) {
			System.out.println("Yas 0'dan kücük olamaz. ");
			this.yas = 0;
		} else if (yas > 1000) {
			System.out.println("Bir insan bu kadar yasli olamaz.");
			this.yas = 0;
		} else {
			System.out.println("Yaşınız : " + yas);
			this.yas = yas;
		}
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", yas=" + yas + ", bolum=" + bolum + ", tcKimlikNo=" + tcKimlikNo + ", id=" + id
				+ "]";
	}

}
