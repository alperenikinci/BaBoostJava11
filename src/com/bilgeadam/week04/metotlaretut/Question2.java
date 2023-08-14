package com.bilgeadam.week04.metotlaretut;

public class Question2 {
	/*
	 * 
	 * int[] alperen = {5,10,25,10,500,1000} int[] muhammet = {10,15,1000,300,1200}
	 * int[] ugurcan = {2000}
	 * 
	 * 2000 tl ve üzeri sepet tutarına ulaşanlara %10 indirim. 2500 tl ve üzeri
	 * sepet tutarına ulaşanlara %12.5 indirim.
	 * 
	 * sepetinde 1000 tl ve üzeri ve 5 üründen fazla ürün olan kullanıcılara ekstra
	 * %5 indirim. (Sepet fiyatı üzerinden uygulanacak)
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] alperen = { 5, 10, 25, 10, 500, 1000 }; // {1550,6}
		int[] muhammet = { 10, 15, 1000, 300, 1200 };
		int[] ugurcan = { 2000 };
		int[] zeynep = { 2000, 5000, 3000, 1500, 7000 };

//		int[] alperenPriceAndQuantity = calculatePriceAndQuantity(alperen);
//		int[] muhammetPriceAndQuantity = calculatePriceAndQuantity(muhammet);
//		int[] ugurcanPriceAndQuantity = calculatePriceAndQuantity(ugurcan);
//
//		System.out.println(alperenPriceAndQuantity[0]);
//		System.out.println(muhammetPriceAndQuantity[0]);
//		System.out.println(ugurcanPriceAndQuantity[0]);

		int[] person = zeynep;

		System.out.println("Sepet tutarı = " + calculatePriceAndQuantity(person)[0]);
		System.out.println(
				"Sepet fiyatı üzerinden indirim = " + discountOverCartPrice(calculatePriceAndQuantity(person)));
		System.out.println("Sepetteki ürün adedi ve sepet tutarı üzerinden indirim = "
				+ discountOverQuantities(calculatePriceAndQuantity(person)));

		System.out.println("Ödemeniz gereken tutar = " + discountedCartPrice(calculatePriceAndQuantity(person)[0],
				discountOverCartPrice(calculatePriceAndQuantity(person)),
				discountOverQuantities(calculatePriceAndQuantity(person)))

		);

	}

	public static int[] calculatePriceAndQuantity(int[] cart) {

		int price = 0;
		int quantity = cart.length;
		int[] priceAndQuantity = new int[2];
		for (int i = 0; i < cart.length; i++) {
			price += cart[i]; // toplam = toplam + cart[i];
		}
		priceAndQuantity[0] = price;
		priceAndQuantity[1] = quantity;

		return priceAndQuantity;
	}

	// 2000 tl ve üzeri sepet tutarına ulaşanlara %10 indirim. 2500 tl ve üzeri
	// sepet tutarına ulaşanlara %12.5 indirim.
	// {1550,6}
	public static double discountOverCartPrice(int[] priceAndQuantities) {
		double discountRatio;
		if (priceAndQuantities[0] >= 2500) {
			discountRatio = 0.125; // discountRatio = discountRatio + 0.10 // discountRatio = 0.10
		} else if (priceAndQuantities[0] >= 2000) {
			discountRatio = 0.10;
		} else {
			discountRatio = 0;
		}
		return priceAndQuantities[0] * discountRatio; // Kampanya Sona erdi
		// return priceAndQuantities[0] * 0;
	}

	// sepetinde 1000 tl ve üzeri ve 5 üründen fazla ürün olan kullanıcılara ekstra
	// %5 indirim. (Sepet fiyatı üzerinden uygulanacak)

	public static double discountOverQuantities(int[] priceAndQuantites) {
		double discountRatio;
		if (priceAndQuantites[0] >= 1000 && priceAndQuantites[1] >= 5) {
			discountRatio = 0.05;
		} else {
			discountRatio = 0;
		}
		return discountRatio * priceAndQuantites[0]; // Kampanya Sona Erdi
		// return 0 * priceAndQuantites[0];
	}

	public static double discountedCartPrice(int cartPrice, double discountOverPrice, double discountOverQuantity) {

		return cartPrice - discountOverPrice - discountOverQuantity;
	}

}
