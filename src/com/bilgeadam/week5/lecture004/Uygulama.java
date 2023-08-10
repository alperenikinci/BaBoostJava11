package com.bilgeadam.week5.lecture004;

import java.util.Scanner;

public class Uygulama {
	/*
	 * 
	 * Menu; KULLANICI KAYIT SISTEMI******* 1- Kayıt ol 2- Giriş yap 3-
	 * Kullanıcıları göster 4- Çıkış
	 * 
	 * 
	 * 1- Menuyu olusturalım 2- Menuden secim yap 3- Yapilan secime gore aksiyon
	 * alinabilecek bir tema olustur.
	 * 
	 * Case 1 kayitOl() metodunun içini yaz. kullaniciEkle() Database sinifinda
	 * listeBoyutunuArtir(); =>>> liste.length-2 kadar veri barindirdigi zaman,
	 * listenin boyutunu 5 artirsin.
	 * 
	 */

	Scanner scanner = new Scanner(System.in);

	public void application() { // static olduğu için bir sınıf metodudur.

		int secim;
		do {
			menu();
			secim = secimYap();
			switch (secim) {
			case 1:
				kayitOl();
				break;
			case 2:
				girisYap();
				break;
			case 3:
				kullanicilariGoster();
				break;
			case 4:
				System.err.println("Uygulamadan Cikis Yapildi");
				break;
			default:
				System.err.println("Lutfen gecerli bir secim yapiniz..!");
			}

		} while (secim != 4);

	}

	private void kullanicilariGoster() {
		Kullanici[] kullanicilar = Database.kullaniciListesi;

		for (int i = 0; i < Database.uzunluk; i++) {
			System.out.println(kullanicilar[i].id + " " + kullanicilar[i].isim + " " + kullanicilar[i].email);
		}

	}

	private void girisYap() {
		int sayac = 3;
		while (sayac != 0) {
			System.out.print("Lutfen email giriniz : ");
			String email = scanner.nextLine();
			System.out.print("Lutfen sifrenizi giriniz : ");
			String sifre = scanner.nextLine();
			if (!Database.kullaniciVarMi(email, sifre)) {
				System.err.println("Email ya da sifre hatali!!! ");
				System.out.println(sayac + " deneme hakkiniz kaldi.");
				sayac--;
			} else {
				break;
			}
		}
	}

	private void kayitOl() {
		Kullanici kullanici = new Kullanici();
		System.out.print("Lutfen adinizi giriniz : ");
		kullanici.isim = scanner.nextLine();
		System.out.print("Lutfen mailinizi giriniz : ");
		kullanici.email = scanner.nextLine();
		System.out.print("Lutfen bir sifre giriniz : ");
		kullanici.sifre = scanner.nextLine();
		kullanici.id = Database.uzunluk + 1;
		Database.kullaniciEkle(kullanici);
	}

	private void menu() {
		System.out.println("*********************************");
		System.out.println("**** KULLANICI KAYIT SISTEMI ****");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1- Kayit ol");
		System.out.println("2- Giris yap");
		System.out.println("3- Kullanicilari goster");
		System.out.println("4- Cikis Yap");
	}

	private int secimYap() {
		System.out.print("Lutfen bir secim yapiniz : ");
		int secim = scanner.nextInt();
		scanner.nextLine();
		return secim;
	}

}
