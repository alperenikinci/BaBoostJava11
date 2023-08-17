package com.bilgeadam.week07.lecture003.footballapp;

import java.util.Random;

public class Defans extends AktifFutbolcu {

	private int pozisyonAlma;
	private int kafa;
	private int sicrama;

	public Defans(String adSoyad, int formaNumarasi) {
		super(adSoyad, formaNumarasi);
		this.pozisyonAlma = rastgeleYetenekPuani();
		this.kafa = rastgeleYetenekPuani();
		this.sicrama = rastgeleYetenekPuani();
	}

	@Override
	public int rastgeleYetenekPuani() {
		Random random = new Random();
		return random.nextInt(60, 91);
	}

	public int getPozisyonAlma() {
		return pozisyonAlma;
	}

	public void setPozisyonAlma(int pozisyonAlma) {
		this.pozisyonAlma = pozisyonAlma;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getSicrama() {
		return sicrama;
	}

	public void setSicrama(int sicrama) {
		this.sicrama = sicrama;
	}

	@Override
	public String toString() {
		return "Defans [pozisyonAlma=" + pozisyonAlma + ", kafa=" + kafa + ", sicrama=" + sicrama + ", getAdSoyad()="
				+ getAdSoyad() + ", getFormaNumarasi()=" + getFormaNumarasi() + ", getDayaniklilik()="
				+ getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut()
				+ ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik() + ", getDogalForm()="
				+ getDogalForm() + ", getSans()=" + getSans() + "]";
	}

	@Override
	public int pasSkor() {

		Random random = new Random();
		int bonus = random.nextInt(0, 5);

		return (int) (getPas() * 0.2 + getYetenek() * 0.2 + getDayaniklilik() * 0.1 + getDogalForm() * 0.1
				+ getPozisyonAlma() * 0.1 + getSans() * 0.2 + bonus);
	}

	@Override
	public int golSkoru(int kurtaris) {

		Random random = new Random();
		int bonus = (int) (random.nextInt(2, 6) * getDogalForm() * 0.075);

		return (int) (getYetenek() * 0.3 + getSut() * 0.2 + getKararlilik() * 0.1 + getSans() * 0.1 + getKafa() * 0.1
				+ getSicrama() * 0.1 + getDogalForm() * 0.1 + bonus - kurtaris);
	}

}
