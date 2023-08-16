package com.bilgeadam.week07.lecture002.arraylistornekler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListOrnek2 {

	/*
	 * 
	 * 1tane tek sayilar 1 tane çift sayılar için bir liste olusturalim
	 * 
	 * sonra 35 tane random sayiyi çift ise çiftlere tek ise teklere atalim
	 * 
	 * en sonunda tekler ve çiftler listesini yazdiralim
	 * 
	 * 
	 */

	public static void main(String[] args) {

		List<Integer> tekSayilar = new ArrayList<>();
		List<Integer> ciftSayilar = new ArrayList<>();

		for (int i = 0; i < 35; i++) {
			int sayi = randomSayi();

			if (sayi % 2 == 0) {
				ciftSayilar.add(sayi);
			} else {
				tekSayilar.add(sayi);
			}
		}

//		for (int i = 0; i < tekSayilar.size(); i++) {
//			System.out.println(tekSayilar.get(i));
//		}
		System.out.println("Tek sayilar : " + tekSayilar);

//		for (Integer ciftSayi : ciftSayilar) {
//			System.out.println(ciftSayi);
//		}

		System.out.println("Cift sayilar : " + ciftSayilar);

	}

	public static int randomSayi() {
		Random random = new Random();
		return random.nextInt(500);
	}

}
