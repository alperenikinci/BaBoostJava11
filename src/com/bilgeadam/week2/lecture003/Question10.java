package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Question10 {

	/*
	 * 1'de başlayarak kullanıcının dışarıdan girdiği sayıya kadar olan (sayı dahil)
	 * sayıların 1 fazlasınının toplamını ekranda yazdıran program.
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayi giriniz : ");
		int sayi = scanner.nextInt();
		int toplam = 0;
		for (int i = 1; i <= sayi; i++) {
			toplam += i + 1;
		}

		System.out.println("Toplam ==> " + toplam);

	}

}
