package com.bilgeadam.week04.lecture002;

import java.util.Random;
import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		TasKagitMakas tkm = new TasKagitMakas();
		String[] array = tkm.tasKagitMakas;
		int tasCount = 0;
		int kagitCount = 0;
		int makasCount = 0;
		String secim = "";
		for (int i = 0; i < 99999999; i++) {
			secim = rastgeleSecim(array);
			if (secim.equalsIgnoreCase("taş")) {
				tasCount++;
			} else if (secim.equalsIgnoreCase("kağıt")) {
				kagitCount++;
			} else {
				makasCount++;
			}
		}
		System.out.println("Taş : " + tasCount + "\nKağıt : " + kagitCount + "\nMakas : " + makasCount);

//		uygulama(array);

	}

	public static void uygulama(String[] array) {
		Scanner scanner = new Scanner(System.in);
		String kontrol = "";
		int userSkor = 0;
		int pcSkor = 0;
		do {
			String pcSecim = rastgeleSecim(array);
			String userSecim = userSecim();

			if (userSecim.equalsIgnoreCase(pcSecim)) {
				System.out.println("BERABERE!");
				System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);
			} else {

				switch (userSecim) {

				case "taş":
					if (pcSecim.equalsIgnoreCase("kağıt")) {
						System.out.println("KAYBETTINIZ!!");
						pcSkor++;
						System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);
					} else {
						System.out.println("KAZANDINIZ!!");
						userSkor++;
						System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);
					}
					break;

				case "kağıt":
					if (pcSecim.equalsIgnoreCase("makas")) {
						System.out.println("KAYBETTINIZ!!");
						pcSkor++;
						System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);
					} else {
						System.out.println("KAZANDINIZ!!");
						userSkor++;
						System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);
					}
					break;
				case "makas":
					if (pcSecim.equalsIgnoreCase("taş")) {
						System.out.println("KAYBETTINIZ!!");
						pcSkor++;
						System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);
					} else {
						System.out.println("KAZANDINIZ!!");
						userSkor++;
						System.out.println("Skorunuz : " + userSkor + "\nPcSkoru : " + pcSkor);
					}
					break;
				default:
					System.err.println("Lütfen geçerli bir seçenek giriniz!!! ");
					break;
				}
			}

			System.out.print("Tekrar oynamak için 'E' harfini giriniz.\t:\t");
			kontrol = scanner.nextLine();
		} while (kontrol.equalsIgnoreCase("E"));
		System.err.println("UYGULAMA SONLANDI");
	}

	private static String userSecim() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen Taş - Kağıt - Makas değerlerinden birini seçiniz : ");
		String secim = scanner.nextLine();
		return secim;
	}

	private static String rastgeleSecim(String[] array) {
		Random random = new Random();
		int sayi = random.nextInt(array.length);

		return array[sayi];
	}

}
