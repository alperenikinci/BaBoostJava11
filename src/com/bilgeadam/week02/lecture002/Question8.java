package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Question8 {

	/*
	 * 
	 * Dışarıdan girilen bir sayının faktöriyelini hesaplayalım.
	 */

	public static void main(String[] args) {
		int sayi;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz: ");
		sayi = scanner.nextInt();
		long faktoriyel = 1;

		for (int i = 1; i <= sayi; i++) {
			faktoriyel *= i;
		}
		System.out.println(sayi + " faktoriyeli: " + faktoriyel);
		scanner.close();

	}

}
