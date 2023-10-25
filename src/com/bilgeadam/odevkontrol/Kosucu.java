package com.bilgeadam.odevkontrol;

import java.util.Random;

public class Kosucu implements Runnable {

	private String isim;
	private int mesafe;
	private long sure;
	private long baslangicZamani;

	@Override
	public void run() {
		Yaris yaris = new Yaris();
		System.out.println(isim + " yarisa basladi.");
		baslangicZamani = System.currentTimeMillis();
		Random random = new Random();
		while (mesafe < 100) {
			mesafe += random.nextInt(5);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		long bitisZamani = System.currentTimeMillis();
		sure = (bitisZamani - baslangicZamani) / 1000;
		System.out.println(isim + " yarışı " + sure + " saniyede tamamladı.");

	}

	public Kosucu(String isim) {
		this.isim = isim;
		this.mesafe = 0;
		this.sure = 0;

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

	public long getSure() {
		return sure;
	}

	public void setSure(long sure) {
		this.sure = sure;
	}

	public long getBaslangicZamani() {
		return baslangicZamani;
	}

	public void setBaslangicZamani(long baslangicZamani) {
		this.baslangicZamani = baslangicZamani;
	}

	@Override
	public String toString() {
		return "Runner [isim=" + isim + ", mesafe=" + mesafe + ", sure=" + sure + ", baslangicZamani=" + baslangicZamani
				+ "]";
	}
//	public void siralamaVeSureleriYazdir() {
//		
//		Collections.sort(Yaris.kosucular,(x,y) -> Long.compare(x.sure, y.sure));
//		System.out.println("Yaris tamamlandi. Siralama ve sureler:");
//		for(int i =0;i<Yaris.kosucular.size();i++) {
//			Kosucu kosucu = Yaris.kosucular.get(i);
//			System.out.println((i + 1) + ". " + kosucu.isim + ": " + kosucu.sure + " saniye");
//		}
//		
//
//	}

}