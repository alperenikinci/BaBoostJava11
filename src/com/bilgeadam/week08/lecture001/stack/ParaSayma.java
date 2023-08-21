package com.bilgeadam.week08.lecture001.stack;

import java.util.Stack;

public class ParaSayma {

	/*
	 * 
	 * bir stack olusturalim. Bu stack'e 5-6 tane deger ekleyelim.
	 * 
	 * 100 tl'den yuksek olanlari toplam degerine ekleyelim, kucuk olanlari ise
	 * baska bir stack'e ekleyelim. En sonunda toplami ve yeni olustrudugumuz
	 * stack'i yazdiralim.
	 * 
	 */

	public static void main(String[] args) {
		// Last in First out ->> Son giren ilk cikar...
		Stack<Integer> paralar = new Stack<>();
		int toplam = 0;
		Stack<Integer> yuzTldenKucukParalar = new Stack<>();

//		for (int i = 0; i < 6; i++) {
//			paralar.push(Utility.intDegerAlma("Lutfen sayi giriniz : "));
//		}

		paralar.push(120);
		paralar.push(50);
		paralar.push(170);
		paralar.push(15);
		paralar.push(80);
		paralar.push(200);

		while (!paralar.isEmpty()) {
			if (paralar.peek() > 100) {
				toplam += paralar.pop();
			} else {
				yuzTldenKucukParalar.push(paralar.pop());
			}
		}

		System.out.println("toplam = " + toplam);
		System.out.println();

		System.out.println(yuzTldenKucukParalar); // 1;
		System.out.println();

		for (Integer para : yuzTldenKucukParalar) { // for each ->> her bir "..." icin.
			System.out.println(para);
		}
		System.out.println();

		yuzTldenKucukParalar.forEach(System.err::println);

		System.out.println(paralar);

	}

}
