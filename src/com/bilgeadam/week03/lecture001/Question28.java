package com.bilgeadam.week03.lecture001;

public class Question28 {

	/**
	 * 
	 * =Java,React,Spring
	 * 
	 * split kullanmadan virgülden bölüp
	 * 
	 * bir for döngüsü içinde Java React Spring
	 * 
	 *
	 */

	public static void main(String[] args) {

		String deger = "Java,React,Spring";

		int index = 0;
		for (int i = 0; i < deger.length(); i++) {

			if (deger.charAt(i) == ',') {
				System.out.println(deger.substring(index, i));
				index = i + 1;
			}
		}

		System.out.println(deger.substring(index));
		System.out.println("///////////////////////////////");
		for (int i = 0; i < deger.length(); i++) {

			if (deger.charAt(i) == ',') {
				System.out.println();
			} else {
				System.out.print(deger.charAt(i));
			}
		}
		System.out.println();
		System.out.println("///////////////////////////////");

		deger = deger.replace(",", "\n");
		System.out.println(deger);
	}

}
