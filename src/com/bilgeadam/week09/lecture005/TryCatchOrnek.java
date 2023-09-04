package com.bilgeadam.week09.lecture005;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek {

	/*
	 * 
	 * bir tane bolme metodum olsun. Disaridan 2 parametre alsin. Sonra bolme
	 * islemini yapip sonucu donsun.
	 * 
	 * bu metodun icerisinde de try-catch yapisini kullanalim.
	 * 
	 */

	public static void main(String[] args) {
//		double bolum = 0;
//		bolum = 15 / 0;
		System.out.println(bolme());

		for (int i = 0; i < 3; i++) {
//			try {
			bolme();
//			} catch (ArithmeticException e) {
//				System.out.println("2. sayi 0 olamaz.");
//				System.out.println(e.toString());
//			}
		}

	}

	public static double bolme() {
		double bolum = 0;

		boolean kontrol = false;
		do {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Lutfen 1. sayiyi giriniz : ");
				int sayi1 = scanner.nextInt();
				System.out.print("Lutfen 2. sayiyi giriniz : ");
				int sayi2 = scanner.nextInt();
				bolum = sayi1 / sayi2;
				kontrol = false;
			} catch (InputMismatchException ime) {
				System.out.println("Lutfen sadece sayi giriniz.");
				System.out.println(ime.toString());
				kontrol = true;
			} catch (ArithmeticException e) {
				System.out.println("2. sayi 0 olamaz.");
				System.out.println(e.toString());
			}
		} while (kontrol);

		return bolum;
	}

}
