package com.bilgeadam.week10.lecture003;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
 * Ogretmen sinifini thread yapalim.
 * 
 * run metodunu ezelim. Run metodu 10 kere calissin. Cikti olarak;
 * 
 * ogretmeninismi ->>> 1. ogrencinin notlarini okudu;
 * ogretmeninismi ->>> 2. ogrencinin notlarini okudu;
 * 
 * OgretmenTest'de 2 adet ogretmen olusturalim ve threadleri calistiralim.
 * 
 */

public class Ogretmen extends Thread {

	String name;
	List<Ogrenci> ogrenciler = new ArrayList<>();
	BufferedReader bufferedReader;

	public Ogretmen(String name, BufferedReader bufferedReader) {
		super();
		this.name = name;
		this.bufferedReader = bufferedReader;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " hoca " + (i + 1) + ". ogrencinin sinavlarini okudu.");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private double ortHesapla(List<String> asList) {
		return asList.subList(1, asList.size()).stream()
				.collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));
	}
}
