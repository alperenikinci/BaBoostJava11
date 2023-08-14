package com.bilgeadam.week03.lecture003;

public class Question37 {

	/*
	 * 
	 * int [] sayilar={1,4,5,6,1,1,4,8};
	 * 
	 * dizi içerisinde 1 ve 4 kaç kere geçtiğini ve 1 sayısının adeti 4 sayısının
	 * adetinden büyükse true değilse false
	 * 
	 */

	public static void main(String[] args) {

		int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8 };
		int birAdet = 0;
		int dortAdet = 0;

		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] == 1) {
				birAdet++;
			} else if (sayilar[i] == 4) {
				dortAdet++;
			}
		}
		System.out.println(
				"1 sayısının adeti\t: " + birAdet + "\n4 sayısının adeti\t: " + dortAdet + "\n" + (birAdet > dortAdet));

	}

}
