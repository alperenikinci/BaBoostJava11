package com.bilgeadam.week3.lecture002;

import java.util.Scanner;

public class Question32 {

	/*
	 * 
	 * Dışarıdan girilen ülke ismi bizim array'imizde bulunuyor mu? Kontrol edelim.
	 * 
	 * 
	 * Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] ulkeler = { "Türkiye", "Japonya", "Moğolistan", "Amerika", "Rusya", "Çin" };

		System.out.print("Lütfen bir ülke adı giriniz : ");
		String ulke = scanner.nextLine();
		boolean kontrol = false;

		for (int i = 0; i < ulkeler.length; i++) {
			if (ulkeler[i].equalsIgnoreCase(ulke)) {
				System.out.println("Girdiğiniz ülke dizimizde bulunmaktadır. ");
				kontrol = true;
				break;
			}
//			else if (i == ulkeler.length - 1) {
//				System.err.println("Girdiğiniz ülke dizimizde bulunmamaktadır. ");
//			}
		}
		if (!kontrol) {
			System.err.println("Girdiğiniz ülke dizimizde bulunmamaktadır. ");
		}
		scanner.close();

	}

}
