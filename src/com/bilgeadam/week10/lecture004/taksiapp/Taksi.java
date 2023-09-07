package com.bilgeadam.week10.lecture004.taksiapp;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Taksi implements Runnable {

	int id;
	List<Integer> musteriNolar;
	long beklemeZamani;

	public Taksi(int id) {
		super();
		this.id = id;
		this.musteriNolar = new LinkedList<Integer>();
		Random random = new Random();
		this.beklemeZamani = random.nextLong(1000, 5001);
	}

	@Override
	public void run() {
		while (!Durak.musteriKuyrugu.isEmpty()) {
			int musteriId = Durak.musteriKuyrugu.poll();
			musteriNolar.add(musteriId);
			System.out.println(this.id + ". Taksi " + musteriNolar.size() + ". musterisini aldi ->>>"
					+ " musteri id'si ->>" + musteriId);
			try {
				Thread.sleep(beklemeZamani);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 1 nolu taksi toplamda -> 20 tane musteri aldi ve mesaisi sona erdi.
		System.out.println(
				this.id + " nolu taksi toplamda -> " + musteriNolar.size() + " musteri aldi ve mesaisi sona erdi...");

	}
}
