package com.bilgeadam.week05.lecture004;

public class Database {
	/*
	 * 
	 * fieldlar(isim,email,şifre,id)
	 * 
	 * 
	 * database isimli bir sınıf oluşturalım, Bu database sınıfında bir kullanıcı
	 * listesi olsun. Burada bir metot yazalım ve 3 adet kullanıcı ekleyelim.
	 * 
	 * TestDatabase isimli main sınıfta çalıştıralım.
	 */

	static Kullanici[] kullaniciListesi = new Kullanici[5];
	static int uzunluk = 0;

	public static void kullaniciEkle(Kullanici kullanici) {

		if (uzunluk >= kullaniciListesi.length - 2) {
			listeBoyutunuArtir();
		}

		if (uzunluk < kullaniciListesi.length) {
			kullaniciListesi[uzunluk] = kullanici;
			uzunluk++;
		}
	}

	private static void listeBoyutunuArtir() {

		Kullanici[] tmp = new Kullanici[kullaniciListesi.length + 5];
		for (int i = 0; i < kullaniciListesi.length; i++) {
			tmp[i] = kullaniciListesi[i];
		}
		kullaniciListesi = tmp;

	}

	public static boolean kullaniciVarMi(String email, String sifre) {

		for (int i = 0; i < kullaniciListesi.length; i++) {
			if (kullaniciListesi[i] != null) {
				if (kullaniciListesi[i].email.equalsIgnoreCase(email) && kullaniciListesi[i].sifre.equals(sifre)) {
					System.out.println("Hosgeldiniz =>>> " + kullaniciListesi[i].isim);
					return true;
				}
			}
		}
		return false;
	}
}