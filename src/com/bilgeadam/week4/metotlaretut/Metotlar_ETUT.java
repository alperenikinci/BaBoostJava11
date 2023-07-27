package com.bilgeadam.week4.metotlaretut;

public class Metotlar_ETUT {
	/**
	 * 
	 * Java'da metotlar, programların tekrar kullanılabilir ve yapılandırılmış bir
	 * şekilde kodlanmasına olanak tanıyan temel yapı taşlarıdır. Metotlar, belirli
	 * bir görevi yerine getiren ve bir isim altında toplanan bir dizi işlemdir. Bu,
	 * kodun daha temiz, düzenli ve anlaşılır olmasına yardımcı olur ve aynı işlevi
	 * birden fazla kez çağırmanıza olanak tanır.
	 * 
	 * 1- Parametreli metotlar 2- Parametresiz metotlar 3- Geri dönüş tipi olan
	 * metotlar 4- Geri dönüş tipi olmayan metotlar (Void)
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String isim = "Sevilay";
		String isim2 = "Nilsel";
		String isim3 = "Veysel";

		System.out.println("Merhaba " + isim + " programa hoşgeldin.");
		System.out.println("Merhaba " + isim2 + " programa hoşgeldin.");
		System.out.println("Merhaba " + isim3 + " programa hoşgeldin.");

//		merhaba1(isim);
//		merhaba1(isim2);
//		merhaba1(isim3);
	}

	public static void merhaba() {
		System.out.println("Merhaba programa hoşgeldiniz.");
	}

	public static void merhaba1(String isim) {
		System.out.println("Merhaba " + isim + " programa hoşgeldin!");
	}

}
