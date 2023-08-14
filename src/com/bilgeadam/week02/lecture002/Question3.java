package com.bilgeadam.week02.lecture002;

public class Question3 {

	/*
	 * Türk lirasını "amount" olarak alalım. Dolara çevirelim.
	 * 
	 */

	public static void main(String[] args) {

		double tl = 100;
		double dolarKuru = 26.11;
		double exchange;
		exchange = tl / dolarKuru;
		System.out.println(tl + " TL: " + exchange + " dolara eşittir.");

	}

}
