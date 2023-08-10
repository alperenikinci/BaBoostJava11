package com.bilgeadam.week5.lecture003;

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
	static int uzunluk = 1;

	public static void kullanicilariOlustur() {

		Kullanici kullanici = new Kullanici();
		kullanici.isim = "Zeynep";
		kullanici.email = "zeynep@hotmail.com";
		kullanici.sifre = "123";
		kullanici.id = uzunluk;
		kullaniciListesi[0] = kullanici;
		uzunluk++;

		Kullanici kullanici2 = new Kullanici();
		kullanici2.isim = "Alperen";
		kullanici2.email = "alperen@hotmail.com";
		kullanici2.sifre = "123";
		kullanici2.id = uzunluk;
		kullaniciListesi[1] = kullanici2;
		uzunluk++;

		Kullanici kullanici3 = new Kullanici();
		kullanici3.isim = "Ugur";
		kullanici3.email = "ugur@hotmail.com";
		kullanici3.sifre = "123";
		kullanici3.id = uzunluk;
		kullaniciListesi[2] = kullanici3;
		uzunluk++;
	}
}