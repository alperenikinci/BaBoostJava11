package com.bilgeadam.week10.lecture003;

public class Calisan extends Thread {

	String name;

	public Calisan(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " calisiyor ->>>" + (i + 1));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void calis() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " calis metodu ->>>" + (i + 1));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
