package com.bilgeadam.week09.lecture004;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DogumGunu {

	/*
	 * Disaridan String olarak dogum gunu aliniz.
	 * 
	 * daha sonra dogdunuz gunden bu gune kadar kac yil, kac gun, kac hafta, kac ay
	 * gectigini hesaplayip yazdirin.
	 * 
	 * bir sonraki dogum gununuze kac gun kaldigini hesaplayin.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir dogum gunu tarihi giriniz : ");
		LocalDate dogumGunu = LocalDate.parse(scanner.nextLine());

//		System.out.print("Dogdugunuz yil : ");
//		String dgYil = scanner.nextLine();
//		System.out.print("Dogdugunuz ay : ");
//		String dgAy = scanner.nextLine();
//		if (Integer.parseInt(dgAy) < 10) {
//			dgAy = "" + 0 + Integer.parseInt(dgAy);
//		}
//
//		System.out.print("Dogdugunuz gun : ");
//		String dgGun = scanner.nextLine();
//		if (Integer.parseInt(dgGun) < 10) {
//			dgGun = "" + 0 + Integer.parseInt(dgGun);
//		}
//
//		LocalDate dogumGunu2 = LocalDate.parse(dgYil + "-" + dgAy + "-" + dgGun);

		LocalDate now = LocalDate.now();
		long yil = dogumGunu.until(now, ChronoUnit.YEARS);
		long ay = dogumGunu.until(now, ChronoUnit.MONTHS);
		long hafta = dogumGunu.until(now, ChronoUnit.WEEKS);
		long gun = dogumGunu.until(now, ChronoUnit.DAYS);

		System.out.println(
				"Bugune kadar : " + yil + " yil, " + ay + " ay, " + hafta + " hafta, " + gun + " gun yasamissiniz.");

		LocalDate sonrakiDogumGunu = dogumGunu.plusYears(yil + 1);
		System.out.println(sonrakiDogumGunu);
		long fark = now.until(sonrakiDogumGunu, ChronoUnit.DAYS);
		System.out.println("Sonraki dogum gununuze : " + fark + " gun kaldi.");

	}

}
