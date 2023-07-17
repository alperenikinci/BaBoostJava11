package com.bilgeadam.week2.lecture005;

import java.util.Scanner;

public class Question23 {

	/*
	 * Girilen sayının mükemmel sayı olup olmadığını gösteren program.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayi giriniz : ");
		int sayi = scanner.nextInt();
		int toplam = 0;

		for (int i = 1; i <= (sayi / 2); i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}
		if (toplam == sayi) {
			System.out.println("Sayı mükemmel sayıdır.");
		} else {
			System.out.println("Sayı mükemmel sayı değildir.");
		}
		scanner.close();

	}

}
