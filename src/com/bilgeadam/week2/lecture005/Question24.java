package com.bilgeadam.week2.lecture005;

import java.util.Scanner;

public class Question24 {

	/*
	 * Klavyeden 0 ile 100 arasında (0-100 dahil) 5 adet sayıyı kullanıcıdan
	 * alacağım. Aldığım sayılardan en büyük ve en küçük olanları yazdıran program.
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i = 1;
		int num;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		while (i <= 5) {
			System.out.print("Lütfen bir sayı giriniz : ");
			num = scanner.nextInt();

			if (num >= 0 && num <= 100) {

				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
				i++;
			} else {
				System.err.println("Lütfen geçerli bir sayı giriniz! (0-100)");
			}
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		scanner.close();
	}

}
