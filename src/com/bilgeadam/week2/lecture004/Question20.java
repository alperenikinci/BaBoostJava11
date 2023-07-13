package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question20 {

	/*
	 * 
	 * Girilen sayının 5'in kuvveti olup olmadığını bulan program.
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayi giriniz : ");
		int number = scanner.nextInt();
		boolean kontrol = true;

		if (number == 1) {
			System.out.println("Sayı 5'in kuvvetidir.");
			kontrol = false;
			System.out.println("Kontrol = False"); //
		} else if (number < 0) {
			System.out.println("Lütfen pozitif bir sayi giriniz. ");
			kontrol = false;
			System.out.println("Kontrol = False"); //
		}

		System.out.println("Döngü girişi"); //
		while (kontrol) {
			System.out.println("Döngüye girdik");
			if (number % 5 == 0) {
				number /= 5;
				if (number == 1) {
					System.out.println("Sayi 5'in kuvvetidir! ");
					kontrol = false;
					System.out.println("Kontrol = False"); //
				}

			} else {
				System.out.println("Sayi 5'in kuvveti değildir! ");
				kontrol = false;
				System.out.println("Kontrol = False"); //
			}

		}
		System.out.println("Döngü Çıkışı"); //
		scanner.close();
	}

}
