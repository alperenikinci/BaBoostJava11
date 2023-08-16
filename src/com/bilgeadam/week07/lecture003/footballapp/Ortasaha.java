package com.bilgeadam.week07.lecture003.footballapp;

import java.util.Random;

public class Ortasaha extends Futbolcu {

	private int uzunTop;
	private int ilkDokunus;
	private int topSurme;
	private int uretkenlik;
	private int ozelYetenek;

	public Ortasaha(String adSoyad, int formaNumarasi) {
		super(adSoyad, formaNumarasi);
		this.uzunTop = rastgeleYetenekPuani();
		this.ilkDokunus = rastgeleYetenekPuani();
		this.topSurme = rastgeleYetenekPuani();
		this.uretkenlik = rastgeleYetenekPuani();
		this.ozelYetenek = rastgeleYetenekPuani();
	}

	@Override
	public int rastgeleYetenekPuani() {
		Random random = new Random();
		return random.nextInt(60, 101);
	}

	public int getUzunTop() {
		return uzunTop;
	}

	public void setUzunTop(int uzunTop) {
		this.uzunTop = uzunTop;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getTopSurme() {
		return topSurme;
	}

	public void setTopSurme(int topSurme) {
		this.topSurme = topSurme;
	}

	public int getUretkenlik() {
		return uretkenlik;
	}

	public void setUretkenlik(int uretkenlik) {
		this.uretkenlik = uretkenlik;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

	@Override
	public String toString() {
		return "Ortasaha [uzunTop=" + uzunTop + ", ilkDokunus=" + ilkDokunus + ", topSurme=" + topSurme
				+ ", uretkenlik=" + uretkenlik + ", ozelYetenek=" + ozelYetenek + ", getAdSoyad()=" + getAdSoyad()
				+ ", getFormaNumarasi()=" + getFormaNumarasi() + ", getDayaniklilik()=" + getDayaniklilik()
				+ ", getHiz()=" + getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()="
				+ getYetenek() + ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm()
				+ ", getSans()=" + getSans() + "]";
	}

}
