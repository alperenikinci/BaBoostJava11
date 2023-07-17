package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question19 {

	// 4611686018427387847
	// 2147483647
	public static void m2147483647ain(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		long sayi1 = scanner.nextLong();

		long startTime = System.nanoTime();

		if (sayi1 == 2) {
			System.out.println("Asal sayıdır");
		} else if (sayi1 < 2 || sayi1 % 2 == 0) {
			System.out.println("Asal Sayı Değildir");
		} else {
			boolean asal = true;
			for (long i = 3; i <= sayi1 - 1; i += 2) {
				if (sayi1 % i == 0) {
					asal = false;
					break;
				}
			}

			if (asal) {
				System.out.println("Asaldır");
			} else {
				System.out.println("Asal Sayı Değildir");
			}
		}

		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in nanoseconds: " + timeElapsed);
		System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
		scanner.close();
	}

}
