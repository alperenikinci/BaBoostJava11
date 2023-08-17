package com.bilgeadam.week07.lecture003.footballapp;

public abstract class AktifFutbolcu extends Futbolcu {

	public AktifFutbolcu(String adSoyad, int formaNumarasi) {
		super(adSoyad, formaNumarasi);
	}

	// pas skorunu hesaplayacak bir metot pasSkoru(), bir de pas verdiğim zaman bu
	// pasin
	// basarili olup olmadigini bana true/false seklinde donen bir metot pasVer()

	public boolean pasVer() {
		int pasSkoru = pasSkor();

		if (pasSkoru > 68) {
			System.out.println("Pas basarili!!!");
			System.out.println("pasSkoru = " + pasSkoru);
			return true;
		} else {
			System.out.println("Pas basarisiz!!!");
			System.out.println("pasSkoru = " + pasSkoru);

			return false;
		}

	}

	public abstract int pasSkor();

	public boolean sutCek(int kurtaris) {
		int sutSkoru = golSkoru(kurtaris);

		if (sutSkoru > 68) {
			System.out.println("GOL!!!!!");
			System.out.println("sutSkoru = " + sutSkoru);
			return true;
		} else {
			System.out.println("Kurtarıldı!!!");
			System.out.println("sutSkoru = " + sutSkoru);

			return false;
		}

	}

	public abstract int golSkoru(int kurtaris);
}
