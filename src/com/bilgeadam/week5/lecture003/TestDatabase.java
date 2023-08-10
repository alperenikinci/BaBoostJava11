package com.bilgeadam.week5.lecture003;

public class TestDatabase {

	public static void main(String[] args) {

//		Database database = new Database();
//		database.kullanicilariOlustur();
		Database.kullanicilariOlustur();
		Kullanici[] kullanicilar = Database.kullaniciListesi;
		for (int i = 0; i < kullanicilar.length; i++) {
			if (kullanicilar[i] != null) {
				System.out.println(kullanicilar[i].isim + " " + kullanicilar[i].id);
			}
		}
		Database database2 = new Database();
		for (int i = 0; i < database2.kullaniciListesi.length; i++) {
			if (kullanicilar[i] != null) {
				System.out.println(database2.kullaniciListesi[i].isim + " " + database2.kullaniciListesi[i].id);
			}
		}
	}

}
