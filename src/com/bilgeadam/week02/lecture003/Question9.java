package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question9 {

	/*
	 * Kullanıcıdan girilen 1-10 arasındaki sayının çarpım tablosunu yazdıran
	 * program.
	 * 
	 * 7x1 . . . 7x10 = sonuc
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayi giriniz : ");
		int sayi = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			int carpim = sayi * i;
			System.out.println(sayi + " X " + i + " = " + carpim);
		}
	}

}
