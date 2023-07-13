package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Question12 {

	/*
	 * 
	 * girilen sayının basamakları toplamını ekrana yazdıralım.
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int toplam = 0;
		int sayi;
		int sayac = 0;

		System.out.print("Lütfen bir sayi giriniz : ");
		sayi = scanner.nextInt();

		do {
			toplam += sayi % 10;
			sayi /= 10;
			sayac++;
		} while (sayi != 0);

		System.out.println("Basamaklar toplamı : " + toplam);
		System.out.println("Basamak sayısı : " + sayac);
		scanner.close();
	}

}
