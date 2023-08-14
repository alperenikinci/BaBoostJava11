package com.bilgeadam.week03.lecture004;

public class Question43 {

	// Bir metot yazalım ve bu metot dizi içindeki tek elemanları alıp,
	// başka bir diziye atsın ve o diziyi yazdırsın.
	// int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654,
	// 33, 32, 67, 2 }, { 189, 35, 56, 89, 8 } };

	public static void main(String[] args) {

		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } }; // 4X5'lik bir matris

		tekSayilariAta(matris);
		int[] array = tekSayilariAta2(matris);
		yazdir(array);
		yazdir(tekSayilariAta2(matris));

//		int[] intArray = { 5, 8, 9, 17 };

//		int[] domates = { 1, 3, 5, 7, 9 };
//
//		int[][] domatesPatates = { { 1, 3, 5, 7, 9 }, { 2, 4, 6, 8 }, { 1, 3, 5, 7, 9 }, { 2, 4, 6, 8 },
//				{ 1, 3, 5, 7, 9 }, { 2, 4, 6, 8 }, { 1, 3, 5, 7, 9 }, { 2, 4, 6, 8 } };

//		System.out.println();
//		yazdir(intArray);
//		System.out.println();
//		yazdir(domates);
//		System.out.println();
//
//		yazdir(ikiBoyutluArrayiTekBoyutluYazdir(domatesPatates));
//		System.out.println();
//		yazdir(ikiBoyutluArrayiTekBoyutluYazdir(matris));
//
//		int intSayi = 5;
//		String kelime = "Merhaba";
//		boolean kontrol = true;
//		double doubleSayi = 4.0;
//		System.out.println();
//
//		System.out.println(intSayi);
//		System.out.println(kelime);
//		System.out.println(kontrol);
//		System.out.println(doubleSayi);
//		System.out.println();
//
//		yazdir(intSayi);
//		yazdir(kelime);
//		yazdir(kontrol);
//		yazdir(doubleSayi);
//
//		System.out.println();
//
//		yazdir(intSayi, kelime, kontrol, doubleSayi);
//		System.out.println();
//		System.out.println(yazdir1(intSayi, kelime, kontrol, doubleSayi));
//		System.out.println();
//
//		System.out.println(yazdir(intSayi));

	}

	public static void tekSayilariAta(int[][] ikiBoyutluArray) {

		int[] array = new int[ikiBoyutluArray.length * ikiBoyutluArray[0].length];
		int sayac = 0;

		for (int i = 0; i < ikiBoyutluArray.length; i++) {
			for (int j = 0; j < ikiBoyutluArray[i].length; j++) {
				if (ikiBoyutluArray[i][j] % 2 != 0) {

					array[sayac] = ikiBoyutluArray[i][j];
					sayac++;
				}
			}
		}
		for (int i = 0; i < sayac; i++) {
			System.out.print(array[i] + " - ");
		}
	}

	public static int[] tekSayilariAta2(int[][] a) {
		int[] array = new int[a.length * a[0].length];
		int sayac = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 != 0) {

					array[sayac] = a[i][j];
					sayac++;
				}
			}
		}
		return array;
	}

	public static int[] ikiBoyutluArrayiTekBoyutluYazdir(int[][] a) {
		int[] array = new int[a.length * a[0].length];
		int sayac = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				array[sayac] = a[i][j];
				sayac++;
			}
		}
		return array;
	}

	public static void yazdir(int[] patates) {

		for (int i = 0; i < patates.length; i++) {
			System.out.print(patates[i] + " - ");
		}
	}

	public static int yazdir(int sayi) {
		System.out.println(sayi);
		return sayi;
	}

	public static void yazdir(String kelime) {
		System.out.println(kelime);
	}

	public static void yazdir(boolean karar) {
		System.out.println(karar);
	}

	public static void yazdir(double doubleSayi) {

		System.out.println(doubleSayi);
	}

	public static void yazdir(int intSayi, String portakal, boolean elma, double armut) {
		System.out.println(intSayi + portakal + elma + armut);
	}

	public static String yazdir1(int intSayi, String portakal, boolean elma, double armut) {

		return intSayi + portakal + elma + armut;
	}

	/*
	 * Return type'lar;
	 * 
	 * void ->> boş döner int ->> integer döner String ->> String döner int[] ->>
	 * integer array döner.
	 * 
	 * Şu ana kadar çalıştığımız bütün veri tipleri birer return type olarak
	 * kullanılabilir.
	 * 
	 * 
	 */

	/*
	 * 4 adet access modifier vardır. Bunlar;
	 *
	 * public private default protected
	 * 
	 */

}
