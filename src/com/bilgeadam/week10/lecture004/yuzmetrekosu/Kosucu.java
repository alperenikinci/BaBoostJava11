package com.bilgeadam.week10.lecture004.yuzmetrekosu;

import java.util.Random;

public class Kosucu extends Thread {

	String isim;
	int mesafe;
	long baslangicZamani;
	double sure;

	public Kosucu(String isim, long baslangicZamani) {
		super();
		this.isim = isim;
		this.mesafe = 0;
		this.sure = 0.0;
		this.baslangicZamani = baslangicZamani;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMesafe() {
		return mesafe;
	}

	public void setMesafe(int mesafe) {
		this.mesafe = mesafe;
	}

	public long getBaslangicZamani() {
		return baslangicZamani;
	}

	public void setBaslangicZamani(long baslangicZamani) {
		this.baslangicZamani = baslangicZamani;
	}

	public double getSure() {
		return sure;
	}

	public void setSure(long sure) {
		this.sure = sure;
	}

	@Override
	public void run() {
		Random random = new Random();
		while (mesafe < 100) {
			mesafe++;
			try {
				Thread.sleep(random.nextLong(70, 121));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (mesafe % 10 == 0) {
				System.out.println(isim + " adli kosucu " + mesafe + ". metrede");
			}
		}
		long bitisZamani = System.currentTimeMillis();
		this.sure = (bitisZamani - baslangicZamani) / 1000.0;
		System.out.println(isim + " adli kosucu yarisi " + sure + " saniyede bitirdi.");
	}

	@Override
	public String toString() {
		return "Kosucu [isim=" + isim + ", mesafe=" + mesafe + ", baslangicZamani=" + baslangicZamani + ", sure=" + sure
				+ "]";
	}

}
