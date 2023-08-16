package com.bilgeadam.week07.lecture003.footballapp;

public class Test {

	public static void main(String[] args) {
		Takim takim = new Takim("Takim 1");

		System.out.println(takim.getKaleci());
		for (Futbolcu futbolcu : takim.getFutbolcular()) {
			System.out.println(futbolcu);
		}
	}

}
