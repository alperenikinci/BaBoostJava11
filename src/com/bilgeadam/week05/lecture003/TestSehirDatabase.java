package com.bilgeadam.week05.lecture003;

import java.util.Scanner;

public class TestSehirDatabase {
	/*
	 * 1- Dışarıdan girilen harfle başlayan illeri yazdır. 2- "01-Adana" formatında,
	 * illeri plaka kodları ile yazdıran method. 3-Girdiğimiz şehrin ismine göre
	 * plakasını dönen method.
	 * 
	 */
	public static void main(String[] args) {
		SehirDatabase sehirDB = new SehirDatabase();
		String[] iller = sehirDB.iller;

//		harfleBaslayanIller(iller);
//		plakaYazdir(iller);
		sehreGorePlakaKoduAl(iller);
//		System.out.println(sehreGorePlakaKoduAl2(iller));

	}

	public static void harfleBaslayanIller(String[] iller) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir harf giriniz : ");
		String harf = scanner.nextLine();

		for (int i = 0; i < iller.length; i++) {
			if (iller[i].startsWith(harf.toUpperCase().substring(0, 1))) {
				System.out.println(iller[i]);
			}
		}
	}

	public static void plakaYazdir(String[] iller) {
		for (int i = 0; i < iller.length; i++) {

			if (i < 9) {
				System.out.println("0" + (i + 1) + "-" + iller[i]);
			} else {
				System.out.println((i + 1) + "-" + iller[i]);
			}
		}
	}

	public static void sehreGorePlakaKoduAl(String[] iller) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen sehir giriniz : ");
		String sehir = scanner.nextLine();
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].equalsIgnoreCase(sehir)) {
				if (i < 9) {
					System.out.println("0" + (i + 1));
				} else {
					System.out.println((i + 1));
				}
			}
		}
	}

//	public static String sehreGorePlakaKoduAl2(String[] iller) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Lutfen sehir giriniz : ");
//		String sehir = scanner.nextLine();
//		for (int i = 0; i < iller.length; i++) {
//			if (iller[i].equalsIgnoreCase(sehir)) {
//				if (i < 9) {
//					return "0" + (i + 1);
//				} else {
//					return "" + (i + 1);
//				}
//			}
//		}
//		return "Boyle bir sehir bulunmamaktadır";
//	}

}
