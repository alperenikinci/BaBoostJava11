package com.bilgeadam.week08.lecture004;

import java.util.Random;
import java.util.Scanner;

public class Utility {

	static Scanner scanner = new Scanner(System.in);

	public static String stringDegerAlma(String sorgu) {
		System.out.print(sorgu);
		return scanner.nextLine();
	}

	public static int intDegerAlma(String sorgu) {
		System.out.print(sorgu);
		return Integer.parseInt(scanner.nextLine());
	}

	public static int randomSayiUret(int baslangic, int bitis) {
		Random random = new Random();
		return random.nextInt(baslangic, bitis);
	}

}
