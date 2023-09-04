package com.bilgeadam.week09.lecture005;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class SiparisGunu {

	/*
	 * Bir alisveris tarihimiz olsun. Her ayin 15'i fatura kesim tarihimiz.
	 * 
	 * 1- Alisveris tarihi fatura tarihinden once mi diye kontrol edelim. once ise
	 * fatura tarihinden once yazdiralim. sonra ise fatura tarihinden sonra
	 * yazdiralim.
	 * 
	 * 2- Yeni fatura tarihini yazdiralim. (Bir sonraki faturanin tarihi) ve bu
	 * tarihe kalan gunu de yazdiralim.
	 * 
	 */

	public static void main(String[] args) {

		LocalDate alisverisTarihi = LocalDate.of(2023, 07, 20);
		LocalDate faturaTarihi = LocalDate.of(alisverisTarihi.getYear(), alisverisTarihi.getMonth(), 15);

		if (alisverisTarihi.isBefore(faturaTarihi)) {
			System.out.println("Fatura tarihine daha var..");
		} else {
			System.out.println("Fatura tarihinden sonra...");
			faturaTarihi = faturaTarihi.plusMonths(1);
			System.out.println("Bir sonraki fatura tarihi : " + faturaTarihi);
			long kalanGun = alisverisTarihi.until(faturaTarihi, ChronoUnit.DAYS);
			long kalanGun2 = ChronoUnit.DAYS.between(faturaTarihi, alisverisTarihi);
			System.out.println("kalan gun " + kalanGun);
			System.out.println("kalan gun2 " + Math.abs(kalanGun2));
		}

		Period period = Period.between(alisverisTarihi, faturaTarihi);
		long fark = period.getDays();
		System.out.println("kalan gun3 " + fark);
		System.out.println(period);

	}

}
