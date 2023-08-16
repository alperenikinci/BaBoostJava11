package com.bilgeadam.week07.lecture003.footballapp;

import java.util.Random;

public class Defans extends Futbolcu {

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

}
