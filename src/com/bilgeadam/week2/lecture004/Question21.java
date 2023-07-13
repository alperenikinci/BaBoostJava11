package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question21 {

	/*
	 * 
	 * Kullanıcı 1 ile 7 arasında bir sayı girsin. (1 ve 7 dahil) Bu sayıya denk
	 * gelen haftanın gününü yazdıralım.
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen 1 ile 7 arasında bir sayı giriniz : ");
		int sayi = scanner.nextInt();

		switch (sayi) {

		case 1:
			System.out.println("Pazartesi");
			break;

		case 2:
			System.out.println("Salı");
			break;

		case 3:
			System.out.println("Çarşamba");
			break;

		case 4:
			System.out.println("Perşembe");
			break;

		case 5:
			System.out.println("Cuma");
			break;

		case 6:
			System.out.println("Cumartesi");
			break;

		case 7:
			System.out.println("Pazar");
			break;

		default:
			System.err.println("Lütfen geçerli bir değer giriniz !!!");
		}
		scanner.close();

	}

}
