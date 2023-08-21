package com.bilgeadam.week08.lecture001.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RamazanPidesiKuyrugu {

	/*
	 * 
	 * String bir kuyruk tanimlayalim.
	 * 
	 * bu kuyruga 10-12 tane isim ekleyelim.
	 * 
	 * random 1-10 arasi pide uretelim.
	 * 
	 * kuyruga gore pideleri dagitmaya baslayalim.
	 * 
	 * pidelerini alanlari, pideler bittigi zaman pide alamayip kuyrukta kalanlari
	 * yazdiralim.
	 * 
	 */

	Queue<String> pideKuyrugu = new LinkedList<>();

	public RamazanPidesiKuyrugu() {
		kuyrukOlustur();
	}

	public static void main(String[] args) throws InterruptedException {
		RamazanPidesiKuyrugu ramazanPidesiKuyrugu = new RamazanPidesiKuyrugu();
		ramazanPidesiKuyrugu.pideDagit();
		ramazanPidesiKuyrugu.geriyeKalanlar();
	}

	private void kuyrukOlustur() {
		pideKuyrugu.offer("Berhan");
		pideKuyrugu.offer("Banu");
		pideKuyrugu.offer("Veysel");
		pideKuyrugu.offer("Nilsel");
		pideKuyrugu.offer("Ugur");
		pideKuyrugu.offer("Sedat");
		pideKuyrugu.offer("Alperen");
		pideKuyrugu.offer("Mert");
		pideKuyrugu.offer("Sevilay");
		pideKuyrugu.offer("Ugur");
		pideKuyrugu.offer("Berke");
		pideKuyrugu.offer("Atakan");
	}

	public void pideDagit() throws InterruptedException {
		Random random = new Random();
		int pideSayisi = random.nextInt(1, 15);
		System.out.println("Pideler cikiyor...");
		Thread.sleep(2000);
		System.out.println("Cikan pide sayisi : " + pideSayisi);

		for (int i = 0; i < pideSayisi; i++) {
			if (!pideKuyrugu.isEmpty()) {
				System.out.println(pideKuyrugu.poll() + " pidesini aldi...");
			}
		}
	}

	public void geriyeKalanlar() {
		if (pideKuyrugu.isEmpty()) {
			System.out.println("Pidesini almayan musteri kalmadi...");
		} else {
			System.out.println("Pideler bitti. Pide alamayanlar : ");
			pideKuyrugu.forEach(System.out::println);
		}
	}

}
