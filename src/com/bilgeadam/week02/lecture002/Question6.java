package com.bilgeadam.week02.lecture002;

import java.util.Scanner;

public class Question6 {

	/*
	 * Dairenin alanını ve çevresini bulalım.
	 * 
	 * yarı çap dışarıdan input olarak girilecek.
	 * 
	 * pi = 3.14
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double pi = 3.14;
		System.out.print("Lutfen yaricapi giriniz: ");
		double yaricap = scanner.nextFloat();

		double alan = pi * yaricap * yaricap;
		double cevre = 2 * pi * yaricap;

		System.out.println("Alan = " + alan + "\nCevre = " + cevre);

		scanner.close();

	}

}
