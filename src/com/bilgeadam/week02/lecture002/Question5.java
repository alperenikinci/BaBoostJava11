package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// int integerSayi = scanner.nextInt();
		// double doubleSayi = scanner.nextDouble();
		// float, long,

		System.out.print("Lütfen bir sayi giriniz: ");
		double doubleSayi = scanner.nextDouble();// "\n"
		System.out.println(15 + "\n");

		/*
		 * scanner ile sayısal bir değer okuduktan sonra String bir değer okumak
		 * istiyorsak mutlaka 1 tane boş scanner.nextLine(); kullanmamız lazım.
		 */
		scanner.nextLine();

		double ikinciSayi = 5;

		System.out.println(doubleSayi + ikinciSayi);

		System.out.print("Lütfen adınızı giriniz : ");
		String isim = scanner.nextLine(); // =>>>> "151234123"
		isim = scanner.nextLine();

		System.out.println("Merhaba " + isim);
		scanner.close();
	}

}
