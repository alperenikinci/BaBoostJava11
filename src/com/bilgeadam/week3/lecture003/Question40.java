package com.bilgeadam.week3.lecture003;

public class Question40 {

	/*
	 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3'ün
	 * katı ise ise bilge, 5 in katı ise adam hem 3'ün ve hem de 5'in katı ise
	 * BilgeAdam yazdıralım. int start=2; int end=22;
	 * {2,3,4,5,6,7,8,9,10,11,12,13,14,15} ->>
	 * {2,"Bilge",4,"Adam",6,7,8,"bilge",...14,"BilgeAdam"}
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int start = 2;
		int end = 22;

		String[] array = new String[end - start + 1];

		for (int i = 0; i < array.length; i++) {

			int sayi = i + start;

			if (sayi % 15 == 0) {
				array[i] = "BilgeAdam";

			} else if (sayi % 5 == 0) {
				array[i] = "Adam";
			} else if (sayi % 3 == 0) {
				array[i] = "Bilge";
			} else {
				array[i] = "" + sayi;
			}
		}

		for (int j = 0; j < array.length; j++) {
			if (j == array.length - 1) {
				System.out.print(array[j]);
			} else {
				System.out.print(array[j] + " ,");
			}
		}
//		System.out.println(Arrays.toString(array)); ->> Array'i yazdırma metodu.

	}

}
