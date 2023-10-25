package com.bilgeadam.week10.lecture004.yuzmetrekosu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		long baslangicZamani = System.currentTimeMillis();
		List<Kosucu> kosucular = new ArrayList<>();
//		Thread thread;
		for (int i = 1; i < 11; i++) {
			Kosucu kosucu = new Kosucu("Kosucu " + i, baslangicZamani);
			kosucular.add(kosucu);
		}

		for (Kosucu kosucu : kosucular) {
//			thread = new Thread(kosucu);
//			thread.start();
			kosucu.start();
		}

		for (Kosucu kosucu : kosucular) {
			try {
				kosucu.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("### Yuz Metre Kosusu Sonuclari ###");
		kosucular.stream().sorted(Comparator.comparingDouble(kosucu -> kosucu.getSure())).forEach(System.out::println);

	}

}
