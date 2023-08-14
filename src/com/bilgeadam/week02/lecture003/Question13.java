package com.bilgeadam.week02.lecture003;

import java.util.Scanner;

public class Question13 {

	/*
	 * Dışarıdan taban değeri ve üs isimli 2 tane değişken alınacak. (2 üzeri 5
	 * gibi) tabanın kuvvetini hesaplamak istiyorum.
	 * 
	 * Kullanıcıya ismi sorulacak. Aldığım isim değişkeniyle birlikte sonucu
	 * yazdıracağım.
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir taban degeri giriniz : ");
		int tabanDegeri = scanner.nextInt();
		System.out.print("Lutfen bir us degeri giriniz : ");
		int us = scanner.nextInt();
		scanner.nextLine();
		int i = 1;
		int sonuc = 1;

		while (i <= us) {
			sonuc *= tabanDegeri;
			i++;
			System.out.println(sonuc);
		}

		System.out.print("Lutfen isminizi girin : ");
		String isim = scanner.nextLine();

		System.out.println(isim + " Girdiğin taban : " + tabanDegeri + " Girdiğin üs : " + us + " sonuc : " + sonuc);

	}

}
