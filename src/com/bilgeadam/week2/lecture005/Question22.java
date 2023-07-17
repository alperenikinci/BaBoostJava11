package com.bilgeadam.week2.lecture005;

import java.util.Scanner;

public class Question22 {

	// Dışarıdan ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre

	// burc hesabı yapan program

	// Koç Burcu : 21 Mart - 20 Nisan

	// Boğa Burcu : 21 Nisan - 21 Mayıs

	// İkizler Burcu : 22 Mayıs - 22 Haziran

	// Yengeç Burcu : 23 Haziran - 22 Temmuz

	// Aslan Burcu : 23 Temmuz - 22 Ağustos

	// Başak Burcu : 23 Ağustos - 22 Eylül

	// Terazi Burcu : 23 Eylül - 22 Ekim

	// Akrep Burcu : 23 Ekim - 21 Kasım

	// Yay Burcu : 22 Kasım - 21 Aralık

	// Oğlak Burcu : 22 Aralık - 21 Ocak

	// Kova Burcu : 22 Ocak - 19 Şubat

	// Balık Burcu : 20 Şubat - 20 Mart

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int ay;
		int gun;

		System.out.print("Ay giriniz : ");
		ay = scanner.nextInt();
		System.out.print("Gün giriniz : ");
		gun = scanner.nextInt();

		switch (ay) {

		case 1:
			if (gun >= 1 && gun <= 21) {
				System.out.println("Burcunuz Oğlak");
			} else if (gun > 31 || gun < 1) {
				System.err.print("Ocak ayı 31 gündür. Girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Kova");
			}
			break;
		case 2:
			if (gun >= 1 && gun <= 19) {
				System.out.println("Burcunuz Kova");
			} else if (gun > 29 || gun < 1) {
				System.err.print("Şubat ayı 29 gündür. Girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Balık");
			}
			break;
		case 3:
			if (gun >= 1 && gun <= 20) {
				System.out.println("Burcunuz Balık");
			} else if (gun > 31 || gun < 1) {
				System.err.print("Mart ayı 31 gündür. Girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Koç");
			}
			break;
		case 4:
			if (gun >= 1 && gun <= 20) {
				System.out.println("Burcunuz Koç");
			} else if (gun > 30 || gun < 1) {
				System.err.print("Nisan ayı 30 gündür. Girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Boğa");
			}
			break;
		case 5:
			if (gun >= 1 && gun <= 21) {
				System.out.println("Burcunuz Boğa");
			} else if (gun > 31 || gun < 1) {
				System.err.print("Mayıs ayı 31 gündür. Girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz İkizler");
			}
			break;
		case 6:
			if (gun >= 1 && gun <= 22) {
				System.out.println("Burcunuz İkizler");
			} else if (gun > 31 || gun < 1) {
				System.err.print("Haziran ayı 31 gündür. Girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Yengeç");
			}
			break;
		case 7:
			if (gun >= 1 && gun <= 22) {
				System.out.println("Burcunuz Yengeç");
			} else if (gun > 31 || gun < 1) {
				System.err.print("Temmuz ayı 31 gündür. Girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Aslan");
			}
			break;
		case 8:
			if (gun >= 1 && gun <= 22) {
				System.out.println("Burcunuz Aslan");
			} else if (gun > 31 || gun < 1) {
				System.err.print("Ağustos ayı 31 gündür. Girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Başak");
			}
			break;
		case 9:
			if (gun >= 1 && gun <= 22) {
				System.out.println("Burcunuz Başak");
			} else if (gun > 31 || gun < 1) {
				System.err.print("Eylül ayı 31 gündür. Girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Terazi");
			}
			break;

		case 10:
			if (gun >= 1 && gun <= 22) {
				System.out.println("Burcunuz Terazi");
			} else if (gun > 31 || gun < 1) {
				System.err.print("Ekim ayı 31 gündür. Girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Akrep");
			}
			break;
		case 11:
			if (gun >= 1 && gun <= 21) {
				System.out.println("Burcunuz Akrep");
			} else if (gun > 31 || gun < 1) {
				System.err.print("Kasım ayı 31 gündür. Girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Yay");
			}
			break;
		case 12:
			if (gun >= 1 && gun <= 21) {
				System.out.println("Burcunuz Yay");
			} else if (gun > 31 || gun < 1) {
				System.err.print("Aralık ayı 31 gündür. Girdiğiniz değer yanlış.");
			} else {
				System.out.println("Burcunuz Oğlak");
			}
			break;
		}
		scanner.close();

	}

}
