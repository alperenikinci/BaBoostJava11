package com.bilgeadam.week02.lecture002;

public class Question4 {

	/*
	 * 
	 * İki tane string değişken oluşturalım. isim ve soyisim olsun. Sonra bu
	 * değişkenleri bir şekilde ekrana yazdıralım.
	 * 
	 * a ve b karakterlerinin değerini yazdırın. Sonra da karakter değer toplamını
	 * yazdıralım.
	 * 
	 */

	public static void main(String[] args) {
		String isim = "Alperen";
		String soyisim = "İkinci";
		String isimSoyisim = "isim: " + isim + ", soyisim: " + soyisim;

		System.out.println(isimSoyisim);

		// System.out.println("isim: " + isim);
		// System.out.println("soyisim: " + soyisim);
		System.out.println("###Alt satır kırılımı###");
		System.out.println("isim: " + isim + "\nsoyisim: " + soyisim);

		// ctrl + shift + 7
		char a = 'a';
		char b = 'b';
		System.out.println("ASCII a: " + (int) a + "\nASCII b: " + (int) b);
		System.out.println(a + b);
		System.out.println('a' + 'b');
	}

}
