package com.bilgeadam.week10.lecture003;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
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
 * Ogretmenler ayni dosya uzerinde okuma yapip okuduklari veriyi kendi siniflari icerisindeki ogrenci listesine ekleyecekler. 
 * Bunu da bir thread yapisi ile gerceklestirecegiz.
 * OgretmenTest'de 2 adet ogretmenimiz olacak. Bunlari thread olacak calistiracagiz. 
 * Hangi ogretmenin kac tane ogrencinin notunu okudugunu yazdiracagiz.
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
		try {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] array = line.split(","); // {Alperen,100,100,100}
				double ort = ortHesapla(Arrays.asList(array));
				Ogrenci ogrenci = new Ogrenci(array[0], ort);
				ogrenciler.add(ogrenci);
				System.out.println(name + " ===> " + ogrenci.getName() + " adli ogrenciyi ekledi...");
				try {
					sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private double ortHesapla(List<String> asList) {
		return asList.subList(1, asList.size()).stream()
				.collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));
	}
}
