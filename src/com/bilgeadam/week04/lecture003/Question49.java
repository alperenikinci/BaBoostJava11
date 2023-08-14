package com.bilgeadam.week04.lecture003;

import java.util.Scanner;

public class Question49 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir tek sayı giriniz : ");
		int sayi = scanner.nextInt();
		System.out.print("Lütfen satır sayısı giriniz : ");
		int satir = scanner.nextInt();
		System.out.print("Lütfen sütun sayısı giriniz : ");
		int sutun = scanner.nextInt();

		printArray(sayi, satir, sutun);

	}
	// 1,0 >>> 2,0 - 2,1 >>> 3,0 - 3,1 - 3,2
	// 0,1 - 0,2 - 0,3 >>> 1,2 - 1,3 >>> 2,3

	// [{1,2,3,4},{1,2,3,4,5,6,7},{1,2}[]

	public static void printArray(int max, int satir, int sutun) {

		int min = 1;
		int orta = (max + min) / 2;
		int[][] array = new int[satir][sutun];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					array[i][j] = orta;
				} else if (j < i) {
					array[i][j] = min;
				} else if (i < j) {
					array[i][j] = max;
				}

				System.out.print(array[i][j]);
			}
			System.out.println();

		}
	}

}
