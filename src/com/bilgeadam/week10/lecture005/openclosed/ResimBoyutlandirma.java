package com.bilgeadam.week10.lecture005.openclosed;

public class ResimBoyutlandirma {

	// Instagram icin kucultme katsayisi belirleyen bir metot.
	/*
	 * 
	 * * ResimBoyutlandirma sinifina bir metot yazalim. Bu metot bizden instagrami
	 * alacak, bir "String type" alacak. type eger jpg ise kucultme katsayisi 38,
	 * png ise 30 olsun, diger durumlarda da 40 olsun.
	 */
	public void boyutlandirma(Instagram instagram, String type) {
		if (type.equals("jpg")) {
			instagram.setKucultmeKatsayisi(38);
		} else if (type.equals("png")) {
			instagram.setKucultmeKatsayisi(30);
		} else {
			instagram.setKucultmeKatsayisi(40);
		}
	}

	public void boyutlandirma2(SosyalMedya sosyalMedya, String type) {

		if (sosyalMedya instanceof Instagram) {
			if (type.equals("jpg")) {
				sosyalMedya.setKucultmeKatsayisi(38);
			} else if (type.equals("png")) {
				sosyalMedya.setKucultmeKatsayisi(30);
			} else {
				sosyalMedya.setKucultmeKatsayisi(40);
			}
		} else if (sosyalMedya instanceof Facebook) {
			if (type.equals("jpg")) {
				sosyalMedya.setKucultmeKatsayisi(34);
			} else if (type.equals("png")) {
				sosyalMedya.setKucultmeKatsayisi(37);
			} else {
				sosyalMedya.setKucultmeKatsayisi(45);
			}
		}
	}

	public void boyutlandirma3(SosyalMedya sosyalMedya, String type) {
		sosyalMedya.boyutlandirma(type);
		// Instagram, Facebook, WhatsApp ucune de esnek bir sekilde erisim imkani
		// sagladim.
	}

}
