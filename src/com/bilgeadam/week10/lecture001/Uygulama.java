package com.bilgeadam.week10.lecture001;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Uygulama {

	/*
	 * 
	 * 1- bir yukYeriSec() metodumuz olsun. Bu metot limandaki yukler array'inden
	 * bir yer belirlesin. Eger array sinirlarinin disinda kalirsam hata versin.
	 * 
	 * 
	 * 2- Kendi exception sinifimizi olusturalim. LimanAppException. Daha sonra
	 * sectigimiz indexteki deger null degil ise bu exceptionu firlatalim.
	 * "Sectiginiz yer dolu."
	 * 
	 * 
	 * 3- kantar(); Liman 100 kg altindaki yukleri kabul etmiyor. Yukumuz bu kurala
	 * uymuyorsa hata firlatalim.
	 * 
	 * 4- Limanimiz Cuma gunleri yuk kabul etmiyor. Bununla alakali bir metot
	 * yazalim,eger tarihe denk gelen gun Cuma ise hata firlatsin.
	 * 
	 * 
	 * 5-yukOlustur() metodumuz olsun. Yukarida yazdigimiz metotlari bu metot
	 * icerisinde kullanalim ve kontrollerden geciyorsa bir yuk olusturalim.
	 */

	Liman liman;

	public static void main(String[] args) {

		Uygulama uygulama = new Uygulama();

		uygulama.yukOlustur();

		for (Yuk yuk : uygulama.liman.getYukler()) {
			if (yuk != null) {
				System.out.println(yuk);
			}
		}
	}

	public Uygulama() {
		super();
		this.liman = new Liman();
	}

	private void yukYeriSec() {
		int index = Utility.intDegerAlma("Lutfen bir yuk yeri seciniz : ");
		try {
			Yuk yuk = liman.getYukler()[index];

		} catch (NullPointerException e) {
			System.out.println("Su an herhangi bir yuk yeri bulunamamaktadir.");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Lutfen gecerli bir yuk yeri giriniz.");
		}
	}

	private int yukYeriSec2() {

		liman.getYukler()[0] = new Yuk("1", 100, LocalDate.now());
		int index = Utility.intDegerAlma("Lutfen bir yuk yeri seciniz : ");
		if (index < 0 || index >= liman.getYukler().length) {
			throw new LimanAppException(ErrorType.SINIRLAR_DISINDA);
		} else if (liman.getYukler()[index] != null) {
			throw new LimanAppException(ErrorType.DOLU_YER_SECIMI, "Sectiginiz yer doludur...");
		}

		return index;
	}

	private double kantar() {
		double yuk = Utility.doubleDegerAlma("Lutfen bir agirlik giriniz : ");
		if (yuk < 100) {
			throw new LimanAppException(ErrorType.YETERSIZ_AGIRLIK);
		}
		return yuk;
	}

	private LocalDate kabulTarihiKontrol() {
		LocalDate date = Utility.stringTarihAlma();
		if (date.isBefore(LocalDate.now())) {
			throw new LimanAppException(ErrorType.GECERSIZ_KABUL_TARIHI);
		} else if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
			throw new LimanAppException(ErrorType.MESAI_GUNU_DISINDA);
		}
		return date;
	}

	// 5-yukOlustur() metodumuz olsun. Yukarida yazdigimiz metotlari bu metot
	// * icerisinde kullanalim ve kontrollerden geciyorsa bir yuk olusturalim.

	private void yukOlustur() {
		Yuk yuk = null;
		int index = 0;

		try {
			index = yukYeriSec2();
			LocalDate date = kabulTarihiKontrol();
			double agirlik = kantar();
			String isim = Utility.stringDegerAlma("Lutfen yukunuzun ismini giriniz : ");
			yuk = new Yuk(isim, agirlik, date);
			liman.getYukler()[index] = yuk;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (yuk == null) {
				System.err.println("Yukunuz kabul edilmemistir...");
			} else {
				System.out.println("Yukunuz kabul edilmistir...");
			}
		}
	}

}
