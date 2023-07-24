package com.bilgeadam.week4.lecture001;

import java.util.Scanner;

public class Uygulama {

	static Scanner scanner = new Scanner(System.in);
	static SayiKontrol sayiKontrol = new SayiKontrol();

	public static void uygulama() {
		boolean status = true;
		while (status) {
			menu();

			switch (islemSec()) {

			case 1:
				System.err.println("İşlemin sonucu = " + toplama() + "\n");
				break;
			case 2:
				System.err.println("İşlemin sonucu = " + cikarma() + "\n");
				break;
			case 3:
				System.err.println("İşlemin sonucu = " + carpma() + "\n");
				break;
			case 4:
				System.err.println("İşlemin sonucu = " + bolme() + "\n");
				break;
			case 0:
				System.err.println("Programdan çıkış yaptınız! ");
				status = false;
				break;
			default:
				System.err.println("Lütfen geçerli bir değer giriniz!");

			}
		}

	}

	public static void menu() {
		System.out.println("###HESAP MAKINESI###");
		System.out.println("1- TOPLAMA");
		System.out.println("2- ÇIKARMA");
		System.out.println("3- ÇARPMA");
		System.out.println("4- BÖLME");
		System.out.println("0- ÇIKIŞ");
	}

	public static int islemSec() {
		System.out.print("Lütfen bir işlem seçiniz : ");
		int secim = scanner.nextInt();
		scanner.nextLine();
		return secim;

	}

	public static int toplama() {
		System.out.println("\n###TOPLAMA İŞLEMİ###");
		int islemSonucu = 0;
		String sayi = "";
		while (!sayi.equals("=")) {
			System.out.print("Lütfen bir sayı giriniz : ");
			sayi = scanner.nextLine();
			if (sayiKontrol.isNumeric(sayi)) {
				islemSonucu += Integer.parseInt(sayi);
			} else if (sayi.equals("=")) {
				return islemSonucu;
			} else {
				System.err.println("Lütfen geçerli bir sayı giriniz.");
			}

		}
		return islemSonucu;
	}

	public static int cikarma() {
		System.out.println("\n###ÇIKARMA İŞLEMİ###");
		int islemSonucu = 0;
		int count = 0;
		String sayi = "";
		while (!sayi.equals("=")) {
			System.out.print("Lütfen bir sayı giriniz : ");
			sayi = scanner.nextLine();
			if (!sayi.equals("=") && count == 0) {
				islemSonucu = Integer.parseInt(sayi);
				count++;
			} else if (sayi.equals("=")) {
				return islemSonucu;
			} else {
				islemSonucu -= Integer.parseInt(sayi);
			}
		}
		return islemSonucu;
	}

	public static int carpma() {
		System.out.println("\n###ÇARPMA İŞLEMİ###");
		int islemSonucu = 1;
		String sayi = "";
		while (!sayi.equals("=")) {
			System.out.print("Lütfen bir sayı giriniz : ");
			sayi = scanner.nextLine();
			if (sayi.equals("=")) {
				return islemSonucu;
			} else {
				islemSonucu *= Integer.parseInt(sayi);
			}
		}
		return islemSonucu;
	}

	public static double bolme() {

		System.out.println("\n###BÖLME İŞLEMİ###");
		double islemSonucu = 0;
		int count = 0;
		String sayi = "";
		while (!sayi.equals("=")) {
			System.out.print("Lütfen bir sayı giriniz : ");
			sayi = scanner.nextLine();
			if (!sayi.equals("=") && count == 0) {
				// islemSonucu = Integer.parseInt(sayi);
				islemSonucu = Double.parseDouble(sayi);
				count++;
			} else if (sayi.equals("=")) {
				return islemSonucu;
			} else {
				islemSonucu /= Double.parseDouble(sayi);
				// islemSonucu /= Integer.parseInt(sayi);
			}

		}
		return islemSonucu;

	}

}
