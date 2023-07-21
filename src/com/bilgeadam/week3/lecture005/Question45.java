package com.bilgeadam.week3.lecture005;

import java.util.Scanner;

public class Question45 {

	// Türkçe karakterleri İngilizce karakterlere çevirme

	/**
	 * 
	 * Bir metot yazalım. metot arraylerimizin ikisini de alsın.
	 * 
	 * daha sonra metodun içinde bir string değer alalım.
	 * 
	 * sonra Türkçe karakterleri İngilizce karakterlere dönüştürüp, dönüştürülmüş
	 * hali geri dönelim.
	 * 
	 * döndüğümüz String değerini main metotta yazdıralım.
	 * 
	 */

	public static void main(String[] args) {
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

		System.out.println(changeString(ingilizceKarakter, turkceKarakter));

//		String kelime = "Alperen";
//		kelime = kelime.replace('E', 'A');
//		System.out.println(kelime);

	}

	public static String changeString(String[] eng, String[] tr) {
		Scanner scanner = new Scanner(System.in);
		String kelime = scanner.nextLine();

		for (int i = 0; i < tr.length; i++) {

			kelime = kelime.replace(tr[i], eng[i]);

		}
		scanner.close();
		return kelime;

	}

}
