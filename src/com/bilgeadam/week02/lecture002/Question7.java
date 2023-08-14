package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Question7 {

	/*
	 * Dışarıdan 2 tane tam sayısal değer alacağım. İki sayımın toplamı çift ise
	 * true, değilse false yazdıracağım.
	 * 
	 * bu değerlerin bir de ortalamasını alalım
	 */

	public static void main(String[] args) {

		int sayi1, sayi2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen ilk sayiyi giriniz: ");
		sayi1 = scanner.nextInt();
		System.out.print("Lutfen ikinci sayiyi giriniz: ");
		sayi2 = scanner.nextInt();

		int toplam = sayi1 + sayi2;
		System.out.println(toplam);
		boolean ciftMi = toplam % 2 == 0;
		System.out.println(ciftMi);
		double ortalama = toplam / 2d;
		System.out.println(ortalama);
		scanner.close();
	}

}
