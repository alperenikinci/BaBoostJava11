package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question15 {

	/*
	 * 
	 * Klavyeden 0 girilinceye kadar sayı okumaya devam edeceğiz. 0 girildiğinde
	 * sayıların toplamını ve ortalamasını ekrana yazdıralım.
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number;
		int toplam = 0;
		int sayac = 1;
		double ortalama = 0;
		System.out.print("Lütfen bir sayi giriniz : ");
		number = scanner.nextInt();

//		while (number != 0) {
//			toplam += number;
//			ortalama = toplam / sayac;
//			System.out.print("Lütfen bir sayi giriniz :");
//			number = scanner.nextInt();
//			sayac++;
//		}

		for (; number != 0; sayac++) {
			toplam += number;
			ortalama = toplam / (double) sayac;
			System.out.print("Lütfen bir sayi giriniz : ");
			number = scanner.nextInt();
		}
		System.out.println("Toplam : " + toplam + "\nOrtalama : " + ortalama);
	}

}
