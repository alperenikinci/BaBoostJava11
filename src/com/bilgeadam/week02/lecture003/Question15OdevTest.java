package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question15OdevTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi giriniz");
		int sayi = sc.nextInt();
		int toplam = 0;
		int sayac = 1;
		double ortalama = 0;
		for (sayac = 1; sayi != 0; sayac++) {
			toplam += sayi;
			ortalama = toplam / (double) sayac;

			System.out.print("Bir sayi giriniz");
			sayi = sc.nextInt();
		}
		System.out.println("Toplam: " + toplam + "\nOrtalama: " + ortalama);
		sc.close();
	}
}
