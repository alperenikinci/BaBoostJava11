package com.bilgeadam.week10.lecture005.openclosed;

/*
 * 
 * 1-ResimBoyutlandirma sinifina bir metot yazalim. 
 * Bu metot bizden instagrami alacak, bir "String type" alacak. type eger jpg ise kucultme katsayisi 38,
 * png ise 30 olsun, diger durumlarda da 40 olsun. 
 * 
 * 2- Yeni bir sosyal medya uygulamasi daha eklendi. facebook'un kucultme katsayisi jpg icin 34,
 * png 37, diger durumlarda 45;
 * 
 * 3- Ucuncu bir sosyal medya uygulamasi ekledik. Whatsapp kucultme katsayisi jpg icin 28, png icin 32, diger durumlarda 36;
 * 
 * sorunumuz: her sosyal medya eklendiginde ResimBoyutlandirma sinifindaki boyutlandirma2 metoduna yeni
 * if else yapilari eklemek zorunda kaliyoruz. Bu sorunu nasil giderebiliriz?
 * 
 */

public class Instagram extends SosyalMedya {

	@Override
	public void boyutlandirma(String type) {
		if (type.equals("jpg")) {
			setKucultmeKatsayisi(38);
		} else if (type.equals("png")) {
			setKucultmeKatsayisi(30);
		} else {
			setKucultmeKatsayisi(40);
		}

	}

}
