package com.bilgeadam.week07.lecture003.footballapp;

import java.util.Random;

public class Forvet extends Futbolcu {

	private int bitiricilik;
	private int ilkDokunus;
	private int kafa;
	private int ozelYetenek;

	public Forvet(String adSoyad, int formaNumarasi) {
		super(adSoyad, formaNumarasi);
		this.bitiricilik = rastgeleYetenekPuani();
		this.ilkDokunus = rastgeleYetenekPuani();
		this.kafa = rastgeleYetenekPuani();
		this.ozelYetenek = rastgeleYetenekPuani();
	}

	@Override
	public int rastgeleYetenekPuani() {
		Random random = new Random();
		return random.nextInt(70, 101);
	}

	public int getBitiricik() {
		return bitiricilik;
	}

	public void setBitiricik(int bitiricik) {
		this.bitiricilik = bitiricik;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

	@Override
	public String toString() {
		return "Forvet [bitiricilik=" + bitiricilik + ", ilkDokunus=" + ilkDokunus + ", kafa=" + kafa + ", ozelYetenek="
				+ ozelYetenek + ", getAdSoyad()=" + getAdSoyad() + ", getFormaNumarasi()=" + getFormaNumarasi()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + "]";
	}

}
