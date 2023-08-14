package com.bilgeadam.week02.lecture002;

public class Question2 {

	/*
	 * Bir ürünün fiyatında %18 KDV ve %15 KAR olduğunu biliyoruz. bir ürün fiyatım
	 * olsun. bu ürün fiyatından ham fiyatını bulalım.
	 * 
	 */

	public static void main(String[] args) {
		float rawPrice = 0, price = 100, priceWithoutVat;
		priceWithoutVat = price / 1.18f;
		System.out.println("KDV'siz fiyat: " + priceWithoutVat);
		rawPrice = priceWithoutVat / 1.15f;
		System.out.println("Ham fiyat: " + rawPrice);
	}

}
