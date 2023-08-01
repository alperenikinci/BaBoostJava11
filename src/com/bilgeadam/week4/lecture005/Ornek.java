package com.bilgeadam.week4.lecture005;

public class Ornek {
//	int[] sayiDizisi = { 1, 2 };
//	System.out.println(sayiDizisi.length);
//	int[] tmp = { 1, 2, 5 };
//
//	sayiDizisi = tmp;
//
//	System.out.println(sayiDizisi.length);
//	for (int i = 20; i < 40; i++)
//		System.out.println(i);
	public static void main(String[] args) {

		int[][] matris = new int[5][5];
		method5(method4(method3(method2(method1(matris)))));
	}

	public static String method1(int[][] matris) {
		return "";
	}

	public static boolean method2(String kelime) {

		return true;
	}

	public static int method3(boolean kontrol) {

		return 0;
	}

	public static long method4(int sayi) {

		return 0;
	}

	public static void method5(long sayi) {
	}

}
