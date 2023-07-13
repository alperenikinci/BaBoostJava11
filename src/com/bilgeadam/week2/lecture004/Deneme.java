package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

//4611686018427387847
public class Deneme {

	public static void main(String[] args) {
		Boolean prime = true;
		long n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number:");
		n = scan.nextLong();
		scan.close();
		long startTime = System.nanoTime();
		int sqrt = (int) Math.sqrt(n);
		long i = 3;

		if (n == 2 || n == 3) {
			System.out.println(n + " is a prime number");
		} else if (n <= 1 || n % 2 == 0) {
			System.out.println(n + " is not a prime number");
		} else {
			for (; i <= sqrt; i = i + 2) {
				if (n % i == 0) {
					prime = false;
					break;
				}
			}

			if (prime) {
				System.out.println(n + " is  a prime number");
			} else {
				System.out.println(n + " is not a prime number");
			}
		}
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in nanoseconds: " + timeElapsed);
		System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

	}

}
