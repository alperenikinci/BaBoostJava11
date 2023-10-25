package com.bilgeadam.odevkontrol;

import java.util.ArrayList;
import java.util.List;

public class Yaris {

	List<Kosucu> kosucular;
	long baslangicZamani;

	public Yaris() {
		super();
		this.kosucular = new ArrayList<Kosucu>();
		this.baslangicZamani = System.currentTimeMillis();
		kosucuOlustur();
	}

	public List<Kosucu> getKosucular() {
		return kosucular;
	}

	public void setKosucular(List<Kosucu> kosucular) {
		this.kosucular = kosucular;
	}

	public long getBaslangicZamani() {
		return baslangicZamani;
	}

	public void setBaslangicZamani(long baslangicZamani) {
		this.baslangicZamani = baslangicZamani;
	}

	@Override
	public String toString() {
		return "Yaris [kosucular=" + kosucular + ", baslangicZamani=" + baslangicZamani + "]";
	}

	public void kosucuOlustur() {
		for (int i = 0; i < 10; i++) {
			kosucular.add(new Kosucu("Kosucu" + (i + 1)));
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}