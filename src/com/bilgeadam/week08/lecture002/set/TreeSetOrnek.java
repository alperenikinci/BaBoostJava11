package com.bilgeadam.week08.lecture002.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOrnek {

	/*
	 * 
	 * klavyeden rastgele 10 tane sayi alip bunlarin ciktisini ver.
	 * 
	 * Lutfen bir sayi giriniz : 15 Lutfen bir sayi giriniz : 10 Lutfen bir sayi
	 * giriniz : 17 Lutfen bir sayi giriniz : 6 Lutfen bir sayi giriniz : 17 Lutfen
	 * bir sayi giriniz : 30 Lutfen bir sayi giriniz : 3 Lutfen bir sayi giriniz : 2
	 * Lutfen bir sayi giriniz : 9 Lutfen bir sayi giriniz : 55
	 * 
	 */

	static Scanner scanner;
	static Set<Integer> sayilar = new HashSet<>(); // karisik bir sekilde ilk buldugu degerden son degere kadar
													// getiriyor.
	static Set<Integer> ekledigimSiraIle = new LinkedHashSet<>(); // verileri hangi sira ile girdiysem o sira ile
																	// getiriyor.
	static Set<Integer> kucuktenBuyuge = new TreeSet<>(); // Girilen verileri sirali bir sekilde doner.

	static Set<Ogrenci> ogrenciSet = new TreeSet<>();

	public static void main(String[] args) {
//		sayiEkle();
//		yazdir(sayilar);
//		System.out.println();
//		yazdir(ekledigimSiraIle);
//		System.out.println();
//		yazdir(kucuktenBuyuge);

		ogrenciSet.add(new Ogrenci(100, "Cafer"));
		ogrenciSet.add(new Ogrenci(70, "Alperen"));
		ogrenciSet.add(new Ogrenci(3, "Sedat"));
		ogrenciSet.add(new Ogrenci(150, "Furkan"));
		ogrenciSet.add(new Ogrenci(13, "Zeynep"));
		ogrenciSet.add(new Ogrenci(53, "Banu"));
		ogrenciSet.add(new Ogrenci(40, "Nilsel"));
		
		ogrenciSet.forEach(System.out::println);

	}

	public static void sayiEkle() {
		scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Lutfen bir sayi giriniz : ");
			int sayi = scanner.nextInt();
			sayilar.add(sayi);
			ekledigimSiraIle.add(sayi);
			kucuktenBuyuge.add(sayi);
		}
	}

	public static void yazdir(Set<Integer> set) {
		set.forEach(System.out::println);
	}

}
