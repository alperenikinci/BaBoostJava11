package com.bilgeadam.week09.lecture004;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateOrnek {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();
		System.out.println(date1); // YIL-AY-GUN
		LocalDate date2 = LocalDate.of(2023, 12, 10);
		System.out.println(date2);

		long gun = date1.until(date2, ChronoUnit.DAYS);
		System.out.println(gun);
		long hafta = date1.until(date2, ChronoUnit.WEEKS);
		System.out.println(hafta);
		long ay = date1.until(date2, ChronoUnit.MONTHS);
		System.out.println(ay);
		long yil = date1.until(date2, ChronoUnit.YEARS);
		System.out.println(yil);
//		System.out.println(date2.plusDays(25));
//		System.out.println(date2.plusMonths(2));
//		System.out.println(date2.plusWeeks(8));
//		System.out.println(date2.plusYears(2));
//		System.out.println(date2.minusDays(5));
//		System.out.println("Yil : " + date2.getYear());
//		System.out.println("Ay : " + date2.getMonthValue()); // date2.getMonth bana ayi ismiyle doner.
//		System.out.println("Gun : " + date2.getDayOfMonth());
//		System.out.println("Yılın kacinci gunu : " + date2.getDayOfYear());
//		System.out.println("Gunun adi : " + date2.getDayOfWeek());
//		System.out.println(date1.isBefore(date2));
//		System.out.println(date1.isAfter(date2));
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Lutfen yil giriniz : ");
//		int yil = scanner.nextInt();
//		System.out.print("Lutfen ay giriniz : ");
//		int ay = scanner.nextInt();
//		System.out.print("Lutfen gun giriniz : ");
//		int gun = scanner.nextInt();

//		LocalDate date3 = LocalDate.of(yil, ay, gun);
//		System.out.println(date3);
//
//		LocalDate date4 = LocalDate.parse("2023-07-10");
//		System.out.println(date4);

//		LocalDate date5 = LocalDate.parse(scanner.nextLine());
//		System.out.println(date5);

	}

}
