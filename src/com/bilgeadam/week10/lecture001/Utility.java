package com.bilgeadam.week10.lecture001;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

public class Utility {

	static Scanner scanner = new Scanner(System.in);

	public static String stringDegerAlma(String sorgu) {
		System.out.print(sorgu);
		return scanner.nextLine();
	}

	public static int intDegerAlma(String sorgu) {

		int sayi = 0;
		boolean kontrol = false;

		do {
			try {
				System.out.print(sorgu);
				sayi = Integer.parseInt(scanner.nextLine());
				kontrol = false;
			} catch (NumberFormatException e) {
				System.out.println("Girdiginiz deger hatalidir lutfen bir tamsayi degeri giriniz...");
//				System.out.println(e.toString());
				kontrol = true;
			}
		} while (kontrol);
		return sayi;

	}

	public static double doubleDegerAlma(String sorgu) {
		double sayi = 0;
		boolean kontrol = false;

		do {
			try {
				System.out.print(sorgu);
				sayi = Double.parseDouble(scanner.nextLine());
				kontrol = false;
			} catch (NumberFormatException e) {
				System.out.println("Girdiginiz deger hatalidir lutfen bir tamsayi degeri giriniz...");
				kontrol = true;
			}
		} while (kontrol);
		return sayi;
	}

	public static int randomSayiUret(int baslangic, int bitis) {
		Random random = new Random();
		return random.nextInt(baslangic, bitis);
	}

	public static LocalDate stringTarihAlma() {
		boolean kontrol = false;
		LocalDate date = null;
		do {
			try {
				date = LocalDate.parse(stringDegerAlma("Lutfen bir tarih degeri giriniz (yil-ay-gun) : "));
				kontrol = false;
			} catch (DateTimeParseException e) {
				System.out.println("Girdiginiz tarih degeri hatalidir! Lutfen ornekteki gibi giriniz : (2020-01-20)");
//				System.out.println(e.toString());
				kontrol = true;
			}

		} while (kontrol);
		return date;
	}

}
