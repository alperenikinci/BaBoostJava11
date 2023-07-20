package com.bilgeadam.week3.lecture003;

public class Question41 {

	/*
	 * 
	 * Çarpım tablosunu yazdıralım.
	 * 
	 * 1 x 1 = 1 1 x 2 = 2 ... 10'a kadar olan(10 dahil) bütün çarpımları istiyorum.
	 */

	public static void main(String[] args) {

		String[][] array = new String[10][10];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (i + 1) + " x " + (j + 1) + " = " + ((i + 1) * (j + 1));
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[i][j]);
			}
			System.out.println();
		}

	}

}
