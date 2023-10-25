package com.bilgeadam.odevkontrol;

public class Test {

	public static void main(String[] args) {

		Yaris yaris = new Yaris();

		yaris.kosucular.forEach(kosucu -> {
			Thread thread = new Thread(kosucu);
			thread.start();
		});

	}

}