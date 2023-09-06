package com.bilgeadam.week10.lecture003;

public class ThreadTest {

	public static void main(String[] args) {
		Calisan calisan1 = new Calisan("Alperen");
		Calisan calisan2 = new Calisan("Muhammet");

		calisan1.start();
		calisan2.start();

	}

}
